package study.jpaex.domain.posts;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
@SequenceGenerator(name="POST_SEQ_GENERATOR",
        sequenceName="SEQ_POST",
        initialValue=1,
        allocationSize=1)

public class Posts {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,
            generator="POST_SEQ_GENERATOR")

    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(length = 500, nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
