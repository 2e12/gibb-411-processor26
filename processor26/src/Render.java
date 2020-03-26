import java.util.ArrayList;

public class Render {
    private static void drawPersonsListHeader(){
        System.out.println(
                "Id\t" +
                "E-Mail\t" +
                "Last name\t" +
                "First name\t" +
                "Sex\t" +
                "Height\t" +
                "Weight\t" +
                "Birthday"
        );
    }

    public static void drawPersonsList(ArrayList<Person> persons){
        drawPersonsListHeader();
        for(Person person: persons){
            System.out.println(
                    person.getId() + "\t" +
                    person.getEmail() + "\t" +
                    person.getLastName() + "\t" +
                    person.getFirstName() + "\t" +
                    person.getGender().toString() + "\t" +
                    person.getHeight() + "\t" +
                    person.getWeight() + "\t" +
                    person.getBirthday()
            );
        }
    }
}
