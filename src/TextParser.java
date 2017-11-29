
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class TextParser {

    public static void main(String[] args) {

        String textInput = "I send e-mail to: igor_lipko@mail.ru and call the  phone number:    8(029)510-53-05. Hi, all!";
        
        ArrayList<String> textElements = new ArrayList<>();
        
        Text text = new Text("Hi");
        text.setTextElement(new Word(""));
/*        try {
            File file = new File("FakeBookInput.txt");
            //создаем объект FileReader для объекта File
            FileReader filereader = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(filereader);
            // считаем сначала первую строку
            String line = "";
            String nextLine = reader.readLine();
            while (nextLine != null) {
                line += nextLine;
                // считываем остальные строки в цикле
                nextLine = reader.readLine();
            }
            reader.close();
            System.out.println(line);
            Text text = new Text(line);

            LinkedList<Sentence> sentences = text.getText();
            for(Sentence sentence : sentences) {
                System.out.println(sentence);
                System.out.println(sentence.wordsCount());
            }
            System.out.println("TASK2:");
            ArrayList<Sentence> task2 = text.task2();
            for(Sentence sentence : task2) {
                System.out.println(sentence);
                System.out.println(sentence.wordsCount());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

*/
    }
}
