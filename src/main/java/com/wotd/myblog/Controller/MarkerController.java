package com.wotd.myblog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MarkerController {

    @RequestMapping("/hello")
    public String hello(){

//        modelMap.addAttribute("title", "mytitle");
//        modelMap.addAttribute("names", Arrays.asList("dog", "cat"));
        return "hello";
    }
}
