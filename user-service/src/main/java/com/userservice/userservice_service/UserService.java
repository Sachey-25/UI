package com.userservice.userservice_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.userservice.userservice_VO.Department;
import com.userservice.userservice_VO.ResponseTemplateVO;
import com.userservice.userservice_entity.User;
import com.userservice.userservice_repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	 @Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private RestTemplate restTemplate;

	    public User saveUser(User user) {
	       
	        return userRepository.save(user);
	    }

	    public ResponseTemplateVO getUserWithDepartment(Long userId) {
	        
	        ResponseTemplateVO vo = new ResponseTemplateVO();
	        User user = userRepository.findByUserId(userId);

	        Department department =
	                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId()
	                        ,Department.class);

	        vo.setUser(user);
	        vo.setDepartment(department);

	        return  vo;				
				
	}
}