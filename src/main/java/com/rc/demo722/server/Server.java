package com.rc.demo722.server;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface Server {

    List<Map<String,Object>> gainMessage(String message);
    List<Map<String,Object>> gainID();
    List<Map<String,Object>> gainName();
    int deleteMessage();
    int updateMessage(String id);
    int insertMessage(Map<String,Object> array);

}
