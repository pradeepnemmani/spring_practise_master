package school.service;

import org.springframework.stereotype.Component;
import school.modle.*;

/**
 * Created by deepu on 29/7/15.
 */
@Component
public class StudentService {

    public StudentService() {
        System.out.println("StudentService Bean created...");
    }

    public Student createStudent(String firstName, String lastName, int age,EnumGender gender, String mobileNumber, Address address,int id, int section, EnumMedium medium)
    {
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setAge(age);
        student.setGender(gender);
        student.setMobileNo(mobileNumber);
        student.setAddress(address);
        student.setId(id);
        student.setSection(section);
        student.setMedium(medium);
        return  student;
    }
}
