// Animal class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass Lion
class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The lion roars");
    }
}

// Subclass Monkey
class Monkey extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The monkey chatters");
    }
}

// Subclass Elephant
class Elephant extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The elephant trumpets");
    }
    public static void main(String[] args) {
        // Creating instances of different animals
        Animal lion = new Lion();
        Animal monkey = new Monkey();
        Animal elephant = new Elephant();
        
        // Demonstrating polymorphism by calling makeSound() on various animal objects
        System.out.println("Lion:");
        lion.makeSound();
        
        System.out.println("\nMonkey:");
        monkey.makeSound();
        
        System.out.println("\nElephant:");
        elephant.makeSound();
    }
}
