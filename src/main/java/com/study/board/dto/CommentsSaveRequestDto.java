package com.study.board.dto;

import com.study.board.entity.Comments;
import com.study.board.entity.Posts;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentsSaveRequestDto {
    private Long id;
    private String comment;
    private Posts posts;
    private LocalDateTime created_date;
    private LocalDateTime modified_date;

    /*
    Dto -> Entity
     */
    public Comments toEntity(){
        Comments comments = Comments.builder()
                .id(id)
                .comment(comment)
                .posts(posts)
                .build();
        return comments;
    }
}
