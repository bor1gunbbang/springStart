package com.sparta.postpoject.entity;

import com.sparta.postpoject.dto.PostRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

@Getter
@Setter
@NoArgsConstructor
public class Post extends Timestamped{
    private Long id;
    private String username;
    private String contents;
    private double password;
    private String title;

    public Post(PostRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.title = requestDto.getTitle();
        this.password = requestDto.getPassword();

    }

    public void update(PostRequestDto requestDto ) {
        this.username = requestDto.getUsername();
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();

    }
}
