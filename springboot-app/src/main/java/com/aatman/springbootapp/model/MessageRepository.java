package com.aatman.springbootapp.model;

import org.springframework.data.repository.CrudRepository;

import com.aatman.springbootapp.model.Message;
public interface MessageRepository extends CrudRepository<Message, Integer> {

}

