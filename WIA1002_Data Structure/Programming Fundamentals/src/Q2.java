import java.io.BufferedReader;
import java.io.FileReader;

public class Q2 {
    public static void main(String[] args) {

        String[] file = {"text1.txt", "text2.txt", "text3.txt", "text4.txt"};

        for (String files : file) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(files));
                String line;
                int count = 0;
                StringBuilder sb = new StringBuilder();
                String delimiter = "";
                if (files.equals("text1.txt")) {
                    delimiter = ",";
                } else if (files.equals("text2.txt") || files.equals("text3.txt")) {
                    delimiter = "[,;\\s]+";
                } else if (files.equals("text4.txt")) {
                    delimiter = "";
                }
                while ((line = reader.readLine()) != null) {
                    String[] words = line.split(delimiter);
                    for (String word : words) {
                        if (files.equals("text4.txt")) {
                            for (char c : word.toCharArray()) {
                                if (Character.isLetter(c)) {
                                    count++;
                                    sb.append(c);
                                }
                            }
                        }
                        else {
                            count += word.length();
                            sb.append(word).append(" ");
                        }
                    }
                }
                reader.close();
                System.out.println("File name: " + files);
                System.out.println("Number of characters: " + count);
                System.out.println("Characters: " + sb);
            } catch (Exception e) {
                System.out.println("Error reading file: " + files);
                e.printStackTrace();
            }
        }
    }
}
