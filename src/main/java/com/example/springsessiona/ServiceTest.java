package com.example.springsessiona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContext;

/**
 * 类名： ServiceTest
 * 描述 TODO：
 * 创建时间： 2022/4/7 16:29
 * 创建人： Administrator
 */
@Service
public class ServiceTest {
    @Autowired
    private ServletContext servletContext;

    public void testServletContext()
    {
        System.out.println(servletContext);
    }
}
