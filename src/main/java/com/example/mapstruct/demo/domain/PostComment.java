package com.example.mapstruct.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PostComment {
    private Long id;
    private String comment;
    private User user;
    private List<PostCommentUpvote> postCommentUpvotes;
    private List<PostCommentDownvote> postCommentDownvotes;
}
