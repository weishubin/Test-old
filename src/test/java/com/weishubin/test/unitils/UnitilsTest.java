package com.weishubin.test.unitils;

import com.weishubin.test.common.dto.folder.FolderRespDTO;
import com.weishubin.test.json.JsonMapper;
import com.weishubin.test.mock.Service;
import com.weishubin.test.springboot.Application;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.unitils.UnitilsJUnit4;
import org.unitils.reflectionassert.ReflectionAssert;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByType;

/**
 * Created by weishubin on 15/11/28.
 */
@SpringApplicationContext({"unitils-test.xml"})
public class UnitilsTest extends UnitilsJUnit4 {
    @SpringBeanByType
    private RestTemplate restTemplate;

    private String url = "http://localhost:8080/";

    @BeforeClass
    public static void startApplication() {
        //启动Spring Boot
        //SpringApplication.run(AppTest.class, new String[]{});
    }

    @Test
    public void test() {
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("abc", "1");
        String s = restTemplate.getForObject(url, String.class, map);
        FolderRespDTO resp = JsonMapper.nonDefaultMapper().fromJson(s, FolderRespDTO.class);
        System.out.println(JsonMapper.nonDefaultMapper().toJson(resp));
    }
}
