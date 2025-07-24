package com.company.employeemanagement.app.services;

import com.company.employeemanagement.entity.Employee;
import io.jmix.core.DataManager;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final DataManager dataManager;

    public EmployeeService(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public Employee create(Employee employee) {
        return dataManager.save(employee);
    }

    public List<Employee> readAll() {
        return dataManager.load(Employee.class).all().list();
    }

    public Optional<Employee> readById(Long id) {
        return dataManager.load(Employee.class).id(id).optional();
    }

    public Employee update(Employee employee) {
        return dataManager.save(employee);
    }

    public void delete(Employee employee) {
        dataManager.remove(employee);
    }
}