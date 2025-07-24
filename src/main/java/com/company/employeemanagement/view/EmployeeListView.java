package com.company.employeemanagement.view;

import com.company.employeemanagement.app.services.EmployeeService;
import com.company.employeemanagement.entity.Employee;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DefaultMainViewParent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "employees", layout = DefaultMainViewParent.class)
public class EmployeeListView extends VerticalLayout {

    private final EmployeeService employeeService;
    private final Grid<Employee> employeeGrid = new Grid<>(Employee.class);

    @Autowired
    public EmployeeListView(EmployeeService employeeService) {
        this.employeeService = employeeService;

        Button reload = new Button("Reload", e -> refreshGrid());
        add(reload, employeeGrid);
        refreshGrid();
    }

    private void refreshGrid() {
        List<Employee> employees = employeeService.readAll();
        employeeGrid.setItems(employees);
    }
}