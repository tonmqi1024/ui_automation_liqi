package com.test.day09;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * @author 歪歪欧巴
 * @Description TODO
 * @date 2021/11/5 21:17
 * @Copyright 湖南省零檬信息技术有限公司. All rights reserved.
 */
public class JsonTest {
    public static void main(String[] args) throws IOException {
        //=========================序列化====================
        //Jackson库的使用
        //一、JAVA对象-->json字符串
        //1、实例化ObjectMapper对象
        //ObjectMapper mapper = new ObjectMapper();
        //序列化 Java对象 --> JSON/YAML/XML
        //Java对象对应的类编写要求：类属性+get/set方法+无参构造/有参构造
        //2、生成Java对象
        /*Student student = new Student("张三",20);
        //3、转换 Java对象-->json
        String jsonStr = mapper.writeValueAsString(student);
        System.out.println(jsonStr);*/

        //二、HashMap-->Json字符串
        /*HashMap<String,Object> hashMap = new HashMap<String, Object>();
        hashMap.put("phone","13323234545");
        hashMap.put("password",123456);
        hashMap.put("age",20);
        hashMap.put("height",179.99);
        String jsonStr = mapper.writeValueAsString(hashMap);
        System.out.println(jsonStr);*/

        //==========================反序列化======================
        /*String jsonStr = "{\"phone\": \"13323234545\",\"password\": 123456,\"height\": 179.99}";
        //1、Json转成Java对象
        ObjectMapper mapper = new ObjectMapper();
        //2、通过readValue反序列化
        Info info = mapper.readValue(jsonStr,Info.class);
        System.out.println(info.getPhone());
        System.out.println(info.getPassword());
        System.out.println(info.getHeight());*/

        //json数据保存在文件中的情况
        /*ObjectMapper mapper = new ObjectMapper();
        Info info = mapper.readValue(new File("test.json"),Info.class);
        System.out.println(info.getPhone());
        System.out.println(info.getPassword());
        System.out.println(info.getHeight());*/

        //Json转成HashMap(Java集合类)
        /*String jsonStr = "{\"phone\": \"13323234545\",\"password\": 123456,\"height\": 179.99}";
        ObjectMapper objectMapper = new ObjectMapper();
        HashMap<String,Object> hashMap = objectMapper.readValue(jsonStr,HashMap.class);
        System.out.println(hashMap.get("phone"));
        System.out.println(hashMap.get("password"));
        System.out.println(hashMap.get("height"));*/

        //复杂的json结构解析
        ObjectMapper mapper = new ObjectMapper();
        StudentInfo student = mapper.readValue(new File("student.json"), StudentInfo.class);
        System.out.println(student.getName());
        System.out.println(student.getStudents());
    }
}
