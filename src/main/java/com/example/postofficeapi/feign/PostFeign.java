package com.example.postofficeapi.feign;

import com.example.postofficeapi.response.PostRawResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("post-core-api")
public interface PostFeign {

    @GetMapping("post/check")
    String checkPost();

    @GetMapping("post/all")
    List<PostRawResponse> getAllPosts();

    @GetMapping("post/{postId}")
    PostRawResponse getPostById(@PathVariable String postId);

}
