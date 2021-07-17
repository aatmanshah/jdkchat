package com.aatman.springbootapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity // This tells Hibernate to make a table out of this class
public class Message {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer message_id;

    private String message;

    private Integer user_id;

    private LocalDateTime timestamp;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setDateTime(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getMessageId() {
        return message_id;
    }

    public void setMessageId(Integer id) {
        this.message_id = id;
    }

    public String getData() {
        return message;
    }

    public void setData(String name) {
        this.message = name;
    }

    public Integer getUserId() {
        return user_id;
    }

    public void setUserId(Integer userId) {
        this.user_id = userId;
    }
}
