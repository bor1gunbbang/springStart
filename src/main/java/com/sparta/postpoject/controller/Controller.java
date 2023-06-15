package com.sparta.postpoject.controller;

import com.sparta.postpoject.dto.PostRequestDto;
import com.sparta.postpoject.dto.PostResponseDto;
import com.sparta.postpoject.entity.Post;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class Controller {
    Scanner scan = new Scanner(System.in);

    private final Map<Long, Post> postList = new HashMap<>();// 일단 DB열할을 함

    @PostMapping("/posts") //게시글 작성
    public PostResponseDto createPost(@RequestBody PostRequestDto requestDto) {


        //RequestDto -> Entity
        Post post = new Post(requestDto);


        //Post Max ID check
        Long maxId = postList.size() > 0 ? Collections.max(postList.keySet()) + 1 : 1;
        post.setId(maxId);
        //DB에 저장
        postList.put(post.getId(), post);
        //Entity -> ResponseDto
        PostResponseDto postResponseDto = new PostResponseDto(post);
        return postResponseDto;
    }

    @GetMapping("/posts")
//    @ResponseBody//html같은 파일이아니라 메서드 문자열을 반환하는것을 말한다.
    public List<PostResponseDto> getPosts() {
        //조회하기
        //Map To List
        List<PostResponseDto> responseList = postList.values().stream(). // values()내부의모든 데이터를 가져온다.  stream for문과 비슷
                map(PostResponseDto::new).toList();// new 미리 생성해둔 생성자 타입으로 만들어진다.

        return responseList;
    }

//    @GetMapping("/posts/{id}")
//    public void choosePostView(){
//        //선택한 게시글 조회
//        return;
//    }
//
//    @PutMapping("/posts/{id}")
//    public void editPost(){
//        //선택 게시글 수정 후 저장
//        return;
//    }
//    @DeleteMapping("/posts/{id}")
//    public void deletePost(){
//        //선택 게시글 삭제
//        return;
//    }


}
