package Stream_Api;

import java.util.ArrayList;
import java.util.List;

public class DAO {

    public List<Employee> getemploye(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "siva",26, 90000));
        employees.add(new Employee(1, "gopal",26, 40000));
        employees.add(new Employee(1, "hemanth",26, 100000));
        employees.add(new Employee(1, "mahesh",26, 50000));
        employees.add(new Employee(1, "ramesh",26, 70000));
        return employees;
    }

}
