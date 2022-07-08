package com.example.postofficeapi.service;

import com.example.postofficeapi.feign.PostFeign;
import com.example.postofficeapi.response.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PostService {

    List<PostResponse> getAllPostResponses();
    PostResponse getOnePostResponse(String postId);

}
