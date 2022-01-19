import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        String filename = "/Users/AMaticic/OneDrive - ENDAVA/Desktop/TweetData.txt";
        String line = "";
        List<String> hashtags = new ArrayList<String>();

        try {
            bufferedReader = new BufferedReader(new FileReader(filename));

            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.contains("#")) {
                       word=word.replaceAll("^[^#]*", "");
                       if (!hashtags.contains(word))
                        hashtags.add(word);
                    }
                }
            }
            hashtags.sort(String::compareTo);
            for (String hashtag : hashtags) {
                System.out.println(hashtag);
            }

            System.out.println("Count = " + hashtags.size());


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
