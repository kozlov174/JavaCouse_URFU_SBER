package LabWork2_Kozlov;

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Звук животного");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Ловлю мячик!");
    }
}

class Cat extends Animal {
    private String foodType;

    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("Царапаю диван!");
    }
}

class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    public void fly() {
        if (canFly) {
            System.out.println("Летает!");
        } else {
            System.out.println("Эта птица не умеет летать");
        }
    }
}

class MainS {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");

        dog.makeSound();
        dog.fetch();

        Cat cat = new Cat("Whiskers", 2, "Dry Food");
        cat.makeSound();
        cat.scratch();

        Bird bird = new Bird("Tweety", 1, false);
        bird.makeSound();
        bird.fly();
    }
}