package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("emailbox")
public class EmailBoxController {
    @GetMapping
    public ModelAndView showEmailBox(){
        return new ModelAndView("emailbox");
    }
}
