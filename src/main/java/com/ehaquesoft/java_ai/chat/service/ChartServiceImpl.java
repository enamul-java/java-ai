package com.ehaquesoft.java_ai.chat.service;


import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaChatOptions;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ChartServiceImpl implements ChatService {

    @Autowired
    OllamaChatModel model;

    @Override
    public String ask(String promptMessage) {
        ChatResponse response = model.call(
                new Prompt(
                        promptMessage,
                        OllamaChatOptions.builder()
                                .model(OllamaModel.GEMMA3)
                                .temperature(0.4)
                                .build()
                ));

        return Objects.requireNonNull(response.getResult()).getOutput().getText();
    }
}
