package com.example.mapstruct.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class PostCommentResponseDto {
    private Long id;
    private String comment;
    private String username;
    private List<PostCommentUpvoteResponseDto> postCommentUpvotes;
    private List<PostCommentDownvoteResponseDto> postCommentDownvotes;

}
