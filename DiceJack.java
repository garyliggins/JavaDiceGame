import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("numbers can not be less that 1, game over");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("numbers can not be greater than 6, game over");
            System.exit(0);
        }

        int sumofNumbers = num1+num2+num3;
        int sumOfRolls = roll1+roll2+roll3;

        System.out.println("Dice sum: " + sumOfRolls + ". Number sum: " + sumofNumbers);

        if (checkWin(sumOfRolls, sumofNumbers)) {
            System.out.println("congrats you win");
        } else {
            System.out.println("sorry you lose");
        };

        scan.close();
    }

        public static int rollDice() {
            double randomNumber = Math.random() * 6;
            randomNumber += 1;
            return (int)randomNumber; //this is typecasting, it will round thhe double number by cutting off the decimals
        }

        public static boolean checkWin(int sumOfRolls, int sumofNumbers) {
            return (sumofNumbers > sumOfRolls && sumofNumbers - sumOfRolls < 3);
        }

}