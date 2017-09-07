package com.demo.controller;

import com.demo.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangy
 * @contact QQ 837195190
 * @created by thinkpad on 2017/8/31.
 */
@Controller
public class SampleController {
    @RequestMapping("/")
    String home(){
        return "common/error";
    }

    @RequestMapping("index")
    public String index(Model model){
        Person single = new Person("ww", 18);
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("1", 1);
        Person p2 = new Person("2", 2);
        Person p3 = new Person("3", 3);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people",people);
        return "index/index";
    }

}
