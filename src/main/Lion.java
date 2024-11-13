package main;

public class Lion extends Animal {
    public void roar() {
        System.out.println("사자가 포효합니다!");
    }

    @Override
    public void eat() {
        System.out.println("사자가 고기를 먹습니다.");
    }
}