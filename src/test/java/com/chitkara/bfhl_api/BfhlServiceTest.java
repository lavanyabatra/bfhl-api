package com.chitkara.bfhl_api;

import com.chitkara.bfhl_api.dto.RequestDTO;
import com.chitkara.bfhl_api.dto.ResponseDTO;
import com.chitkara.bfhl_api.service.impl.BfhlServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BfhlServiceTest {

    @Test
    void testProcessData() {

        BfhlServiceImpl service = new BfhlServiceImpl();

        RequestDTO request = new RequestDTO();
        request.setData(Arrays.asList("a", "1", "334", "4", "R", "$"));

        ResponseDTO response = service.processData(request);

        assertEquals("339", response.getSum());
    }
}