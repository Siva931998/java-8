package MapandFlatMap;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String email;
    private List<String> phnNumber;

    public Customer() {
    }

    public Customer(int id, String name, int age, String email, List<String> phnNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phnNumber = phnNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhnNumber() {
        return phnNumber;
    }

    public void setPhnNumber(List<String> phnNumber) {
        this.phnNumber = phnNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phnNumber=" + phnNumber +
                '}';
    }
}
