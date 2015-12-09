package com.weishubin.test.springboot.action;

import com.weishubin.test.common.dto.folder.ErrMsg;
import com.weishubin.test.common.dto.folder.FolderReqDTO;
import com.weishubin.test.common.dto.folder.FolderRespDTO;
import com.weishubin.test.json.JsonMapper;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


/**
 * Created by weishubin on 15/11/28.
 */
@RestController
public class RestAction {

    @RequestMapping("/")
    public FolderRespDTO home(@Valid FolderReqDTO req, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println(result.getAllErrors());
        }

        System.out.println(JsonMapper.nonDefaultMapper().toJson(req));

        FolderRespDTO resp = new FolderRespDTO();
        resp.setCost(Double.parseDouble("0.01"));
        resp.setId(258639);
        ErrMsg e = new ErrMsg();
        e.setCode(-203);
        e.setDesc("can't create folder with that flags");
        e.setProvider("folder");
        resp.setE(e);

        return resp;
    }


    @RequestMapping("/e")
    public void error() {
        throw new RuntimeException();
    }
}
