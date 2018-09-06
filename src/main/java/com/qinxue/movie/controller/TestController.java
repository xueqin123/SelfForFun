package com.qinxue.movie.controller;

import com.alibaba.fastjson.JSON;
import com.qinxue.movie.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
//    @Resource
//    TableIpService service;

    @RequestMapping(value = "/ReqAndRep/name/second.action", method = RequestMethod.GET, produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String reqAndrep(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String url = request.getParameter("url");
        logger.info("reqAndrep() name " + name + "url = " + url);
        String name2 = name + "->(from Java)";
        String url2 = name + "->(from Java)";
        User user1 = new User(name2, url2);
        String jsonString = JSON.toJSONString(user1);
        return jsonString;
    }

    @RequestMapping(value = "/ReqAndRep/name/secondjump.action", method = RequestMethod.POST)
    public String jump(HttpServletRequest request, HttpServletResponse response) {
        return "second";
    }
}
