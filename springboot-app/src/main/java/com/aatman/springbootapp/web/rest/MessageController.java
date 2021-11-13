package com.aatman.springbootapp.web.rest;

import com.aatman.springbootapp.model.Message;
import com.aatman.springbootapp.model.MessageRepository;
import com.aatman.springbootapp.web.service.MessageService;
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

    @Autowired
    MessageService messageService;

    @GetMapping(path="/add")
    public @ResponseBody String addNewMessage (@RequestParam String data,
                                               @RequestParam Integer user_id) throws Exception {
        String response = messageService.addMessage(data, user_id);
        return response;
    }
}
