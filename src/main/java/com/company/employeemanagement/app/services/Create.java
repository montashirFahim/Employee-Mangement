package com.company.employeemanagement.app.services;

import com.company.employeemanagement.entity.Employee;
import io.jmix.core.DataManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Create{

    private final DataManager dataManager;

    public Create(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Transactional
    public Employee createEmployee(Employee employee) {
        return dataManager.save(employee);
    }
}
