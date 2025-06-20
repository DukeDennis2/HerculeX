package com.fitnesstracker.HerculeX.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private String exercise;
    private int sets;
    private int reps;
    private double weight;

    @Column(length = 1000)
    private String notes;

    // Constructors
    public Workout() {}

    public Workout(String exercise, int sets, int reps, double weight, String notes) {
        this.exercise = exercise;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.notes = notes;
    }

    // Getters and Setters
    // (generate them or use Lombok @Data)
}