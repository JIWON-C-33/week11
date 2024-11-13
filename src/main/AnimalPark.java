package main;

public class AnimalPark {
    public static void main(String[] args) {
        Location location = new Location("아프리카", "초원");

        Lion lion = new Lion();
        lion.color = "golden";
        lion.setLocation(location);
        lion.roar();
        lion.eat();

        Elephant elephant = new Elephant();
        elephant.color = "gray";
        elephant.setLocation(new Location("아시아", "숲"));
        elephant.trumpet();
        elephant.trumpet(3);
        elephant.eat();

        Eagle eagle = new Eagle();
        eagle.color = "brown";
        eagle.setLocation(new Location("북아메리카", "산악 지대"));
        eagle.fly();
        eagle.eat();

        Dolphin dolphin = new Dolphin();
        dolphin.color = "blue";
        dolphin.setLocation(new Location("대서양", "바다"));
        dolphin.swim();
        dolphin.swim(20);
        dolphin.eat();
    }
}