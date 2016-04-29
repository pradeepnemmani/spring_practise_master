package school.service;

import org.springframework.stereotype.Component;
import school.modle.Address;
import school.modle.EnumGender;
import school.modle.EnumSubject;
import school.modle.Staff;

/**
 * Created by deepu on 29/7/15.
 */
@Component
public class StaffService {
    public StaffService() {
        System.out.println("StaffService Bean Creared...");
    }

    public Staff createStaff(String firstName, String lastName, int age, EnumGender gender, String mobileNumber, Address address, int id, int section, EnumSubject subject) {
        Staff staff = new Staff();
        staff.setFirstName(firstName);
        staff.setLastName(lastName);
        staff.setAge(age);
        staff.setGender(gender);
        staff.setMobileNo(mobileNumber);
        staff.setAddress(address);
        staff.setId(id);
        staff.setSection(section);
        staff.setSubject(subject);
        return staff;
    }
}
