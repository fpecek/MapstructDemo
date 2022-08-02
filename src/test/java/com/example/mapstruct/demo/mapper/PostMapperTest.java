package com.example.mapstruct.demo.mapper;

import com.example.mapstruct.demo.dto.PostCommentsResponseDto;
import com.example.mapstruct.demo.domain.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {
        PostMapperImpl.class
})
public class PostMapperTest {

    @Autowired
    private PostMapper mapper;

    @Test
    public void testPostMapper() {
        // given
        final Post post = createNewPost();

        // when
        final PostCommentsResponseDto postCommentsResponseDto = mapper.postPostCommentsResponseDtoMapper(post);

        // then
        assertNotNull(postCommentsResponseDto);
        assertFalse(postCommentsResponseDto.getComments().isEmpty());
    }

    public Post createNewPost() {
        final Post post = new Post();
        post.setPostComments(createPostComment());

        return post;
    }

    public List<PostComment> createPostComment() {
        return List.of(new PostComment(1L, "Test1", new User(1L , "username1"), createUpvotes1(), createDownVotes1()),
                new PostComment(2L, "Test2", new User(2L ,"username2"), createUpvotes2(), createDownVotes2()));
    }

    private List<PostCommentUpvote> createUpvotes1() {
        return List.of(new PostCommentUpvote(1L), new PostCommentUpvote(2L));
    }

    private List<PostCommentUpvote> createUpvotes2() {
        return List.of(new PostCommentUpvote(3L), new PostCommentUpvote(4L));
    }

    private List<PostCommentDownvote> createDownVotes1() {
        return List.of(new PostCommentDownvote(1L), new PostCommentDownvote(2L));
    }

    private List<PostCommentDownvote> createDownVotes2() {
        return List.of(new PostCommentDownvote(3L), new PostCommentDownvote(4L));
    }
}
