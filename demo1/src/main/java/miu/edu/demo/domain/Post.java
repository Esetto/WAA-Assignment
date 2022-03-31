package miu.edu.demo.domain;

import lombok.Data;

@Data
public class Post {
    int id;
    String title;
    String content;
    String author;

    public Post(int id, String title, String content, String author) {
        this.id=id;
        this.title=title;
        this.content=content;
        this.author=author;
    }
}
