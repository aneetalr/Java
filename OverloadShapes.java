class mainshapes {
    void area(int a) {
        System.out.println("Area of square : " + a * a);
    }

    void area(int l, int b) {
        System.out.println("Area of rectangle : " + l * b);
    }

    void area(double r) {
        System.out.println("Area of circle : " + 3.14 * r * r);
    }
}

class OverloadShapes {
    public static void main(String args[]) {
        mainshapes s = new mainshapes();
        s.area(4);
        s.area(4, 3);
        s.area(3.0);
    }
}