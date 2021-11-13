package com.aatman.springbootapp.web.service;

import com.aatman.springbootapp.model.Message;
import com.aatman.springbootapp.model.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public String addMessage(String data, Integer user_id) throws Exception {
        Message message = new Message();
        if(data==null || data == ""){
            throw new Exception("empty message cannot be sent");
        }
        message.setData(data);
        message.setUserId(user_id);
        LocalDateTime dateTime = LocalDateTime.now();
        message.setDateTime(dateTime);
        message.setMessageId(777);
        messageRepository.save(message);

        return "saved";
    }
}
