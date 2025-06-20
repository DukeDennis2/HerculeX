package com.fitnesstracker.HerculeX.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitnesstracker.HerculeX.Model.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}