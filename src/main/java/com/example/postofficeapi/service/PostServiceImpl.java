package com.example.postofficeapi.service;

import com.example.postofficeapi.feign.ClientFeign;
import com.example.postofficeapi.feign.PostFeign;
import com.example.postofficeapi.response.PostRawResponse;
import com.example.postofficeapi.response.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostFeign postFeign;

    @Autowired
    ClientFeign clientFeign;

    @Override
    public List<PostResponse> getAllPostResponses() {
        List<PostRawResponse> postRawResponseList = postFeign.getAllPosts();
        List<PostResponse> postResponseList = new ArrayList<>();
        for (PostRawResponse post :
                postRawResponseList) {
            postResponseList.add(getOnePostResponse(post.getPostId()));
        }
        return postResponseList;
    }

    @Override
    public PostResponse getOnePostResponse(String postId) {
        PostRawResponse post = postFeign.getPostById(postId);
        PostResponse postResponse = new PostResponse(
                    post.getPostId(),
                    clientFeign.getClientById(post.getClientId()),
                    clientFeign.getClientById(post.getPostRecipientId()),
                    post.getPostItem(),
                    post.getStatus()
        );
        return postResponse;
    }
}
