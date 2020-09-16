package com.rc.demo722.controller;

import com.rc.demo722.server.Server;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class DemoController {

    @Resource
    private Server server;
    
    @RequestMapping(value= "/user",method = RequestMethod.PUT)
    public int query_4(@RequestParam(value = "grade") String grade){
        int index=server.updateMessage(grade);
        return index;
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<Map<String,Object>> query_2(@RequestParam(value="message") String message){
        List<Map<String,Object>> map=new ArrayList<>();
        map = server.gainMessage(message);
        return map;
    }


    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public int query_1(){
        int index=server.deleteMessage();
        return index;
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public int query_3(@RequestBody(required = true) Map<String,Object> map){
        int index=server.insertMessage(map);
        return index;
    }




}
