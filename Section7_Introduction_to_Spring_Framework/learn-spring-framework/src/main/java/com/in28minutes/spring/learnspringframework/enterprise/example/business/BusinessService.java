package com.in28minutes.spring.learnspringframework.enterprise.example.business;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.learnspringframework.enterprise.example.web.data.DataService;


@Component
public class BusinessService{

	private DataService dataService;
	@Autowired
	public void setDataService(DataService dataService) {
		System.out.println("========Setter Injection========");
		this.dataService = dataService;
	}
	public long calculateSum() {
		List<Integer> data = dataService.getData();
		// summing values in the list 
		return data.stream().reduce(Integer ::sum).get();// functional programming 
	}
} 
