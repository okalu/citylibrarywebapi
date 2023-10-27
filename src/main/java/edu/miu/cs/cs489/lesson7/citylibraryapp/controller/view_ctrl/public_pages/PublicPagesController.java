package edu.miu.cs.cs489.lesson7.citylibraryapp.controller.view_ctrl.public_pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {""})
public class PublicPagesController {
    
    @GetMapping(value = {"", "/", "/home"})
    public String displayHomePage() {
        return "public/index";
    }

    @GetMapping(value = {"/about"})
    public String displayAboutPage() {
        return "public/about";
    }

    @GetMapping(value = {"/citylibrary/api/v1/index"})
    public String displayWebAPIsPage() {
        return "public/webapi-ui/index";
    }
}
