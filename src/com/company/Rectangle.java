package com.company;

public class Rectangle {

    private int sideA, sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(int sideA) {
        this.sideA = sideA;
        this.sideB = 5;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 5;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int area(){
        return this.sideA * this.sideB;
    }

    public int perimeter(){
        return ((this.sideA + this.sideB)*2);
    }

    public boolean isSquare(){
        return this.sideA == this.sideB;
    }

    public void replaceSides(){
        int a = this.sideA;
        this.sideA = sideB;
        this.sideB = a;

    }


}
