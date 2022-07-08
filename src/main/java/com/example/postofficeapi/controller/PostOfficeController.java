package com.example.postofficeapi.controller;

import com.example.postofficeapi.feign.ClientFeign;
import com.example.postofficeapi.feign.PostFeign;
import com.example.postofficeapi.response.ClientResponse;
import com.example.postofficeapi.response.PostRawResponse;
import com.example.postofficeapi.response.PostResponse;
import com.example.postofficeapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/post-office")
public class PostOfficeController {

    @Autowired
    PostFeign postFeign;

    @Autowired
    ClientFeign clientFeign;

    @Autowired
    PostService postService;

    @GetMapping("check")
    public String checkPostOffice() {
        return "Post-Office is working";
    }

    @GetMapping("post/check")
    public String checkPost() {
        return postFeign.checkPost();
    }

    @GetMapping("post/all")
    public List<PostResponse> allPosts() {
        return postService.getAllPostResponses();
    }

    @GetMapping("post/{postId}")
    public PostResponse getPostById(@PathVariable String postId) {
        return postService.getOnePostResponse(postId);
    }

    @GetMapping("client/check")
    public String checkClient() {
        return clientFeign.checkClient();
    }

    @GetMapping("client/{clientId}")
    public ClientResponse getClientById(@PathVariable String clientId) {
        return clientFeign.getClientById(clientId);
    }

    @GetMapping("client/all")
    public List<ClientResponse> getAllClients() {
        return clientFeign.getAllClients();
    }

}
