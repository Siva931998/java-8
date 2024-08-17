package StreamSorting;

import Stream_Api.DAO;
import Stream_Api.Employee;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Employee> emp= dao.getemploye();
        /*Collections.sort(emp,new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSalary()-o1.getSalary();
            }
        });*/

        Collections.sort(emp, (o1,o2) -> o2.getSalary()-o1.getSalary());
      //  System.out.println(emp);

//      emp.stream().sorted((o1,o2) -> o2.getSalary()-o1.getSalary()).forEach(t->System.out.println(t));

        emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

    }
}
