package school.service;

import org.springframework.stereotype.Component;
import school.modle.Address;

/**
 * Created by deepu on 29/7/15.
 */
@Component
public class AddressService {
    public AddressService() {
        System.out.println("AddressService Bean created...");
    }

    public Address createPerson(String plotNo, String street, String area, String city, String state, String country) {
        Address address = new Address();
        address.setPlotNo(plotNo);
        address.setStreet(street);
        address.setArea(area);
        address.setCity(city);
        address.setState(state);
        address.setCountry(country);
        return address;
    }
}
