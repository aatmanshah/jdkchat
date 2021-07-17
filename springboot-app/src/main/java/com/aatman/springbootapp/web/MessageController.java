package com.aatman.springbootapp.web;

import com.aatman.springbootapp.model.Message;
import com.aatman.springbootapp.model.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Instant;
import java.time.LocalDateTime;

@Controller
@RequestMapping(path="/message")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewMessage (@RequestParam String data,
                                               @RequestParam Integer user_id) throws Exception {
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
