package school.modle;

/**
 * Created by deepu on 29/7/15.
 */
public class Address {
    private String plotNo;
    private String street;
    private String area;
    private String city;
    private String state;
    private String country;

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress()
    {
        return "Plot No = "+plotNo+"\n"+
                "Street = "+street+"\n"+
                "Area = "+area+"\n"+
                "City = "+city+"\n"+
                "State = "+state+"\n"+
                "Country = "+country;
    }
}
