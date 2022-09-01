public class Cylinder
{
   private double height;
   private double radius;
   private double x, y, z;

   public Cylinder()
   {
      this.height = 1.0;
      this.radius = 1.0;
      setDefaultCoordinates();
   }

   public Cylinder(double height) 
   {
      this.height = height;
      this.radius = 1.0;
      setDefaultCoordinates();
   }

   public Cylinder(double height, double radius) 
   {
      this.height = height;
      this.radius = radius;
      setDefaultCoordinates();
   }
  
   private void setDefaultCoordinates()
   {
      this.x = 0;
      this.y = 0;
      this.z = 0;    
   }

   public double getHeight() 
   {
      return this.height;
   }

   public double getRadius()
   {
      return this.radius;
   }   

   public void setHeight(double height) 
   {
      this.height = height;
   }
   
   public void setXYZ(double x, double y, double z)
   {
      this.x = x;
      this.y = y;
      this.z = z;
   }

   private double getBaseArea()
   {
      return Math.PI * this.radius * this.radius;
   }
   
   public double getVolume() 
   {
      return height * getBaseArea();
   }

   public double getArea() 
   {
      return 2 * Math.PI * getRadius() * height + 2 * getBaseArea();
   }

}
