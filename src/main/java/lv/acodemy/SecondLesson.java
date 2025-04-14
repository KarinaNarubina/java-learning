package lv.acodemy;

import java.util.Arrays;

public class SecondLesson {
    public static void main(String[] args) {

        String name = "Karina";
        int age = 30;

        //Array
        int[] numbers =new int[5]; // [0, 0, 0, 0, 0]
        String[] names = {"John", "Andrey", "Mark"}; // [John, Andrey, Mark]

        int[] ages = {19, 20, 30, 41,50};
        String [] fruitbasket = new String[10];

        //Elewment access
        System.out.println(numbers[0]);
        numbers[0] = 10;
        numbers[1] = 32;
        numbers[2] = 46;
        numbers[3] = 12;
        numbers[4] = 18;
        System.out.println(Arrays.toString(numbers));


        fruitbasket [0] = "apple";
        fruitbasket [1] = "pear";
        fruitbasket [2] = "banana";
        fruitbasket [3] = "grape";
        fruitbasket [4] = "watermelon";
        fruitbasket [5] = "melon";
        fruitbasket [6] = "blueberry";
        fruitbasket [7] = "strawberry";
        fruitbasket [8] = "cherry";
        fruitbasket [9] = "mango";
        System.out.println(Arrays.toString(fruitbasket));

        // Loops - циклы кода
        //Print hello world 5 times;
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("=========");

        // for loop - kogda znajete skoljko raz nado povtoritj
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        for (int i= 0; i < fruitbasket.length; i++ ) {
            System.out.println(fruitbasket[i]);
        }


        // for each;
        for (String fruit : fruitbasket) {
            System.out.println(fruit);
        }

        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        // Concatenation
        String myName = "Nikita";
        String mySurname = "Milka";
        int myAge = 30;
        System.out.println("n");
        // My name is Nikita Milka. I am 30 years old.
        System.out.println("My name is " + myName + " " + mySurname + ". I am " + myAge + " years old.");
        // String.format();
        System.out.println(
                String.format("My name is %s %s. I am %d years old", myName, mySurname, myAge));

        String template = """
                My name is %s %s. I am %d years old""";
        System.out.println(String.format(template, myName, mySurname, myAge));

        // while loops
        /*
        while(condition) {
        // loop body
        }
         */

        int i = 0;
        while(i < 5) {
            System.out.println("Number: " + i);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        String password = "";

        /*
        String password = "123;
        password.equals("123") = true!
        !password.equals("123") = false
         */

        while (!password.equals("secret")) {
            System.out.println("Enter your password:");
            password = scanner.nextLine();
        }
        System.out.println("Access granted!");


        boolean isGuessed = false;
        while (!isGuessed)
            if(!password.equals("secret")) {
                System.out.println("Enter your password:");
                password = scanner.nextLine();
            } else {
                System.out.println("Access granted!");
                isGuessed = true;
            }


        int guessedNumber = 10;
        int guess;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println("Guess number from 1 to 10");
            guess = myScanner.nextInt();
        } while (guess != guessedNumber);

        System.out.println("Guessed!");

        //Tablica umnozhenija na 5
        System.out.println("Task 1");
        int result;
        for (int i = 1; i < 11; i++){
            result = 5 * i;
            System.out.println("5 * " + i + " = " + result);
        }
        System.out.println(" ");

        // summa chisel ot 1 so 100
        System.out.println("Task 2");
        int sum = 0;
        for (int i = 1; i < 101; i++){
            sum = i + sum;
        }
        System.out.println("Summa chisel ot 1 do 100: " + sum);
        System.out.println(" ");

        // vivesti chisla ot 10 do 1 (while)
        System.out.println("Task 3");
        int j = 10;
        while (j>0){
            System.out.print(j+ " ");
            j--;



    }
}
