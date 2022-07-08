package com.example.postofficeapi.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostRawResponse {
    private String postId;
    private String clientId;
    private String postRecipientId;
    private String postItem;
    private String status;
}
