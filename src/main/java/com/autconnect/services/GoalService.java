package com.autconnect.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autconnect.repositories.GoalRepository;

@Service
public class GoalService {
	@Autowired
	GoalRepository goalRepository;
}
