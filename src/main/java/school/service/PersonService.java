package school.service;

import org.springframework.stereotype.Component;
import school.modle.Address;
import school.modle.EnumGender;
import school.modle.Person;

/**
 * Created by deepu on 29/7/15.
 */
@Component
public class PersonService {

    public PersonService() {
        System.out.println("PersonService Bean creaated... ");
    }

    public Person createPerson(String firstName, String lastName, int age,EnumGender gender, String mobileNumber, Address address)
    {
        Person person =new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setGender(gender);
        person.setMobileNo(mobileNumber);
        person.setAddress(address);
        return  person;
    }
}
