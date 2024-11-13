package main;

public class Elephant extends Animal {
    public void trumpet() {
        System.out.println("코끼리가 큰 소리를 냅니다!");
    }

    public void trumpet(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("코끼리가 큰 소리를 냅니다!");
        }
    }
}