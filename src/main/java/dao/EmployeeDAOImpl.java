package dao;

import jakarta.persistence.EntityManager;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

/*@Repository is an annotation that marks a class as a Data Access Object (DAO) or repository. It indicates that the
class is responsible for interacting with the database or other data storage mechanisms. */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    /*@Autowired is an annotation used for automatic dependency injection. It instructs the Spring container to resolve
    and inject the required dependencies into a class.*/
    @Autowired
    private EntityManager entityManager;

    /*List of Employees*/
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
