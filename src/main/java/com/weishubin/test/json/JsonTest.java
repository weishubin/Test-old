package com.weishubin.test.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weishubin.test.common.bean.Sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by weishubin on 15/11/21.
 */
public class JsonTest {
    public static void main(String[] args) throws IOException {
        List<ValueDTO> list = new ArrayList<ValueDTO>();
        ValueDTO valueDTO = new ValueDTO();
        valueDTO.setValue("test");
        list.add(valueDTO);
        ListDTO<ValueDTO> listDTO = new ListDTO<ValueDTO>();
        listDTO.setList(list);

        String json = JsonMapper.nonEmptyMapper().toJson(listDTO);
        System.out.println(json);

        json = "{\"list\":[{\"value\":\"test\"}]}";
        ListDTO l = JsonMapper.nonEmptyMapper().fromJson(json, ValueListDTO.class);
        System.out.println(l.getList().get(0).getClass());

    }
}
