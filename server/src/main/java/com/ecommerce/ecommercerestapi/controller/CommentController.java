package com.ecommerce.ecommercerestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ecommerce.ecommercerestapi.core.ConstantMsg;
import com.ecommerce.ecommercerestapi.entity.Comment;
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.CommentService;

@RestController
@RequestMapping("/api/user-comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping(value = "/createNewComment")
    public ApiResponse<String> createNewComment(@RequestBody Comment comment) {
        if (comment.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to add to comment!");
        } else {
            commentService.createComment(comment);
            return new ApiResponse<String>(
                    HttpStatus.CREATED.value(),
                    ConstantMsg.CREATED_MSG,
                    "Create comment successfully");
        }
    }

    @DeleteMapping(value = "/{commentId}")
    public ApiResponse<String> deleteComment(@PathVariable Integer commentId) {
        Boolean isCommentDeleted = commentService.deleteComment(commentId);
        if (!isCommentDeleted) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to delete comment!");
        }
        return new ApiResponse<String>(
                HttpStatus.OK.value(),
                ConstantMsg.DELETED_MSG,
                "Delete comment successfully");
    }

    @GetMapping(value = "/getAllComment/{productId}")
    public ApiResponse<List<Comment>> getAllComment(@PathVariable Integer productId) {
        List<Comment> comments = commentService.getAllComment(productId);
        return new ApiResponse<List<Comment>>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                comments);
    }

    @GetMapping(value = "/get-star/{productId}")
    public ApiResponse<Double> getAverageStar(@PathVariable Integer productId) {
        Double avgStar = commentService.getAverageStar(productId);
        return new ApiResponse<Double>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                avgStar);
    }
}
