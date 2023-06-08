package com.study.board.dto;

import com.study.board.entity.Comments;
import com.study.board.entity.Posts;
import lombok.Getter;
import net.bytebuddy.asm.Advice;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime modifiedDate;
    private LocalDateTime createdDate;
    private Long likecount;
    private Long viewcount;
    private List<CommentsResponseDto> commentsList;

    //기존에 있던 값들을 정렬(PostsListResponseDto), 보여주기(PostsResponseDto)는 @Build 어노테이션 사용X. 값 넣어주는 애들만 @build 사용
    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
        this.createdDate = entity.getCreatedDate();
        this.likecount = entity.getLikecount();
        this.viewcount = entity.getViewcount();
        this.commentsList = entity.getCommentsList().stream().map(CommentsResponseDto::new).collect(Collectors.toList());
    }
}
