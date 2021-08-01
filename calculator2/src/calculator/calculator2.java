package calculator;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calculator2 {

    public static void main(String[] args) {
        System.out.println("hi, i am calculator :) type your name:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        while(true){
            char operation;
            while (true){
                System.out.printf("\nhi %s  Type 'A' for add, 'S' for subtract, 'M' for multiply, 'D' for divide:", userName);
                operation= scanner.next().charAt(0);
                if(checkChar(operation)){
                    break;
                }else {
                    System.out.println("please enter a valid char");
                }
            }



            int firstNum;
            while (true){
                try {
                    System.out.println("enter first num");
                    Scanner scanner1=new Scanner(System.in);
                    firstNum = scanner1.nextInt();
                    break;
                }catch (Exception e){
                    System.out.println("enter valid num");
                }
            }
            int secondNum;
            while (true){
                try {
                    System.out.println("enter second num");
                    Scanner scanner1=new Scanner(System.in);
                    secondNum = scanner1.nextInt();
                    break;
                }catch (Exception e){
                    System.out.println("enter valid num");
                }
            }
            int result;
            switch (operation) {
                case 'A' -> {
                    result = firstNum + secondNum;
                    System.out.printf("%d + %d = %d \n", firstNum, secondNum, result);
                }
                case 'S' -> {
                    result = firstNum - secondNum;
                    System.out.printf("%d - %d = %d \n", firstNum, secondNum, result);
                }
                case 'M' -> {
                    result = firstNum * secondNum;
                    System.out.printf("%d * %d = %d \n", firstNum, secondNum, result);
                }
                case 'D' -> {
                    result = firstNum / secondNum;
                    System.out.printf("%d / %d = %d \n", firstNum, secondNum, result);
                }
            }
            System.out.println("if you want to close type 'yes', or else type anything: ");
            String asd = scanner.next();
            if(asd.equals("yes"))
                break;
            else
                continue;

        }
    }
    public static boolean checkChar(char text) {
        List<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('S');
        characters.add('M');
        characters.add('D');
        if (characters.contains(text)) {
            return true;
        } else {
            return false;
        }
    }

}





