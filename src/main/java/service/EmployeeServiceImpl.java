package service;

import dao.EmployeeDAO;
import jakarta.transaction.Transactional;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*In Spring Boot applications, Data Access Objects (DAOs) and services serve distinct roles within the
application's architecture.

A DAO is responsible for interacting directly with the database. It encapsulates the logic for data retrieval,
persistence, and manipulation. The primary purpose of a DAO is to abstract the underlying data access implementation,
allowing the rest of the application to interact with data without needing to know the specifics of the database or
data storage mechanism.

A service implements the business logic of the application. It orchestrates the interaction between different parts
of the application, including DAOs, to fulfill specific business requirements. Services often involve complex
operations, transactions, and validations that go beyond simple data access.*/

/*@Service is an annotation that marks a class as a service component. It signifies that the class holds business logic
and is part of the service layer in the application architecture. */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    /*Can only be used on public methods. Helps the database transaction by not allowing partial data to save
     into the database. It either needs to be complete data, or no data is saved. It performs Rollback etc.*/
    @Transactional
    @Override
    public List<Employee> get() {
        return employeeDAO.get();
    }

    @Transactional
    @Override
    public Employee get(int id) {
        return null;
    }

    @Transactional
    @Override
    public void save(Employee employee) {

    }

    @Transactional
    @Override
    public void delete(int id) {

    }
}
