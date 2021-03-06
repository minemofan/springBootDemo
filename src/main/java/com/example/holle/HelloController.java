package com.example.holle;

import com.example.prop.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/11.
 * Description 全局的配置文件读取
 *  1、@RestController 继承 @Controller ,解整合了@Controller和@ResponseBody。
 */
@RestController
public class HelloController
{

    @Autowired
    private HelloProperties helloProperties;

    @RequestMapping("/hello")
    public String index(){
        System.out.println("进入controller!"+ helloProperties.getName());
        return helloProperties.getName();
    }

}
