package lv.acodemy;

public class PezDispenser {
    private String name;
    private String color;
    private String series;
    private int capacity;
    private int candies;


    public PezDispenser(String name, String color, String series, int capacity) {
        this.name = name;
        this.color = color;
        this.series = series;
        this.capacity = capacity;
        this.candies = 0;
    }
// Dispensing one candy:

    public void dispenseOne() {
        if (candies >= 1) {
            candies = candies - 1;
            System.out.println("One candy dispensed. Candies left:" + candies);
        } else {
            System.out.println("The dispenser is empty, please load more candies.");
        }
    }
//Dispensing multiple candies:

    public void dispense(int count) {
        if (count <= 0) {
            System.out.println("Invalid number of candies to dispense.");
        } else if (candies >= count) {
            candies = candies - count;
            System.out.println(count + " candies dispensed. Candies left: " + candies);
        } else {
            System.out.println("Not enough candies! You tried to get " + count + ", but only " + candies + " available");
        }
    }

//Loading one candy

    public void loadOne() {
        if (candies < capacity) {
            candies = candies + 1;
            System.out.println("One candy loaded. Candies now: " + candies);
        } else {
            System.out.println("Dispenser is full! Capacity:" + capacity);
        }
    }

//Loading multiple candies

    public void load(int count) {
        if (count <= 0) {
            System.out.println("Invalid number of candies to load");
        } else if (candies + count <= capacity) {
            candies = candies + count;
            System.out.println(count + " candies loaded. Candies now: " + candies);
        } else {
            System.out.println("Cannot load " + count + " candies. Only " + (capacity - candies) + " more candies can fit");
        }
    }

//Loading to full capacity

    public void fillToFull() {
        if (candies < capacity) {
            int added = capacity - candies;
            candies = capacity;
            System.out.println("Dispenser filled with " + added + " candies. Now full at " + capacity + ".");
        } else {
            System.out.println("Dispenser is already full.");
        }
    }
}


