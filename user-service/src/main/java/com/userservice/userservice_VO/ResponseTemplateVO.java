package com.userservice.userservice_VO;

import lombok.Data;
import lombok.NoArgsConstructor;

import com.userservice.userservice_entity.User;

import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	
	private User user;
	private Department department;
	public void setDepartment(Department department2) {
				
	}
	public void setUser(User user2) {
		
		
	}

}
