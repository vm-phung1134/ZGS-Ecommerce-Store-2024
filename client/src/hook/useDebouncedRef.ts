import { ref, customRef } from "vue";

type DebounceFunction = (...args: any[]) => void;

const debounce = (
  fn: DebounceFunction,
  delay = 0,
  immediate = false
): DebounceFunction => {
  let timeout: ReturnType<typeof setTimeout>;

  return (...args) => {
    if (immediate && !timeout) fn(...args);

    clearTimeout(timeout);

    timeout = setTimeout(() => {
      fn(...args);
    }, delay);
  };
};

const useDebouncedRef = (
  initialValue: string,
  delay: number,
  immediate: boolean
) => {
  const state = ref(initialValue);

  const debouncedRef = customRef((track, trigger) => ({
    get() {
      track();
      return state.value;
    },
    set: debounce(
      (value: string) => {
        state.value = value;
        trigger();
      },
      delay,
      immediate
    ),
  }));

  return debouncedRef;
};

export default useDebouncedRef;
