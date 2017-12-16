package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hehd on 2017/4/6.
 *
 * @author 何海东
 */
@Controller//控制层的扫描不能少
public class ControllerTest {

    @RequestMapping("hello")//访问的地址
    public String Hello(){

        return "index";
    }
}
