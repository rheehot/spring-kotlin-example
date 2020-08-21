package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * @author Geonguk Han
 * @since 2020-08-21
 */
@Controller
class HelloController {

    @GetMapping("/")
    @ResponseBody
    fun home(model: Model): String {
        model["name"] = "andrew"
        return "hello world"
    }
}