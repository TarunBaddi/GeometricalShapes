import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {
    private String name;
    private Date dob;

    public Student(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge() {
        long diffInMillis = new Date().getTime() - dob.getTime();
        long years = diffInMillis / (1000L * 60 * 60 * 24 * 365);
        System.out.println("Age of Student: " + years);
    }

    public static Date parseDate(String dateStr) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.parse(dateStr);
    }

    public static void main(String[] args) throws Exception {
        Date dob = parseDate("2000-01-01");
        Student student1 = new Student("John Doe", dob);
        student1.displayName();
        student1.displayAge();
    }
}
