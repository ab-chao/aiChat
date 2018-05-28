package com.aichat.chatCtl.web;

import com.aichat.tuling.inputEntity.TulingEntity;
import com.aichat.tuling.service.TulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 图灵机器人调用控制器
 * 图灵机器人调用控制器
 * @author chaoyalong
 * @date 2018-5-20 1:33
 */
@RestController
@RequestMapping("/tl")
public class TulingController {

    @Autowired
    TulingService service;

    @RequestMapping("/ask")
    public Object doAsk(@RequestBody TulingEntity tuling) {
        return service.getResponse(tuling);
    }
}
