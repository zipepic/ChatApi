package com.example.chatapi.controllers;

import com.example.chatapi.model.Quote;
import com.example.chatapi.services.ChatGPTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quotes")
public class ThemeChatGPTController {
    private final ChatGPTService chatGPTService;
    @Autowired
    public ThemeChatGPTController(ChatGPTService chatGPTService) {
        this.chatGPTService = chatGPTService;
    }

    @GetMapping
    public List<Quote> getQuotesByTheme(@RequestParam("theme") String theme) {
        return chatGPTService.getText(theme);
    }
}

