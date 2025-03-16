package LabWork2_Kozlov;

//В данной задаче уделили чуть больше времени школьной математике, поэтому формулы местами интересные
//Однако вопрос к JAVA. В данном коде можно видеть большую S, которая означает Second
//Она появилась как только у меня начали лететь ошибки на схожий класс из Example6
//Также увеличил сложность своей жизни и приблизился к реализму путём первода int в double

class ShapeS {
    double area() {
        return 0;
    }

    double perimeter() {
        return 0;
    }
}

class CircleS extends ShapeS {
    double radius;

    CircleS(double r) {
        this.radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class SquareS extends ShapeS {
    double side;

    SquareS(double s) {
        this.side = s;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}

class TriangleS extends ShapeS {
    double a, b, c;

    TriangleS(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}

class Main {
    public static void main(String[] args) {
        CircleS circle = new CircleS(5);
        System.out.println("Круг: Площадь = " + circle.area() + ", Периметр = " + circle.perimeter());

        SquareS square = new SquareS(4);
        System.out.println("Квадрат: Площадь = " + square.area() + ", Периметр = " + square.perimeter());

        TriangleS triangle = new TriangleS(3, 4, 5);
        System.out.println("Треугольник: Площадь = " + triangle.area() + ", Периметр = " + triangle.perimeter());
    }
}
