package com.example.springsessiona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 类名： ControllerTest
 * 描述 TODO：
 * 创建时间： 2022/4/7 14:28
 * 创建人： Administrator
 */
@Controller
public class ControllerTest {

    @Autowired
    private ServletContext servletContext;

    @GetMapping("/")
    @ResponseBody
    public String index(HttpServletRequest req)
    {
        ServletContext sc = req.getServletContext();
        WebApplicationContext webApplicationContext = RequestContextUtils.findWebApplicationContext(req);
        System.out.println("webApplicationContext:"+webApplicationContext);
        webApplicationContext.getServletContext();
        return servletContext.toString();
    }
    @RequestMapping("/add/{name}/{value}")
    @ResponseBody
    public String addSession(HttpServletRequest request, @PathVariable("name") String name, @PathVariable("value") String value){
        HttpSession session = request.getSession();
        session.setAttribute(name,value);
        return "sessionId:"+session.getId()+" name:"+name;
    }

    @RequestMapping("/get/{name}")
    @ResponseBody
    public String getSesseion(HttpServletRequest request, @PathVariable("name") String name){
        HttpSession session = request.getSession();
        String value = (String)session.getAttribute(name);
        return "sessionId:"+session.getId()+" value:"+value;
    }
}
