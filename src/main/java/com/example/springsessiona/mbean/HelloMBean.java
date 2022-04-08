package com.example.springsessiona.mbean;

/**
 * 类名： HelloMBean
 * 描述 TODO：
 * 创建时间： 2022/4/8 10:43
 * 创建人： Administrator
 */
public interface HelloMBean
{
    public String getName();

    public void setName(String name);

    public String getAge();

    public void setAge(String age);

    public void helloWorld();

    public void helloWorld(String str);

    public void getTelephone();
}