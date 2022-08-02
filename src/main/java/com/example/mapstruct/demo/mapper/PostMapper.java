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
    PostCommentsResponseDto postPostCommentsResponseDtoMapper(Post post);

    @Mapping(source = "user.username", target = "username")
    PostCommentResponseDto postCommentPostCommentResponseDtoMapper(PostComment postComment);

    List<PostCommentResponseDto> postCommentPostCommentResponseDtoMapper(List<PostComment> postComment);

    PostCommentUpvoteResponseDto postCommentUpvotePostCommentUpvoteResponseDto(PostCommentUpvote postCommentUpvote);

    List<PostCommentUpvoteResponseDto> postCommentUpvotePostCommentUpvoteResponseDto(List<PostCommentUpvote> postCommentUpvote);

    PostCommentDownvoteResponseDto postCommentDownvotePostCommentUpvoteResponseDto(PostCommentDownvote postCommentUpvote);

    List<PostCommentDownvoteResponseDto> postCommentDownvotePostCommentUpvoteResponseDto(List<PostCommentDownvote> postCommentUpvote);

}
