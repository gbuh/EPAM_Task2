
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class TextParser {
    public static void main(String[] args) {

        try {
            File file = new File("FakeBookInput.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader reader = new BufferedReader(filereader);
            String line = "";
            String nextLine = reader.readLine();
            while (nextLine != null) {
                line += nextLine;
                nextLine = reader.readLine();
            }
            reader.close();
            line = line.replaceAll("([\\s]+)", " ");
            System.out.println(line);
            Text text = new Text(line);

            LinkedList<Sentence> sentences = text.getText();
            for(Sentence sentence : sentences) {
                System.out.println(sentence);
            }

            System.out.println("Task 8: Sorted on first consonant letter");
            ArrayList<Word> task8 = text.task8();
            for(Word word : task8) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
