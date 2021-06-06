package com.clien.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clien.demo.model.Trainee;
@Repository("traineeDao")
public interface TraineeJPARepository extends JpaRepository<Trainee, Integer> {

}
