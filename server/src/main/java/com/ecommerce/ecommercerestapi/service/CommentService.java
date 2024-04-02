package com.ecommerce.ecommercerestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.Comment;
import com.ecommerce.ecommercerestapi.entity.Product;
import com.ecommerce.ecommercerestapi.entity.User;
import com.ecommerce.ecommercerestapi.repository.CommentRepository;
import com.ecommerce.ecommercerestapi.repository.ProductRepository;
import com.ecommerce.ecommercerestapi.repository.UserRepository;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;

    public List<Comment> getAllComment(Integer productId) {
        return commentRepository.findByProductId(productId);
    }

    public Comment createComment(Comment comment) {
        if (!comment.equals(null)) {
            Product product = productRepository.findById(comment.getProduct().getId()).orElse(null);
            User user = userRepository.findById(comment.getUser().getId()).orElse(null);

            comment.setProduct(product);
            comment.setUser(user);
            Comment newComment = commentRepository.save(comment);
            return newComment;
        }
        return null;
    }

    public Boolean deleteComment(Integer id) {
        commentRepository.deleteById(id);
        boolean isCommentDeleted = !commentRepository.existsById(id);
        if (isCommentDeleted) {
            return true;
        }
        return false;
    }

    public Double getAverageStar(Integer productId) {
        List<Comment> comments = commentRepository.findByProductId(productId);
        Double averageStar = comments.stream()
                .mapToDouble(Comment::getQuantityStar)
                .average()
                .orElse(0.0);
        return Math.round(averageStar * 10.0) / 10.0;
    }

}
