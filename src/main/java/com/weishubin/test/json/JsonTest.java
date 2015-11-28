package com.weishubin.test.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weishubin.test.common.bean.Sample;

import java.io.IOException;

/**
 * Created by weishubin on 15/11/21.
 */
public class JsonTest {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Sample s = new Sample();
        s.setName("abc");
        String json = objectMapper.writeValueAsString(s);
        System.out.println(json);



        Sample s1 = objectMapper.readValue(json, Sample.class);
        System.out.print(s1.getName());

    }
}
