import java.util.ArrayList;
import java.util.Random;

// Abstract class representing an Animal
abstract class Animal {
    String species;
    String gender;
    int x;
    int y;

    // Constructor to initialize an Animal
    public Animal(String species, String gender, int x, int y) {
        this.species = species;
        this.gender = gender;
        this.x = x;
        this.y = y;
    }

    // Abstract method for the animal's movement
    public abstract void move();
}

// Child class representing a Sheep
class Sheep extends Animal {
    // Constructor to initialize a Sheep
    public Sheep(String gender, int x, int y) {
        super("sheep", gender, x, y);
    }

    @Override
    public void move() {
        // Sheep moves randomly either horizontally or vertically within a boundary
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            this.x += 1;
            this.x = Math.max(0, Math.min(this.x, 499));
        } else {
            this.y += 1;
            this.y = Math.max(0, Math.min(this.y, 499));
        }
    }
}

class Cow extends Animal {
    // Constructor to initialize a Cow
    public Cow(String gender, int x, int y) {
        super("cow", gender, x, y);
    }

    @Override
    public void move() {
        // Cow moves randomly either horizontally or vertically within a boundary
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            this.x += 1;
            this.x = Math.max(0, Math.min(this.x, 499));
        } else {
            this.y += 1;
            this.y = Math.max(0, Math.min(this.y, 499));
        }
    }
}

class Chicken extends Animal {
    // Constructor to initialize a Chicken
    public Chicken(String gender, int x, int y) {
        super("chicken", gender, x, y);
    }

    @Override
    public void move() {
        // Chicken moves randomly either horizontally or vertically within a boundary
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            this.x += 1;
            this.x = Math.max(0, Math.min(this.x, 499));
        } else {
            this.y += 1;
            this.y = Math.max(0, Math.min(this.y, 499));
        }
    }
}

class Rooster extends Animal {
    // Constructor to initialize a Rooster
    public Rooster(String gender, int x, int y) {
        super("rooster", gender, x, y);
    }

    @Override
    public void move() {
        // Rooster moves randomly either horizontally or vertically within a boundary
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            this.x += 1;
            this.x = Math.max(0, Math.min(this.x, 499));
        } else {
            this.y += 1;
            this.y = Math.max(0, Math.min(this.y, 499));
        }
    }
}

class Wolf extends Animal {
    // Constructor to initialize a Wolf
    public Wolf(String gender, int x, int y) {
        super("wolf", gender, x, y);
    }

    @Override
    public void move() {
        // Wolf moves randomly either horizontally or vertically within a boundary
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            this.x += 1;
            this.x = Math.max(0, Math.min(this.x, 499));
        } else {
            this.y += 1;
            this.y = Math.max(0, Math.min(this.y, 499));
        }
    }
}

class Lion extends Animal {
    // Constructor to initialize a Lion
    public Lion(String gender, int x, int y) {
        super("lion", gender, x, y);
    }

    @Override
    public void move() {
        // Lion moves randomly either horizontally or vertically within a boundary
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            this.x += 1;
            this.x = Math.max(0, Math.min(this.x, 499));
        } else {
            this.y += 1;
            this.y = Math.max(0, Math.min(this.y, 499));
        }
    }
}

class Hunter extends Animal {
    // Constructor to initialize a Hunter
    public Hunter(int x, int y) {
        super("hunter", "male", x, y);
    }

    @Override
    public void move() {
        // Hunter moves randomly either horizontally or vertically within a boundary
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            this.x += 1;
            this.x = Math.max(0, Math.min(this.x, 499));
        } else {
            this.y += 1;
            this.y = Math.max(0, Math.min(this.y, 499));
        }
    }
}

