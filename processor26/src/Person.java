import java.util.Date;

enum Gender{
    FEMALE, MALE;
}

/**
 * Person class @
 */
public class Person implements Comparable{
    private int id;
    private String email;
    private String lastName;
    private String firstName;
    Gender gender;
    int height;
    int weight;
    Date birthday;

    public Person(int id, String email, String lastName, String firstName, Gender gender, int height, int weight, Date birthday) {
        this.id = id;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;
    }

    public double getBMI(){
        return this.weight / (this.height * this.height);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
