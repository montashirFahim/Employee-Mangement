package com.company.employeemanagement.app.services;

import com.company.employeemanagement.entity.Employee;
import io.jmix.core.DataManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Update {

    private final DataManager dataManager;

    public Update(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Transactional
    public Employee updateEmployee(Employee employee) {
        // Assumes the passed employee has an existing ID and updated fields
        return dataManager.save(employee);
    }
}
