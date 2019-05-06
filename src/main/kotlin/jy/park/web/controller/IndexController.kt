package jy.park.web.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexController {

    @GetMapping("/")
    fun index(model: Model): String {
        model["title"] = "JunyounPark's Intro"
        return "index";
    }


//    @GetMapping("/comeon")
//    fun comeon(model: Model): String {
//        model["title"] = "second page"
//        return "/page1/comeon"
//    }
}