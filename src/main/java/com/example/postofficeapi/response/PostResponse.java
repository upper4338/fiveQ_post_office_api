package com.example.postofficeapi.response;

import com.example.postofficeapi.feign.ClientFeign;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {
    private String postId;
    private ClientResponse client;
    private ClientResponse receiver;
    private String postItem;
    private String status;

}
