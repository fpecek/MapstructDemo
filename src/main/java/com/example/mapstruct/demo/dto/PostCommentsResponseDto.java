package com.example.mapstruct.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class PostCommentsResponseDto {
    private List<PostCommentResponseDto> comments;
    private Integer count;
}
