package com.itao.study.demo1jenkins.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Auther: taojun
 * @Date: 2020/6/9 10:44
 * @Description:
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    Random random = new Random();

    @RequestMapping("/test1")
    public String test1(){
        int num = random.nextInt(999999999);
        log.info("test.test1 num = {}",num);
        return num+"";
    }
}
