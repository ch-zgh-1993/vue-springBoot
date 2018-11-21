package com.zgh.controller;/*
 * Created by zgh on 2018-11-21.
 * @author zgh
 * @date 2018-11-21
 * @Description: 
 * @Version: V1.0
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavController {

    @RequestMapping("*")
    public String index(){
        return "index";
    }
}
