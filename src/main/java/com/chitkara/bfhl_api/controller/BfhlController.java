package com.chitkara.bfhl_api.controller;

import com.chitkara.bfhl_api.dto.RequestDTO;
import com.chitkara.bfhl_api.dto.ResponseDTO;
import com.chitkara.bfhl_api.service.BfhlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bfhl")
public class BfhlController {

    @Autowired
    private BfhlService bfhlService;

    @PostMapping
    public ResponseEntity<ResponseDTO> processData(
            @RequestBody RequestDTO request) {

        ResponseDTO response =
                bfhlService.processData(request);

        return ResponseEntity.ok(response);
    }
}
