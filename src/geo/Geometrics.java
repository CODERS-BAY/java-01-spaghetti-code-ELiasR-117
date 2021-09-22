package geo;
public class Geometrics {

    public static double SquareArea(double x) {
        return  x*x;

    }
    public static double SquarePerimeter(double x){
        return 4*x;
        
    }

    public static double RectangleArea(double x, double y) {
        return x*y;
    }

    public static double RectanglePerimter(double x, double y){
        return x+y;
    }

    public static double VolumeOfASphere(double x, double y, double z) {
        return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    }
    public static double SphereWithCylinder (double z){
        return (Math.PI * Math.pow(z, 3) / 6);
    }

    public static double Ungula (double x, double z) {
        return ((double) (2 * x * z) / 3);
    }

public static void main (String[] args) {
    System.out.println(VolumeOfASphere(17, 26, 30));
}  

    // public static void main(String[] args) {
    //     // area ... Fläche
    //     System.out.println("Square area");
    //     System.out.println("x * x = " + x * x);
    //     System.out.println("x1 * x1 = " + x1 * x1);
    //     System.out.println("x2 * x2 = " + x2 * x2);
    //     System.out.println("y * y = " + y * y);

    //     // perimeter ... Umfang
    //     System.out.println("Square perimeter");
    //     
    //     System.out.println("4 * x1 = " + 4 * x1);
    //     System.out.println("4 * x2 = " + 4 * x2);
    //     System.out.println("4 * y = " + 4 * y);

    //     System.out.println("Rectangle area");
    //     System.out.println("x * y = " + x * y);
    //     System.out.println("x1 * y1 = " + x1 * y1);
    //     System.out.println("x2 * y2 = " + x2 * y2);
    //     System.out.println("x3 * y3 = " + x3 * y3);

    //     System.out.println("Rectangle perimeter");
    //     System.out.println("x + y = " + x + y);
    //     System.out.println("x1 + y1 = " + x1 + y1);
    //     System.out.println("x2 + y2 = " + x2 + y2);
    //     System.out.println("x3 + y3 = " + x3 + y3);

    //     System.out.println("We can also calculate some volumes");
    //     /*
    //         z is our height
    //         y is our radius
    //      */
    //     System.out.println("Zone of a sphere");
    //     double v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    //     System.out.println(v);

    //     System.out.println("Sphere with cylinder");
    //     System.out.println(Math.PI * Math.pow(z, 3) / 6);

    //     System.out.println("Ungula");
    //     System.out.println((double) (2 * x3 * z3) / 3);
    // }
}
