package MapandFlatMap;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapandFlatMapService {

    public static void main(String[] args) {

        List<Customer> customers = DAO.getCustomersDetails();

        //one to one mapping
//        customers.stream().map(i->i.getAge()).forEach(System.out::println);
//        System.out.println("---------------------------------");
//        customers.stream().map(Customer::getAge).forEach(System.out::println);
        customers.stream().map(Customer::getPhnNumber).forEach(System.out::println);

        List<List<String>> phoneno = customers.stream().map(Customer::getPhnNumber).collect(Collectors.toList());
        System.out.println(phoneno);
        //one to many mapping
        List<String> phonenumbers = customers.stream().flatMap(Cust -> Cust.getPhnNumber().stream()).collect(Collectors.toList());
        System.out.println(phonenumbers);

    }
}
