package CIE_1.G2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    protected String name;
    protected Date dateOfBirth;

    // Constructor
    public Person(String name, String dateOfBirthStr) throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        // Checking if the date format is "DD-MM-YYYY"
        if (dateOfBirthStr.matches("\\d{2}-\\d{2}-\\d{4}")) {
            this.dateOfBirth = sdf.parse(dateOfBirthStr);
        } else {
            sdf.applyPattern("yyyy-MM-dd");
            this.dateOfBirth = sdf.parse(dateOfBirthStr);
        }
    }

    // Method to display person's name
    public void displayName() {
        System.out.println("Person's Name: " + name);
    }

    // Method to display person's age
    public void displayAge() {
        Date currentDate = new Date();
        long diff = currentDate.getTime() - dateOfBirth.getTime();

        // Calculating age in years
        long ageInMillis = 1000L * 60 * 60 * 24 * 365;
        long age = diff / ageInMillis;

        System.out.println("Person's Age: " + age + " years");
    }
}
