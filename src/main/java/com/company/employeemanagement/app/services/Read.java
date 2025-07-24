package com.company.employeemanagement.app.services;


import com.company.employeemanagement.entity.Employee;
import io.jmix.core.DataManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Read {

    private final DataManager dataManager;

    public Read(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public List<Employee> getAllEmployees() {
        return dataManager.load(Employee.class)
                .all()
                .list();
    }
}
