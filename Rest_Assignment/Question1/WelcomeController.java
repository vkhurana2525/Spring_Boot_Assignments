package com.example.Rest_Assignment.Rest_Assignment.Question1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/class")--> this will apply mapping to all the methods of the class
public class WelcomeController {

    @RequestMapping(method = RequestMethod.GET,path="/welcome")
    public String Welcome(){
        return "Welcome to SpringBoot";
    }

//    This is for returning in JSON FORMAT
//    @GetMapping("/helloworld")
//    public WelcomeBean fun(){
//        return new WelcomeBean("Hello to spring");
//    }


}
//class WelcomeBean{
//    private String msg;
//    public WelcomeBean(String msg){
//        this.msg=msg;
//
//    }
//
//    public String getmsg(){
//        return this.msg;
//    }
//
//    public String toString(){
//        return this.msg;
//    }
//}