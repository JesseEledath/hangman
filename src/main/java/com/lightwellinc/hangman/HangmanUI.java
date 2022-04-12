package com.lightwellinc.hangman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HangmanUI {

   @RequestMapping("/")
    public String loadPage(String word) {
        return "index.html";
    }


}
