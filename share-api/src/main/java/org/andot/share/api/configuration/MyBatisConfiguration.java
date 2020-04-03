package org.andot.share.api.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.andot.share.api.dao")
public class MyBatisConfiguration {
}
