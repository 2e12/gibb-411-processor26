import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonFactoy {
    /**
     * Create a Person object from a CSV line
     * @param line CSV Line
     * @return Person object
     */
    public static Person getPersonFromCsvLine(String line) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yy");

        String[] col = line.split(",");
        int id = Integer.valueOf(col[0]);
        String email = col[3];
        String lastName = col[2];
        String firstName = col[1];
        Gender gender = Gender.NOTBIN;
        if(col[4].equals("Male")){
            gender = Gender.MALE;
        }
        if(col[4].equals("Female")){
            gender = Gender.FEMALE;
        }
        int height = Integer.valueOf(col[5]);
        int weight = Integer.valueOf(col[6]);

        Date birthday = new Date();
        try {
            birthday = formatter.parse(col[7]);
        } catch (ParseException e) {
            System.out.println("Error: Malformed date (required pattern: " + formatter.toPattern() + "): " + line);
        }

        Person person = new Person(
                id,
                email,
                lastName,
                firstName,
                gender,
                height,
                weight,
                birthday
        );
        return person;
    }
}
