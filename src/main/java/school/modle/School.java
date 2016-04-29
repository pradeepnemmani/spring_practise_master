package school.modle;

import java.util.List;

/**
 * Created by deepu on 29/7/15.
 */
public class School {
    private String name;
    private int id;
    private Person headMaster;
    private Address address;
    private List<Staff> staff;
    private List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getHeadMaster() {
        return headMaster;
    }

    public void setHeadMaster(Person headMaster) {
        this.headMaster = headMaster;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
