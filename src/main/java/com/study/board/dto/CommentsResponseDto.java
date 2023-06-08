package com.study.board.dto;

import com.study.board.entity.Comments;
import lombok.Getter;

@Getter
public class CommentsResponseDto {
    private Long id;
    private String comment;
    private Long postsId;

    /*
    Entity -> Dto
     */
    public CommentsResponseDto(Comments comments){
        this.id = comments.getId();
        this.comment = comments.getComment();
        this.postsId = comments.getPosts().getId();
    }
}
