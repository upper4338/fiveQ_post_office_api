package com.example.postofficeapi.response;

import com.example.postofficeapi.feign.ClientFeign;
import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse {
    private String name;
    private String surname;
    private String email;
}
