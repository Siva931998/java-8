package StreamSorting;

import Stream_Api.Employee;

import java.util.*;

public class SortingMap {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(4,"D");
        map.put(5,"A");
        map.put(3,"E");
        map.put(1,"C");
        map.put(2,"B");

        List<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(o1,o2)-> o1.getKey().compareTo(o2.getKey()));
//        System.out.println(list);

        /**one approach**/
//        map.entrySet().stream().sorted(Comparator.comparing(i->i.getValue())).forEach(System.out::println);
        /**another approach**/
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        Map<Employee,Integer> treemap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary()-o2.getSalary();
            }
        });
        treemap.put(new Employee(1,"siva",26,50000),80);
        treemap.put(new Employee(2,"bala",30,80000),20);
        treemap.put(new Employee(3,"kumar",21,20000),60);
        treemap.put(new Employee(4,"kishore",27,90000),10);
        treemap.put(new Employee(5,"ram",24,100000),30);
        treemap.put(new Employee(6,"guru",28,60000),70);

//        System.out.println(treemap);

//        treemap.entrySet().stream().sorted(Map.Entry.comparingByKey((o1, o2) -> o1.getSalary()-o2.getSalary())).forEach(System.out::println);

        treemap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(i->i.getName()))).forEach(System.out::println);

        treemap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getAge))).forEach(System.out::println);






    }

}
