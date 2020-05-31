package readability;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            Scanner sc = new Scanner(file);
            String text = sc.nextLine();
            System.out.println();
            System.out.println(text);
//        int sum = 0;
//        int res;
//        str = sc.nextLine().split("[.!?]");
//        for ( String st: str) {
//            sum += st.trim().split("[\\p{Z}]").length;
//        }
//        if ((sum % str.length) != 0) {
//            res = sum / str.length + 1;
//        } else {
//            res = sum / str.length;
//        }
//        System.out.println(res > 10 ? "HARD" : "EASY");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
