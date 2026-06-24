package com.chitkara.bfhl_api.service.impl;

import com.chitkara.bfhl_api.dto.RequestDTO;
import com.chitkara.bfhl_api.dto.ResponseDTO;
import com.chitkara.bfhl_api.service.BfhlService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public ResponseDTO processData(RequestDTO request) {

        List<String> oddNumbers = new ArrayList<>();
        List<String> evenNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();

        long sum = 0;

        StringBuilder letters = new StringBuilder();

        for (String item : request.getData()) {

            if (item.matches("\\d+")) {

                long num = Long.parseLong(item);

                sum += num;

                if (num % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }

            } else if (item.matches("[a-zA-Z]+")) {

                alphabets.add(item.toUpperCase());

                letters.append(item);

            } else {

                specialCharacters.add(item);
            }
        }

        ResponseDTO response = new ResponseDTO();

        response.setIs_success(true);

        response.setUser_id("lavanya_batra_24062026");

        response.setEmail("lavanya.batra@example.com");

        response.setRoll_number("2410999999");

        response.setOdd_numbers(oddNumbers);

        response.setEven_numbers(evenNumbers);

        response.setAlphabets(alphabets);

        response.setSpecial_characters(specialCharacters);

        response.setSum(String.valueOf(sum));

        response.setConcat_string(generateConcat(letters.toString()));

        return response;
    }

    private String generateConcat(String input) {

        String reversed = new StringBuilder(input).reverse().toString();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {

            if (i % 2 == 0) {
                result.append(Character.toUpperCase(reversed.charAt(i)));
            } else {
                result.append(Character.toLowerCase(reversed.charAt(i)));
            }
        }

        return result.toString();
    }
}