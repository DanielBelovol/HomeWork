public interface Shape {
    void printName();
}
class Square implements Shape{

    @Override
    public void printName () {
        System.out.println("Square");
    }
}

class Cube implements Shape{
    public void printName(){
        System.out.println("Cube");
    }
}

class Circle implements Shape{
    @Override
    public void printName() {
        System.out.println("Circle");
    }
}

class Triangle implements Shape{
    @Override
    public void printName() {
        System.out.println("Triangle");
    }
}

class Rectangle implements Shape{
    @Override
    public void printName() {
        System.out.println("Rectangle");
    }
}
class ShapeTest{
    public static void main(String[] args) {
        Shape square = new Square();
        Shape cube = new Cube();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();

        square.printName();
        cube.printName();
        circle.printName();
        triangle.printName();
        rectangle.printName();

    }

}