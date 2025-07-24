package com.company.employeemanagement.app.services;

import com.company.employeemanagement.entity.Employee;
import io.jmix.core.DataManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Delete {

    private final DataManager dataManager;

    public Delete(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Transactional
    public void deleteEmployee(Employee employee) {
        dataManager.remove(employee);
    }
}
