import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (char c : a.toCharArray()) {
            answer += Character.isUpperCase(c) ?
                Character.toLowerCase(c) : Character.toUpperCase(c);
        }

        System.out.println(answer);;
    }
}