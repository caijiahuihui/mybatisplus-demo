package com.caicai.mybatisplusdemo.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 这个注解就是告诉springboot在容器启动时依赖注入时给JavaBean的配置
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 添加分页过滤器，如果mybatisplus需要使用分页，boot必须添加这个配置
        PaginationInnerInterceptor paginationInnerInterceptor =  new PaginationInnerInterceptor(DbType.MYSQL);
        // 溢出总页数后是否进行处理
        paginationInnerInterceptor.setOverflow(true);
        interceptor.addInnerInterceptor(paginationInnerInterceptor);
        return interceptor;
    }
}
