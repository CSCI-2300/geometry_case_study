public class Circle
{
   private double radius;
   private double x;
   private double y;
   private double z;

   public Circle()
   {
      setOrigin();
      this.radius = 1.0;
   }

   public Circle(double radius)
   {
      setOrigin();
      this.radius = radius;
   }

   public Circle(double radius, double x, double y, double z)
   {
      this.radius = radius;
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public void setOrigin()
   {
      this.x = 0;
      this.y = 0;
      this.z = 0;
   }

   public void setXYZ(double x, double y, double z)
   {
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public double getCircumference()
   {
      return 2 * Math.PI * this.radius;
   }

   public double getArea()
   {
      return Math.PI * this.radius * this.radius;
   }
}
