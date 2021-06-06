package com.clien.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clien.demo.dao.TraineeJPARepository;
import com.clien.demo.model.Trainee;

@Service("traineeService")
public class TraineeServiceImpl implements TraineeService {
	@Autowired
	TraineeJPARepository traineeDao;
	@Override
	public int addTrainees(Trainee t) {
		Trainee t1=traineeDao.save(t);
		return t1.getTraineeId();
		
	}

	@Override
	public int DeleteTrainees(int tid) {
		traineeDao.deleteById(tid);
		return tid;
	}

	@Override
	public int ModifyTrainees(Trainee t, int tid) {
		return traineeDao.save(t).getTraineeId();
	}

	@Override
	public Optional<Trainee> retriveTrainees(int tid) {
		return traineeDao.findById(tid);
	}

	@Override
	public List<Trainee> retriveAllTrainees() {
		return traineeDao.findAll();
	}
	

	
}