package com.study.board.service;

import com.study.board.dto.CommentsSaveRequestDto;
import com.study.board.entity.Comments;
import com.study.board.entity.Posts;
import com.study.board.repository.CommentsRepository;
import com.study.board.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CommentsService {
    private final CommentsRepository commentsRepository;
    private final PostsRepository postsRepository;

    /*CREATE*/
    @Transactional
    public Long commentSave(Long posts_id, CommentsSaveRequestDto dto){
        Posts posts = postsRepository.findById(posts_id).orElseThrow(() -> new IllegalArgumentException("댓글 쓰기 실패: 해당 게시글이 존재하지 않습니다."));
        dto.setPosts(posts);

        Comments comments = dto.toEntity();
        commentsRepository.save(comments);
        return dto.getId();
    }
}
