package com.wotd.myblog.Controller;

import com.wotd.myblog.Model.Post;
import com.wotd.myblog.Repository.PostRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

@Autowired
private PostRepository postRepository;


    @RequestMapping("/")
    public String allPosts(ModelMap model){

        List<Post> posts = postRepository.findAll();
        model.put("posts", posts);

        return "hello";
    }

    @PostMapping("/addPost")
    public String addPost(ModelMap model, Post post){


        Post posts = postRepository.save(post);
        model.put("posts", posts);

        return "redirect:/";
    }


    @GetMapping("/post/{id}")
    public String postDetail(ModelMap model, @PathVariable int id){

        Optional<Post> optionalEntity = postRepository.findById(id);
        Post post = optionalEntity.get();
        model.addAttribute("post", post);
        System.out.println(post);



        return "postDetail";
    }
    @PostMapping("/post/{id}")
    public String updatePost(ModelMap model, @PathVariable int id, Post p){

        Optional<Post> optionalEntity = postRepository.findById(id);
        if(optionalEntity.isEmpty()){
            throw new RuntimeException(("Player with id"+id +"not found"));
        }


        p.setId(id);
        postRepository.save(p);

        return "redirect:/";
    }
    @PostMapping("/post/delete/{id}")
    public String deletePost(ModelMap model, @PathVariable int id){

        postRepository.deleteById(id);

        return "redirect:/";
    }

}
