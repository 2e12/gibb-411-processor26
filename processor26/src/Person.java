import java.util.*;

enum Gender{
    FEMALE, MALE, NOTBIN;
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

    /**
     * Returns the BMI of the person.
     * @return
     */
    public int getBMI(){
        double height = (double) this.height / 100; // Convert cm to meters
        return (int)(this.weight / (height * height));
    }

    /**
     * Function to get all readed persons.
     * @param  persons list of persons
     * @return numbers of all persons
     */
    public int getAmountPersons(ArrayList<Person> persons){
        return persons.size();
    }

    /**
     * Function returns the number of females in a person list.
     * @param persons list of persons
     * @return number of all females
     */
    public static int getAmountFemalePersons(ArrayList<Person> persons){
        int femaleCounter = 0;
        for (int  i = 0; i < persons.size(); i++){
            if (persons.get(i).getGender() == Gender.FEMALE){
                femaleCounter ++;
            }
        }
        return femaleCounter;
    }

    /**
     * Function returns the number of male in a person list.
     * @param persons list of persons.
     * @return number of all males
     */
    public static int getAmountMalePersons(ArrayList<Person> persons){
        int maleCounter = 0;
        for (int i = 0; i < persons.size(); i++){
            if (persons.get(i).getGender() == Gender.MALE){
                maleCounter ++;
            }
        }
        return maleCounter;
    }


    public static Person getYoungestPerson(ArrayList<Person> persons){
        Date youngest = persons.get(0).getBirthday();

        Calendar calendar = new GregorianCalendar();
        Calendar compare = new GregorianCalendar();
        int indexYoungest = 0;
        for (int i = 0; i < persons.size(); i++){
            calendar.setTime(persons.get(i).getBirthday());
            compare.setTime(youngest);
            if (calendar.get(Calendar.YEAR) > compare.get(Calendar.YEAR)){
                youngest = persons.get(i).getBirthday();
                indexYoungest = i;
            }
            else if(calendar.get(Calendar.YEAR) == compare.get(Calendar.YEAR)){
                if (calendar.get(Calendar.MONTH) > compare.get(Calendar.MONTH)){
                    youngest = persons.get(i).getBirthday();
                    indexYoungest = i;
                }
                if (calendar.get(Calendar.MONTH) == compare.get(Calendar.MONTH)){
                    if (calendar.get(Calendar.DAY_OF_MONTH) >= compare.get(Calendar.DAY_OF_MONTH)){
                        youngest = persons.get(i).getBirthday();
                        indexYoungest = i;
                    }
                }
            }
        }
        return persons.get(indexYoungest);
    }

    public static Person getOldestPerson(ArrayList<Person> persons){
        Date oldest = new Date();
        Calendar calendar = new GregorianCalendar();
        Calendar compare = new GregorianCalendar();
        int indexOldest = 0;
        for (int i = 0; i < persons.size(); i++){
            calendar.setTime(persons.get(i).getBirthday());
            compare.setTime(oldest);
            if (calendar.get(Calendar.YEAR)< compare.get(Calendar.YEAR)){
                oldest = persons.get(i).getBirthday();
                indexOldest = i;
            }
            else if(calendar.get(Calendar.YEAR) == compare.get(Calendar.YEAR)){
                if (calendar.get(Calendar.MONTH) < compare.get(Calendar.MONTH)){
                    oldest = persons.get(i).getBirthday();
                    indexOldest = i;
                }
                if (calendar.get(Calendar.MONTH) == compare.get(Calendar.MONTH)){
                    if (calendar.get(Calendar.DAY_OF_MONTH) <= compare.get(Calendar.DAY_OF_MONTH)){
                        oldest = persons.get(i).getBirthday();
                        indexOldest = i;
                    }
                }
            }
        }
        return persons.get(indexOldest);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Date getBirthday() {
        return birthday;
    }
}
