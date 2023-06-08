package com.study.board.dto;

import com.study.board.entity.Posts;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class PostsResponseDto {  //클라이언트에게 응답.
    private Long id;
    private String title;
    private String content;
    private String author;
    private Long likecount;
    private Long viewcount;
    private List<CommentsResponseDto> commentsList;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.likecount = entity.getLikecount();
        this.viewcount = entity.getViewcount();
        this.commentsList = entity.getCommentsList().stream().map(CommentsResponseDto::new).collect(Collectors.toList());
    }
}
