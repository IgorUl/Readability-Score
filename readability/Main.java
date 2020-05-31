package readability;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            Scanner sc = new Scanner(file);
            StringBuilder text = new StringBuilder();
            String[] age = {"0", "5-6", "6-7", "7-9", "9-10", "10-11", "11-12", "12-13", "13-14",
            "14-15", "15-16", "16-17", "17-18", "18-24", "24+"};
            double words;
            double sentences;
            double characters;
            double score;

            while (sc.hasNextLine()) {
                text.append(sc.nextLine());
            }
            words = text.toString().split("[\\p{Z}]").length;
            sentences = text.toString().split("[.!?]").length;
            characters = text.toString().replaceAll("[\\p{Z}]", "").length();
            score = (4.71 * (characters / words) + 0.5 * (words / sentences) - 21.43);

            System.out.println("The text is:\n" + text + "\n");
            System.out.printf("Words: %.0f\n", words);
            System.out.printf("Sentences: %.0f\n", sentences);
            System.out.printf("Characters: %.0f\n", characters);
            System.out.printf("The score is: %.2f\n", score);
            System.out.println("This text should be understood by " + age[(int)Math.ceil(score)] + " year olds.");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
