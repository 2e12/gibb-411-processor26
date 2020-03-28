import java.util.ArrayList;

public class Render {
    /**
     * Get some facts.
     * @param persons
     */
    private static void drawFactsList(ArrayList<Person> persons){
        Person youngest = Person.getYoungestPerson(persons);
        Person oldest = Person.getOldestPerson(persons);
        System.out.println(
                "Amount of people: " + persons.size()
        );
        System.out.println(
                "Amount of male people: " + Person.getAmountMalePersons(persons)
        );
        System.out.println(
                "Amount of female people: " + Person.getAmountFemalePersons(persons)
        );
        System.out.println(
                "Youngest person: " + youngest.getFirstName() + " " + youngest.getLastName() + " " + youngest.getBirthday()
        );
        System.out.println(
                "Oldest person: " + oldest.getFirstName() + " " + oldest.getLastName() + " " + oldest.getBirthday()
        );
    };

    /**
     * Generate a line break in the console.
     * @param n The length of the line break.
     */
    private static void lineBreak(int n){
        for(int i = 0; i < n; i++){
            System.out.println();
        }
    }

    /**
     * Draw the table header.
     */
    private static void drawPersonsListHeader(){
        System.out.println(
                "Id\t" +
                "E-Mail\t" +
                "Last name\t" +
                "First name\t" +
                "Sex\t" +
                "Height\t" +
                "Weight\t" +
                "BMI\t" +
                "Birthday"
        );
    }

    /**
     * Draw the list of Persons
     * @param persons Persons that should be outputted.
     */
    public static void drawPersonsList(ArrayList<Person> persons){
        drawFactsList(persons);
        lineBreak(3);
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
                    person.getBMI() + "\t" +
                    person.getBirthday()
            );
        }
    }
}
