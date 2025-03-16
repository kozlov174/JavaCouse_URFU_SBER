package LabWork2_Kozlov;

interface Shape {
    double calculateArea();      // Метод для вычисления площади
    double calculatePerimeter(); // Метод для вычисления периметра
}
class Circle implements Shape{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
//У нас будет строго ПРЯМОУГОЛЬНЫЙ треугольник
class Triangle implements Shape{
    private int heigth;
    private int base;

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getBase() {
        return base;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    public double calculateArea() {
        return (base*heigth)/2;
    }

    @Override
    public double calculatePerimeter() {
        double hypotenuse = Math.sqrt(base * base + heigth * heigth); // Гипотенуза
        return base + heigth + hypotenuse;
    }
}
class Square implements Shape{
    private int lenght;

    public Square(int lenght){
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public double calculateArea() {
        return lenght*4;
    }

    @Override
    public double calculatePerimeter() {
        return lenght*lenght;
    }
}