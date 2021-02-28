package com.jwd.classroom.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2021-02-28 13:40
 * <p>
 *
 * @author author
 */
@RestController
@RequestMapping("/index")
@Slf4j
public class ClassroomController {

    @RequestMapping("/index")
    public String index(){
        log.info("======测试日志info级别打印=====");
        log.error("======测试日志error级别打印=====");
        log.debug("======测试日志debug级别打印=====");
        log.warn("======测试日志warn级别打印=====");
        return "index";
    }

}
