package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/","/homepage"})
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "home";
    }
}
