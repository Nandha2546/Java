package day02;
public class Student {
    private int id;
    private String name;
    private String centre;
    private String country;

    public Student(int id, String name, String centre, String country) {
        this.id = id;
        this.name = name;
        this.centre = centre;
        this.country = country;
    }

    public Student() {
        // Default constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", centre=" + centre + ", country=" + country + "]";
    }
}
