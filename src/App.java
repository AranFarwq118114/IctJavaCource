import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("you are inside out loop(i) " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("you are inside in loop(j) " + j);
            }
        }
    }
}