class Main {
    // Method to create a new instance of an Animal based on species and gender
    static Animal newAnimal(String species, String gender) {
        Random random = new Random();
        int x = random.nextInt(500);
        int y = random.nextInt(500);
        switch (species) {
            // Create an instance of the corresponding animal type
            case "sheep":
                return new Sheep(gender, x, y);
            case "cow":
                return new Cow(gender, x, y);
            case "chicken":
                return new Chicken(gender, x, y);
            case "rooster":
                return new Rooster(gender, x, y);
            case "wolf":
                return new Wolf(gender, x, y);
            case "lion":
                return new Lion(gender, x, y);
            case "hunter":
                return new Hunter(x, y);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        // ArrayList to hold all animals
        ArrayList<Animal> animals = new ArrayList<>();
        // Populate the list with initial animals
        // This loop initializes 15 sheep (both male and female), 5 cows (both male and
        // female), and so on.
        // The numbers are based on the specified counts in the loop.
        for (int i = 0; i < 15; i++) {
            animals.add(newAnimal("sheep", "male"));
            animals.add(newAnimal("sheep", "female"));
        }
        for (int i = 0; i < 5; i++) {
            animals.add(newAnimal("cow", "male"));
            animals.add(newAnimal("cow", "female"));
        }
        for (int i = 0; i < 10; i++) {
            animals.add(newAnimal("chicken", "male"));
            animals.add(newAnimal("rooster", "female"));
        }
        for (int i = 0; i < 5; i++) {
            animals.add(newAnimal("wolf", "male"));
            animals.add(newAnimal("wolf", "female"));
        }
        for (int i = 0; i < 4; i++) {
            animals.add(newAnimal("lion", "male"));
            animals.add(newAnimal("lion", "female"));
        }
        // Add a hunter with random coordinates
        animals.add(new Hunter(new Random().nextInt(500), new Random().nextInt(500)));
        // Simulation loop
        // When this part runs 72 times and then Animal.move() is called 1008 times.
        for (int i = 0; i < 72; i++) {
            for (Animal animal : animals) {
                if (animal.species.equals("chicken") || animal.species.equals("rooster")
                        || animal.species.equals("hunter")) {
                    animal.move();
                } else if (animal.species.equals("sheep") || animal.species.equals("cow")) {
                    animal.move();
                    animal.move();
                } else if (animal.species.equals("wolf")) {
                    animal.move();
                    animal.move();
                    animal.move();
                } else if (animal.species.equals("lion")) {
                    animal.move();
                    animal.move();
                    animal.move();
                    animal.move();
                }
            }

            for (int j = 0; j < animals.size(); j++) {
                Animal animal = animals.get(j);
                for (int k = 0; k < animals.size(); k++) {
                    Animal otherAnimal = animals.get(k);
                    if (otherAnimal.species.equals(animal.species) && !otherAnimal.gender.equals(animal.gender) &&
                            Math.abs(otherAnimal.x - animal.x) <= 3 && Math.abs(otherAnimal.y - animal.y) <= 3) {
                        animals.add(newAnimal(animal.species, Math.random() < 0.5 ? "male" : "female"));
                    }
                }
                if (animal.species.equals("wolf")) {
                    for (int k = 0; k < animals.size(); k++) {
                        Animal otherAnimal = animals.get(k);
                        if ((otherAnimal.species.equals("sheep") || otherAnimal.species.equals("chicken")
                                || otherAnimal.species.equals("rooster")) &&
                                Math.abs(otherAnimal.x - animal.x) <= 4 && Math.abs(otherAnimal.y - animal.y) <= 4) {
                            animals.remove(otherAnimal);
                            break;
                        }
                    }
                } else if (animal.species.equals("lion")) {
                    for (int k = 0; k < animals.size(); k++) {
                        Animal otherAnimal = animals.get(k);
                        if ((otherAnimal.species.equals("cow") || otherAnimal.species.equals("sheep")) &&
                                Math.abs(otherAnimal.x - animal.x) <= 5 && Math.abs(otherAnimal.y - animal.y) <= 5) {
                            animals.remove(otherAnimal);
                            break;
                        }
                    }
                } else if (animal.species.equals("hunter")) {
                    for (int k = 0; k < animals.size(); k++) {
                        Animal otherAnimal = animals.get(k);
                        if (!otherAnimal.species.equals("hunter") &&
                                Math.abs(otherAnimal.x - animal.x) <= 8 && Math.abs(otherAnimal.y - animal.y) <= 8) {
                            animals.remove(otherAnimal);
                            break;
                        }
                    }
                }
            }
        }
        // Counter variables are created for each animal type and initialized to 0
        int sheepCount = 0;
        int cowCount = 0;
        int chickenCount = 0;
        int roosterCount = 0;
        int wolfCount = 0;
        int lionCount = 0;
        int hunterCount = 0;

        // Iterate over each animal in the list and increment the respective counters
        // for each type
        for (Animal animal : animals) {
            switch (animal.species) {
                case "sheep":
                    sheepCount++;
                    break;
                case "cow":
                    cowCount++;
                    break;
                case "chicken":
                    chickenCount++;
                    break;
                case "rooster":
                    roosterCount++;
                    break;
                case "wolf":
                    wolfCount++;
                    break;
                case "lion":
                    lionCount++;
                    break;
                case "hunter":
                    hunterCount++;
                    break;
            }
        }

        // Print the final count for each type
        System.out.println("sheep: " + sheepCount);
        System.out.println("cow: " + cowCount);
        System.out.println("chicken: " + chickenCount);
        System.out.println("rooster: " + roosterCount);
        System.out.println("wolf: " + wolfCount);
        System.out.println("lion: " + lionCount);
        System.out.println("hunter: " + hunterCount);

    }
}
