package com.study.board.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto { //post를 업데이트하는 요청에 쓰는 dto
    /*Posts entity의 column 중에 쓸 것만 가져오기*/
    private String title;
    private String content;
    private String author;
    private Long likecount;
    private Long viewcount;

    @Builder
    public PostsUpdateRequestDto(String title, String content, String author, Long likecount, Long viewcount){
        this.title = title;
        this.content = content;
        this.author = author;
        this.likecount = likecount;
        this.viewcount = viewcount;
    }
}
