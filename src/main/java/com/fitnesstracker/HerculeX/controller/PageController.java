package com.fitnesstracker.HerculeX.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";  // loads templates/index.html
    }

    @GetMapping("/progress")
    public String progress() {
        return "progress"; // loads templates/progress.html
    }

    @GetMapping("/workout")
    public String workout() {
        return "workout";  // loads templates/workout.html
    }
}