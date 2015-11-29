package com.weishubin.test.validate;

import com.weishubin.test.common.dto.folder.FolderReqDTO;
import org.hibernate.validator.internal.engine.ValidatorImpl;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * 使用Java的Validator框架和Hibernate Validator框架实现Bean的验证
 */
public class ValidateTest {
    public static void main(String[] args) {
        ValidatorImpl d;
        FolderReqDTO folderReqDTO = new FolderReqDTO();

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        System.out.println(validator.getClass());
        Set<ConstraintViolation<FolderReqDTO>> set = validator.validate(folderReqDTO);
        System.out.print(set.iterator().next().getMessage());
    }
}
