package lv.acodemy;

public class Jasmine_Disney {
    public static void main(String[] args) {

// Creating a PezDispenser object

        PezDispenser Jasmine = new PezDispenser("Princess Jasmine", "Turquoise","DISNEY",12);

// Loading candies

        Jasmine.load(5);
        Jasmine.loadOne();
        Jasmine.fillToFull();

// Dispensing candies

        Jasmine.dispense(3);
        Jasmine.dispenseOne();

// Trying to dispense more candies than available

         Jasmine.dispense(10);

    }
  }
