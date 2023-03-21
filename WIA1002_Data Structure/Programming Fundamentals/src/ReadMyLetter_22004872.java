import java.util.Scanner;
import java.io.*;
public class ReadMyLetter_22004872 {
    public static void main(String[] args) {
        String line = " ";
        String file = "C:\\Users\\ADMIN\\OneDrive\\Documents\\IdeaProjects\\WIA1002_Data Structure\\Programming Fundamentals\\src\\HengJinEn_22004872.txt";
        try {
          Scanner s = new Scanner(new FileInputStream(file));
          while (s.hasNextLine()){
              line+=s.nextLine() + "\n";
          }
          s.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
        line += "\n\n16 March, 2023\n\n";
        Scanner sc = new Scanner(System.in);
        line += sc.nextLine();
        System.out.println(line);
    }
}
