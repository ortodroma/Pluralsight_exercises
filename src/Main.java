import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        String filename = "/Users/AMaticic/OneDrive - ENDAVA/Desktop/TweetData.txt";
                String line = "";

        try {
            bufferedReader = new BufferedReader(new FileReader(filename));

            while ((line=bufferedReader.readLine()) != null) {
System.out.println("tweet = " + line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
