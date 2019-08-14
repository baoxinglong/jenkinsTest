package com.example.controller;

import com.example.dao.p.UserRepository;
import com.example.dao.s.MessageRepository;
import com.example.demo.p.User;
import com.example.demo.s.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;
    @RequestMapping("/")
    public String hello(){


            userRepository.save(new User("1"));
            userRepository.save(new User("2"));
            userRepository.save(new User("3"));
            userRepository.save(new User("4"));
            userRepository.save(new User("5"));

            System.out.println(userRepository.findAll().size());

            messageRepository.save(new Message("aaaaaaaaaa"));
            messageRepository.save(new Message("bbbbbbbbbb"));
            messageRepository.save(new Message("cccccccccc"));


            System.out.println(messageRepository.findAll().size());

        return "hello world:构建成功";
    }
}
