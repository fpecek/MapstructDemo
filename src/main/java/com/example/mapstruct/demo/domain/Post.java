package com.example.mapstruct.demo.domain;

import lombok.Data;

import java.util.List;

@Data
public class Post {
    private List<PostComment> postComments;
}
