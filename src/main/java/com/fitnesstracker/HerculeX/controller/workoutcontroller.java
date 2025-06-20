package com.fitnesstracker.HerculeX.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fitnesstracker.HerculeX.Model.Workout;
import com.fitnesstracker.HerculeX.Repository.WorkoutRepository;

@Controller
public class WorkoutController {

   @Autowired
    private WorkoutRepository workoutRepo;

    @PostMapping("/add-workout")
    public String addWorkout(@ModelAttribute Workout workout, RedirectAttributes redirectAttributes) {
        workoutRepo.save(workout);
        redirectAttributes.addFlashAttribute("message", "Workout recorded successfully!");
        return "redirect:/history";
    }

    @GetMapping("/history")
    public String showHistory(Model model) {
        model.addAttribute("workouts", workoutRepo.findAll());
        return "history";
    }
}