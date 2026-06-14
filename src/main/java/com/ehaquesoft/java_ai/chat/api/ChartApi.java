package com.ehaquesoft.java_ai.chat.api;


import com.ehaquesoft.java_ai.chat.service.ChartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java-ai/v1/chat")
public class ChartApi {

    @Autowired
    ChartServiceImpl service;

    @GetMapping("/test")
    public String chatText(){
        return "Hello World!";
    }

    @GetMapping("/ask/{prompt}")
    public String ask(@PathVariable("prompt") String promptMessage){
        System.out.println("Prompt Message: " + promptMessage);
        return service.ask(promptMessage);
    }
}
