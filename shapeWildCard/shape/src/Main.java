

import java.util.List;
import java.util.ArrayList;
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    @Override
    void draw (){
        System.out.println("drawing the RECTANGLE shape");
    }
}
class Circle extends Shape{
    @Override
    void draw (){
        System.out.println("drawing the CIRCLE shape");
    }
}
class shapeTesting {
    //use wildcard
    static void shapeDrawing (List <? extends Shape> shapes ){
        for (Shape shape : shapes){
            shape.draw();
        }

    }
}


public class Main {
    public static void main(String[] args) {
        List <Rectangle> rectangles=new ArrayList<>();
        List <Circle> circles=new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());
        shapeTesting.shapeDrawing(rectangles);
        circles.add(new Circle());
        shapeTesting.shapeDrawing(circles);
    }
}