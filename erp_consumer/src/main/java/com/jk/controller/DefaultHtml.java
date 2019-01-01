/** 
 * 文件名称:DefaultHtml.java 
 * 包名:com.jk.controller 
 * 创建日期:2018年12月16日下午6:16:03 
 * Copyright (c) 2018,  All Rights Reserved.</pre> 
 */  
package com.jk.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/** 
 * <pre>项目名称：springboot-demo    
 * 类名称：DefaultHtml    
 * 创建人：王赛  
 * 创建时间：2018年12月16日 下午6:16:03     
 * @version </pre>    
 */
@Configuration
public class DefaultHtml extends WebMvcConfigurerAdapter{

	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
		// login页面在 templates 文件夹下
        registry.addViewController("/").setViewName("/page/toLogin");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }
}
