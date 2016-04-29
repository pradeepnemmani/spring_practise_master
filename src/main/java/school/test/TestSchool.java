package school.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import school.modle.Person;
import school.modle.School;
import school.modle.Student;
import school.service.SchoolService;

/**
 * Created by deepu on 29/7/15.
 */
public class TestSchool {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        Person pradeep= (Person)context.getBean("pradeep");
//        System.out.println(  pradeep.getFirstName());
//        System.out.println(pradeep.getAddress().getCountry());
        SchoolService schoolService = (SchoolService)context.getBean("schoolService");
schoolService.createSchool("golded",1);

    }
}
