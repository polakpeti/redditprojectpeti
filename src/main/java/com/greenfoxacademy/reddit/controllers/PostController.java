package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.dpo.PostsDto;
import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {
    private PostRepository postRepository;

    @Autowired
    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/post")
    public ResponseEntity<PostsDto> postIt() {
        List<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        Post post2 = new Post();
        posts.add(post1);
        posts.add(post2);
        return new ResponseEntity<>(new PostsDto(posts), HttpStatus.OK);
    }
}
