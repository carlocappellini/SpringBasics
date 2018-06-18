package com.spring.spring.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {


    @GetMapping("/posts")
    @ResponseBody
    public String posts(){

        return "All Posts";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public int posts(@PathVariable int id){
        return id;
    }

    @GetMapping("/posts/create/{post}")
    @ResponseBody
    public String createPost(@PathVariable String post){
        return post;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String CreateForm(){
        return "this is supposed to be form";

    }
    @PostMapping("/posts/create")
    @ResponseBody
    public String insert(){
        return "Inserted new post";

    }


}
