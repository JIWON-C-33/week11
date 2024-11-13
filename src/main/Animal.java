package main;

public class Animal {
    public String color;
    public Location location;

    public void setLocation(Location location) {
        this.location = location;
        System.out.println("위치는 " + location.continent + "의 " + location.habitat + "입니다.");
    }

    public void eat() {
        System.out.println("동물이 음식을 먹습니다.");
    }
}