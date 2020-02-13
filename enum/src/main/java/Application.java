public class Application {

    public static void main(String[] args) {
        for (Student student : Student.values()) {
            if (student.getGender() == "female") {
                System.out.println("name: " + student.getName() + ",gender: " + student.getGender());
            }
        }

    }
}
