package com.spring.mvc.formbinding.model;

import lombok.Data;

@Data
public class User {

	private int uId ;
	private String uName ;
	private String pwd ;
	private Long phone ;
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", pwd=" + pwd + ", phone=" + phone + "]";
	}
	
	
}
