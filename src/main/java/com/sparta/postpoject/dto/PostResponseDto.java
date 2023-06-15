package com.sparta.postpoject.dto;

import com.sparta.postpoject.entity.Post;
import lombok.Getter;

@Getter
public class PostResponseDto {
    private Long id;
    private String username;
    private String contents;
    private Double password;
    private String title;

    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.username = post.getUsername();
        this.contents = post.getContents();
        this.password = post.getPassword();
        this.title = post.getTitle();
    }


}
