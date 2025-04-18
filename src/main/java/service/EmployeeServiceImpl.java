package service;

import dao.EmployeeDAO;
import jakarta.transaction.Transactional;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

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
