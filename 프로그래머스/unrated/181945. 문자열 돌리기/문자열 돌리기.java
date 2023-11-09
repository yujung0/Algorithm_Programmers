import java.util.Scanner;

public class Solution_1109_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String[] array_word; // 스트링을 담을 배열

        array_word = a.split(""); // 배열에 한 글자씩 저장

        for (int i= 0; i < array_word.length; i++) {
            System.out.println(array_word[i]);
        }
    }
}