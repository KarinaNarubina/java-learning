package lv.acodemy;

public class ThirdLesson {
    public static void main(String[] args) {

        boolean isRaining = true;

        if(isRaining) {
            System.out.println("Take an umbrella!");
        }

        int temperature = 30;
        if(temperature > 29) {
            System.out.println("It is too hot!");
        }
        // AND (&&)
        if (4 > 2 && 10 > 11) {
            System.out.println("Both are equals!");
        }
        // OR (||)
        if (4 < 2 || 10 > 11) {
            System.out.println("Execute this code!");
    }

        // if-else...
        boolean isWeekDay = false;

        if(!isWeekDay) {
        System.out.println("Working today....");
    }  else {
        System.out.println("Will stay at home!");
    }
        int number =10;
        // % -
        //+-/* (

        if(number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        int age = 18;
        if (age >=18) {
            System.out.println("Access granted!");
        }else {
            System.out.println("Access denied!");
        }

        int hour = 7;
        if(hour ==5) {
            System.out.println("Will for run!");
        }else if (hour == 7) {
            System.out.println("Will have have breakfest");
        }else if (hour == 9) {
            System.out.println("Will start work!");
        }else {
            System.out.println("Free time!");
        }

        int score = 90;
        if(score >= 90) {
            System.out.println("Perfect");
        }else if (score >=70) {
            System.out.println("Good");
        }else if (score >=50) {
            System.out.println("OK");
        }else {
            System.out.println("NOT OK");
            }
        }

         }
