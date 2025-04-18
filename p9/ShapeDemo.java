abstract class Shape {
    final float PI = 3.14f;
    int r;

    Shape(int a) {
        r = a;
    }

    abstract void area();

    abstract void volume();
}

class Sphere extends Shape {
    float a, v;

    Sphere(int a) {
        super(a);
    }

    void area() {
        a = (float) (4.0 * PI * r * r);
        System.out.println("Area of sphere is " + a);
    }

    void volume() {
        v = (float) ((4 * PI * r * r * r) / 3);
        System.out.println("Volume of sphere is " + v);
    }
}

class Cone extends Shape {
    float a, v, l, h;

    Cone(int a) {
        super(a);
        l = 4.0f;
        h = 4.0f;
    }

    void area() {
        a = (float) (PI * r * (r + l));
        System.out.println("Area of cone is " + a);
    }

    void volume() {
        v = (float) ((PI * r * r * h) / 3);
        System.out.println("Volume of cone is " + v);
    }
}

class Cylinder extends Shape {
    float a, v, h;

    Cylinder(int a) {
        super(a);
        h = 4.0f;
    }

    void area() {
        a = (float) (2.0 * PI * r * (r + h));
        System.out.println("Area of cylinder is " + a);
    }

    void volume() {
        v = (float) (PI * r * r * h);
        System.out.println("Volume of cylinder is " + v);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Sphere sp = new Sphere(2);
        sp.area();
        sp.volume();

        Cone c = new Cone(6);
        c.area();
        c.volume();

        Cylinder cy = new Cylinder(8);
        cy.area();
        cy.volume();
    }
}
