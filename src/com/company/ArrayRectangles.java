package com.company;

public class ArrayRectangles {
    private final Rectangle[] rectangleArray;


    public ArrayRectangles(int n) {
        this.rectangleArray = new Rectangle[n];

    }

//    public  void generateArray() {
//        Rectangle r1 = new Rectangle(9,8);
//        Rectangle r2 = new Rectangle(6,7);
//        Rectangle r3 = new Rectangle(5);
//        Rectangle r4 = new Rectangle(10);
//        Rectangle r5 = new Rectangle();
//        rectangleArray[0]=r1;
//        rectangleArray[1]=r2;
//        rectangleArray[2]=r3;
//        rectangleArray[3]=r4;
//        rectangleArray[4]=r5;
//    }

    public ArrayRectangles(Rectangle[] rectangleArray) {
        this.rectangleArray=new Rectangle[rectangleArray.length];
        for (int i = 0; i < rectangleArray.length; i++) {
            if(rectangleArray[i]!=null){
                this.rectangleArray[i]= new Rectangle(rectangleArray[i].getSideA(),rectangleArray[i].getSideB());
            }
        }
    }

    public boolean addRectangle( Rectangle rectangle){
        for (int i = 0; i < rectangleArray.length; i++) {
            if(rectangleArray[i]==null){
            this.rectangleArray[i]=rectangle;

            return true;
            }
        }
        return false;
    }

    public int numberMaxArea(){
        int maxAreaIndex=0;
        int maxFirstArea=0;
        for (int i = 0; i < rectangleArray.length; i++) {
            if(maxFirstArea<rectangleArray[i].area()){
                maxAreaIndex = i;
                maxFirstArea=rectangleArray[i].area();
            }else break;
        }
        return maxAreaIndex;
    }

    public int numberMinPerimeter(){
        int minPerimeterIndex = 0;
        int minFirstPerimeter = Integer.MAX_VALUE;
        for (int i = 0; i < rectangleArray.length; i++) {
            if(rectangleArray[i].perimeter()<minFirstPerimeter){
                minPerimeterIndex = i;
                minFirstPerimeter = rectangleArray[i].perimeter();
            } else break;
        }
        return minPerimeterIndex;
    }

    public int numberSquares(){
        int squares=0;
        for (Rectangle rectangle : rectangleArray) {
            if (rectangle.isSquare()) {
                squares++;
            }
        }
        return squares;
    }

//    public static void main(String[] args) {
//        ArrayRectangles arrayRectangles1 = new ArrayRectangles(7);
//        arrayRectangles1.generateArray();
//        System.out.println(arrayRectangles1.addRectangle(new Rectangle(8,8)));
//        System.out.println(arrayRectangles1.addRectangle(new Rectangle(2,2)));
//        System.out.println(arrayRectangles1.numberSquares());
//        System.out.println(arrayRectangles1.numberMaxArea());
//        System.out.println(arrayRectangles1.numberMinPerimeter());
//    }
}
