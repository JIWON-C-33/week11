package main.animal;

import main.Animal;

public class Dolphin extends Animal {
    public void swim() {
        System.out.println("돌고래가 바다를 헤엄칩니다!");
    }

    public void swim(int speed) {
        System.out.println("돌고래가 시속 " + speed + "km로 헤엄칩니다!");
    }
}