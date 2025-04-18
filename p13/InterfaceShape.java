interface Shape {
    final float PI = 3.14f;

    abstract void area();
}

class Circle implements Shape {
    public void area() {
        float a = PI * 2.0f * 2.0f;
        System.out.println("Area of circle is " + a);
    }
}

class Sphere implements Shape {
    public void area() {
        float a = 4.0f * PI * 2.0f * 2.0f;
        System.out.println("Area of sphere is " + a);
    }
}

public class InterfaceShape {
    public static void main(String args[]) {
        Circle c = new Circle();
        Sphere s = new Sphere();

        c.area();
        s.area();
    }
}
