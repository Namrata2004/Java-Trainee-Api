package com.clien.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clien.demo.model.Trainee;
import com.clien.demo.services.TraineeServiceImpl;

@RestController
public class TraineeController {
	@Autowired
	TraineeServiceImpl traineeService;

	@GetMapping(value="/trainee",produces="application/json")
	public List<Trainee> getTrainees()
	{
		return traineeService.retriveAllTrainees();
	}
	

	@GetMapping("/trainee/{traineeId}")
	public Optional<Trainee> getTrainee(@PathVariable("traineeId") int traineeId)
	{
		return traineeService.retriveTrainees(traineeId);
	}
	
	@PutMapping("/trainee")
	public ResponseEntity<String> updateTrainee(@RequestBody Trainee t)
	{
		traineeService.ModifyTrainees(t, t.getTraineeId());
		return new ResponseEntity<>("Updated !!!",HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/trainee")
	public ResponseEntity<String> postTrainee(@RequestBody Trainee t)
	{
		traineeService.addTrainees(t);
		return new ResponseEntity<>("Added !!!",HttpStatus.CREATED);
	}
	
	@DeleteMapping("/trainee/{traineeId}")
	public ResponseEntity<String> deleteTrainee(@PathVariable("traineeId") int traineeId)
	{
		traineeService.DeleteTrainees(traineeId);
		return new ResponseEntity<String>("Deleted !!!",HttpStatus.OK);
	}
	

}
