import java.io.*;

public class main {
    String filePath;

    /**
     * This functions checks if a valid file path is provided.
     * @param args
     */
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Error: No file provided.");
            return;
        }

        File file = new File(args[0]);
        if (file.exists()) {
            new main(file.getAbsolutePath());
        } else {
            System.out.println("Error: File not found.");
        }
    }

    /**
     * Set everything up.
     * @param filePath
     */
    public main(String filePath) {
        this.filePath = filePath;
        this.convertCsvToList();
    }

    /**
     * Converts the csv file provided in this.filePath to a Person ArrayList.
     */
    public void convertCsvToList(){
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.filePath));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
