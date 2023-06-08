package com.study.board.controller;

import com.study.board.dto.CommentsSaveRequestDto;
import com.study.board.service.CommentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/posts")
public class CommentsController {
    private final CommentsService commentsService;

    /*댓글 작성*/
    @PostMapping("/{id}/comments")
    public Long commentSave(@PathVariable Long id, @RequestBody CommentsSaveRequestDto dto){
        return commentsService.commentSave(id, dto);
    }

}
