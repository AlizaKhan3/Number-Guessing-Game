// Number guessing game using for loop
import java.util.Scanner;
class flowControl {
    public static void main(String[] args) {
        int num;
        int i =0;
        for (;i>= 0 && i <= 20; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number you guessed: ");
            num = sc.nextInt();
            if (num == i) {
                System.out.println("You guessed right");
                break;
            } else {
                System.out.println("Try Again! :( ");
            }
        }
    }
}
//Number guessing game using While Loop
import java.util.Scanner;
class NumberGuess {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int guessNum;
        while (i >= 0 && i <= 20 || i < 0) {
            while (j >= 1 && j <= 5) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number you guessed: ");
                guessNum = sc.nextInt();
                if (guessNum == i) {
                    System.out.println(j + " You guessed right");
                    break;
                } else {
                    System.out.println(j + " Try Again! :( ");
                }
                j++;

            }
            System.out.println("Retry");
        }
    }
}
