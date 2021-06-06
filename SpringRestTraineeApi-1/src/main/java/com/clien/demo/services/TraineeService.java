package com.clien.demo.services;

import java.util.List;
import java.util.Optional;

import com.clien.demo.model.Trainee;

public interface TraineeService {
	int addTrainees(Trainee t);
	int DeleteTrainees(int tid);
	int ModifyTrainees(Trainee t,int tid);
	Optional<Trainee> retriveTrainees(int tid);
	List<Trainee> retriveAllTrainees();
}