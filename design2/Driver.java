public class Driver
{
   public static void main(String []args)
   {
      Cylinder cyl = new Cylinder();
      Cylinder cyl2 = new Cylinder(10.0);

      Circle circle = new Circle();

      System.out.println("Circumference of cylinder is: "+cyl.getCircumference());
      System.out.println("Volume of cylinder is " + cyl.getVolume());

      System.out.println("Area of the circle is " + circle.getArea());
      System.out.println("Area of the cylinder is " + cyl.getArea());

      Circle c1 = cyl;
      c1.getCircumference();

      // WILL NOT COMPILE
      // Cylinder cyl1 = circle;

      System.out.println("Area of c1 is " + c1.getArea());
   }
}
