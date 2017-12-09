package com.core.controller;

import com.core.pojo.dto.TestUserDTO;
import com.core.service.impl.TestUserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created on 2016-01-01
 * <p>Title:       增删改查Demo</p>
 * <p>Description: 增加、删除、修改、简单查询、service-dao事务、service-bo-dao事务、翻页查询</p>
 * <p>Copyright:   Copyright (c) 2016</p>
 * <p>Company:     科技中心</p>
 * <p>Department:  研发部</p>
 * @author         mosh
 * @version        1.0
 */
@RestController  //@RestController 继承 @Controller ,解整合了@Controller和@ResponseBody。
@RequestMapping(value = "/testuser")
public class TestUserController {

    private static Logger logger = LoggerFactory.getLogger(TestUserController.class);

    // @Autowired
    private TestUserServiceImpl iTestUserService;

    /**
     * Description 基础接口
     * @return
     */
    @RequestMapping(value = "/index" ,method = {RequestMethod.GET,RequestMethod.POST})
    public String getUser(){
        return "Welcome TestUserController!";
    }

    /**
     * Description 定义请求报文为JSON格式
     *      postman  http://localhost:8080/myBoot/testuser/query
     *               {"id":123,"name":"minemofan"}
     * @param testUserDTO
     * @return
     */
    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public String getUserById(@RequestBody TestUserDTO testUserDTO){
        logger.info("testUserDTO:"+ testUserDTO);
        return "Welcome TestUserController！id:"+ testUserDTO.getName();
    }





}
