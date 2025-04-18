package dao;

import jakarta.persistence.EntityManager;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
        List<Employee> list = query.getResultList();
        return list;
    }

    @Override
    public Employee get(int id) {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void delete(int id) {

    }
}
