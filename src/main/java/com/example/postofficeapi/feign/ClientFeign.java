package com.example.postofficeapi.feign;

import com.example.postofficeapi.response.ClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("client-core-api")
public interface ClientFeign {

    @GetMapping("client/check")
    String checkClient();

    @GetMapping("client/{clientId}")
    ClientResponse getClientById(@PathVariable String clientId);

    @GetMapping("client/all")
    List<ClientResponse> getAllClients();

}
