class family {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.printValue();
    }
}

class Parent {
    int value = 10;

    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    int value = 20; // 부모의 value와 동일한 이름

    @Override
    void display() {
        super.display(); // 부모 클래스의 display() 메서드 호출
        System.out.println("Child display");
    }

    void printValue() {
        System.out.println("Parent value: " + super.value); // 부모 클래스의 value 변수 접근
        System.out.println("Child value: " + this.value);
    }
}