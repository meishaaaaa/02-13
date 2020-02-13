import java.util.HashMap;

public enum Student {
    Linda("Linda", "female"), Bob("Bob", "male"),
    Solider("Solider", "male"), Cindy("Cindy", "female");

    private String name;
    private String gender;

    Student() {
    }

    private Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
