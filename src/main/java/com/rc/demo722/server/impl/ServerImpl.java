package com.rc.demo722.server.impl;

import com.rc.demo722.dao.Mapper;
import com.rc.demo722.server.Server;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ServerImpl implements Server {

    @Autowired(required = false)
    private Mapper mapper;

    @Override
    public List<Map<String, Object>> gainMessage(String message) {
        String index="name";
        if (message.equals(index)) {
            return mapper.gainName();
        }
        else{
            return mapper.gainID();
        }
    }

    @Override
    public List<Map<String,Object>> gainID(){
        return mapper.gainID();
    }

    @Override
    public List<Map<String,Object>> gainName(){
        return mapper.gainName();
    }

    @Override
    public int deleteMessage(){
        return mapper.deleteMessage();
    }

    @Override
    public int updateMessage(String id){
        return mapper.updateMessage(id);
    }

    @Override
    public int insertMessage(Map<String,Object> array){
        return mapper.insertMessage(array);
    }
}
