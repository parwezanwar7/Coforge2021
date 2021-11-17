package com.demo.dao;

import java.util.List;

import com.demo.pojo.EmployeeVO;

public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
}