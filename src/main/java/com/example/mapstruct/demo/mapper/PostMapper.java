package com.example.mapstruct.demo.mapper;

import com.example.mapstruct.demo.dto.PostCommentDownvoteResponseDto;
import com.example.mapstruct.demo.dto.PostCommentResponseDto;
import com.example.mapstruct.demo.dto.PostCommentUpvoteResponseDto;
import com.example.mapstruct.demo.dto.PostCommentsResponseDto;
import com.example.mapstruct.demo.domain.Post;
import com.example.mapstruct.demo.domain.PostComment;
import com.example.mapstruct.demo.domain.PostCommentDownvote;
import com.example.mapstruct.demo.domain.PostCommentUpvote;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface PostMapper {

    @Mapping(source = "postComments", target = "comments")
    @Mapping(target = "count", expression="java(post.getPostComments().size())")
    PostCommentsResponseDto postToCommentsResponseDto(Post post);

    @Mapping(source = "user.username", target = "username")
    PostCommentResponseDto postCommentToPostCommentResponseDto(PostComment postComment);

    List<PostCommentResponseDto> postCommentToPostCommentResponseDto(List<PostComment> postComment);

    PostCommentUpvoteResponseDto postCommentUpvoteToPostCommentUpvoteResponseDto(PostCommentUpvote postCommentUpvote);

    List<PostCommentUpvoteResponseDto> postCommentUpvoteToPostCommentUpvoteResponseDto(List<PostCommentUpvote> postCommentUpvote);

    PostCommentDownvoteResponseDto postCommentDownvoteToPostCommentUpvoteResponseDto(PostCommentDownvote postCommentUpvote);

    List<PostCommentDownvoteResponseDto> postCommentDownvoteToPostCommentUpvoteResponseDto(List<PostCommentDownvote> postCommentUpvote);

}
