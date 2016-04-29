package school.modle;

/**
 * Created by deepu on 29/7/15.
 */
public class Student extends Person {
    private int id;
    private int section;
    private EnumMedium medium;

    public Student() {
        System.out.println("Inside Student Default Const...");
    }

    public Student(int id, int section) {
        this.id = id;
        this.section = section;
        System.out.println("Inside Student two parameterised Const...");
    }

    public Student(int id, int section, EnumMedium medium) {
        this.id = id;
        this.section = section;
        this.medium = medium;
        System.out.println("Inside Student three parameterised Const...");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public EnumMedium getMedium() {
        return medium;
    }

    public void setMedium(EnumMedium medium) {
        this.medium = medium;
    }
}
