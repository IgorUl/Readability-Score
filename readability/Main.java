package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] str;
        int sum = 0;
        int res;
        str = sc.nextLine().split("[.!?]");
        for ( String st: str) {
            sum += st.trim().split("[\\p{Z}]").length;
        }
        if ((sum % str.length) != 0) {
            res = sum / str.length + 1;
        } else {
            res = sum / str.length;
        }
        System.out.println(res > 10 ? "HARD" : "EASY");
    }
}
