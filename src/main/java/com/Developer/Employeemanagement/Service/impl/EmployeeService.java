package com.Developer.Employeemanagement.Service.impl;

import com.Developer.Employeemanagement.EmployeeEntity;
import com.Developer.Employeemanagement.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements com.Developer.Employeemanagement.EmployeeService {

//    @Autowired
//    EmployeeRepository employeeRepository;

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepositort) {
        this.employeeRepository = employeeRepositort;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);

    }
}
