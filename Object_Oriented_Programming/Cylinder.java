package Object_Oriented_Programming;

class Cylinder {
    private int radius;
    private int height;

    Cylinder() {
        radius = height = 1;
    }

    Cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    int getHeight() {
        return height;
    }

    int getRadius() {
        return radius;
    }

    void setHeight(int h) {
        if (h >= 0)
            height = h;
        else
            height = 0;
    }

    void setRadius(int r) {
        if (r >= 0)
            radius = r;
        else
            radius = 0;
    }

    void setDimensions(int h, int r) {
        height = h;
        radius = r;
    }

    double lidArea() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }

    double drumArea() {
        return 2 * lidArea() + perimeter() * height;
    }

    double volume() {
        return lidArea() * height;
    }
}

class CylinderTest {

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimensions(10, 7);

        System.out.println("LidArea :" + c.lidArea());
        System.out.println("Circumference :" + c.perimeter());
        System.out.println("Total Surface Area :" + c.drumArea());
        System.out.println("Volume :" + c.volume());
        System.out.println("Height :" + c.getHeight());
        System.out.println("Radius :" + c.getRadius());

    }

}