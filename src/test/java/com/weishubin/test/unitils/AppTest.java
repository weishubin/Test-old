package com.weishubin.test.unitils;

import com.weishubin.test.springboot.Application;
import org.mybatis.spring.MyBatisExceptionTranslator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.orm.hibernate4.HibernateExceptionTranslator;

import javax.sql.DataSource;


/**
 * Created by weishubin on 15/11/28.
 */
@Configuration
@Import(Application.class)
public class AppTest {

    @Bean
    public DataSource dataSource() {
        org.apache.tomcat.jdbc.pool.DataSource ds = new org.apache.tomcat.jdbc.pool.DataSource();
        ds.setUrl("jdbc:h2:mem:unitils");
        return ds;
    }

    public MyBatisExceptionTranslator exceptionTranslator(DataSource ds){
        return new MyBatisExceptionTranslator(ds, true);
    }
}
