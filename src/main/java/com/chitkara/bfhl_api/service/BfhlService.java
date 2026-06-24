package com.chitkara.bfhl_api.service;

import com.chitkara.bfhl_api.dto.RequestDTO;
import com.chitkara.bfhl_api.dto.ResponseDTO;

public interface BfhlService {

    ResponseDTO processData(RequestDTO request);

}
