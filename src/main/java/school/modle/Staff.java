package school.modle;

/**
 * Created by deepu on 29/7/15.
 */
public class Staff extends Person {
    private int id;
    private int section;
    private EnumSubject subject;

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

    public EnumSubject getSubject() {
        return subject;
    }

    public void setSubject(EnumSubject subject) {
        this.subject = subject;
    }
}
