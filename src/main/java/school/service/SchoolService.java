package school.service;

import org.springframework.stereotype.Component;
import school.annotation.Tx;
import school.modle.Person;
import school.modle.School;
import school.modle.Staff;
import school.modle.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by deepu on 29/7/15.
 */
@Component
public class SchoolService {
    private Map<Integer, School> schools;


    public SchoolService() {
        schools = new HashMap<Integer, School>();
        System.out.println(" In SchoolService BEan Created...");
    }

    public School findSchool(int id) {
        School school = null;
        if (schools.containsKey(id)) {
            school = schools.get(id);
        }
        return school;
    }
    @Tx
    public School createSchool(String name, int id) {
        School school = new School();
        school.setName(name);
        school.setId(id);
        return school;
    }

    public School setHeadMaster(int id, Person headMaster) {
        School school = findSchool(id);
        if (school != null) {
            school.setHeadMaster(headMaster);

        }
        return school;
    }

    public School setStaff(int id, List<Staff> staff) {
        School school = findSchool(id);
        if (school != null) {
            school.setStaff(staff);
        }
        return school;
    }

    public School setStudents(int id, List<Student> students) {
        School school = findSchool(id);
        if (school != null) {
            school.setStudents(students);
        }
        return school;
    }

    public School addStaff(int id, Staff staff) {
        School school = findSchool(id);
        if (school != null) {
            school.getStaff().add(staff);
        }
        return school;
    }

    public School addStudent(int id, Student student) {
        School school = findSchool(id);
        if (school != null) {
            school.getStudents().add(student);
        }
        return school;
    }
}
