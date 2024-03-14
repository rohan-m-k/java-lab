import java.util.Scanner;

interface a {
    void input();
    void area();
}

class triangle implements a {
    int l, h;
    double area;

    public void input() {
        System.out.println("Enter the length and height of the triangle:");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        h = sc.nextInt();
        sc.close();
    }

    public void area() {
        area = 0.5 * l * h;
        System.out.println("Area of the triangle: " + area);
    }
}

class rectangle implements a {
    int l, b;
    double area;

    public void input() {
        System.out.println("Enter the length and breadth of the rectangle:");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b = sc.nextInt();
        //sc.close();
    }

    public void area() {
        area = l * b;
        System.out.println("Area of the rectangle: " + area);
    }
}

class cube implements a {
    int s;
    double area;

    public void input() {
        System.out.println("Enter the side length of the cube:");
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        //sc.close();
    }

    public void area() {
        area = 6 * s * s;
        System.out.println("Surface area of the cube: " + area);
    }
}

public class interface007 {
    public static void main(String[] args) {
        triangle t = new triangle();
        rectangle r = new rectangle();
        cube c = new cube();

        t.input();
        t.area();

        r.input();
        r.area();

        c.input();
        c.area();
    }
}

