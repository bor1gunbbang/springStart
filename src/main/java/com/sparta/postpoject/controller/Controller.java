package com.sparta.postpoject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/posts")
    @ResponseBody//html같은 파일이아니라 메서드 문자열을 반환하는것을 말한다.
    public String readList(){
    //전체 게시글 조회
        return "Hello World!!";

    }

    @GetMapping("/posts/{id}")
    public void choosePostView(){
        //선택한 게시글 조회
        return;
    }
    @PostMapping("/posts")
    @ResponseBody
    public void writeAPost(){
        //게시글 작성 후 저장
        return;
    }
    @PutMapping("/posts/{id}")
    @ResponseBody
    public void editPost(){
        //선택 게시글 수정 후 저장
        return;
    }
    @DeleteMapping("/posts/{id}")
    @ResponseBody
    public void deletePost(){
        //선택 게시글 삭제
        return;
    }


}
