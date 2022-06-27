package com.vitalikasaty.spring.springboot.spring_data_jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitalikasaty.spring.springboot.spring_data_jpa.entity.Employee;
//Параметры JpaRepository: 1) Entity с которым работаем; 2)Тип данных primary key у поля этого класса													
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
