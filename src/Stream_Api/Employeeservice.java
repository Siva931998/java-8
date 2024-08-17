package Stream_Api;

import java.util.List;
import java.util.stream.Collectors;

public class Employeeservice {

    public static List<Employee> EmployeeTaxer(String inputtax){
        DAO dao = new DAO();
        return (inputtax.equalsIgnoreCase("tax")) ? dao.getemploye().stream().filter(i -> i.getSalary() > 50000).collect(Collectors.toList()):
                dao.getemploye().stream().filter(i -> i.getSalary() <= 50000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
       System.out.println(EmployeeTaxer("non tax"));
    }
}
