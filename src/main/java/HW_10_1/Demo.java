package HW_10_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("file.txt");
        File file = new File("src/main/java/HW_10_1/file.txt");

        if (file.exists()) {
            FileInputStream fIs = new FileInputStream(file);
            Scanner fileScanner = new Scanner(fIs);
            String pattern1 = "\\(\\d{3}\\)\\s\\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}";
            Pattern p1 = Pattern.compile(pattern1);
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                Matcher m1 = p1.matcher(line);
                if (m1.find()) {
                    System.out.println(line);
                }
            }
        } else{
            System.out.println("File was not found");
        }
    }
}
