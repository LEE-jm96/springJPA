package study.jpaex.service.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.jpaex.domain.posts.PostsRepository;
import study.jpaex.web.dto.PostsSaveRequestDto;

import javax.transaction.TransactionScoped;
import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

}
