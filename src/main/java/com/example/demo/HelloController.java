package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController{


    @GetMapping(value = "/krish")
    public String helloAPI(@RequestParam(value = "id")Integer id){
        try {
            System.out.println("reached app server :: Req Id = "+id +" starts");

            Thread.sleep(Long.parseLong("10000"));
            System.out.println("reached app server :: Req Id = "+id +" ends");
        }catch (Exception ex){
            System.err.println("exception ::"+ex.getMessage());
        }
        return "reached app server :: Req Id = "+id +" ends";
    }


}