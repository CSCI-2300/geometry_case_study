public class Cylinder 
{
   private Circle base;
   private double height;
   
   public Cylinder() 
   {
      this.base = new Circle();
      this.height = 1.0;
   }

   public Cylinder(double height) 
   {
      this.base = new Circle();
      this.height = height;
   }

   public Cylinder(double height, double radius) 
   {
      this.base = new Circle(radius);
      this.height = height;
   }
  
   public double getHeight() 
   {
      return this.height;
   }

   public void setHeight(double height) 
   {
      this.height = height;
   }
  
   public void setXYZ(double x, double y, double z)
   {
      this.base.setXYZ(x,y,z);
   }

   public double getVolume() 
   {
      return this.base.getArea() * this.height;
   }

   public double getArea() 
   {
      return this.base.getCircumference() * this.height + 2 * this.base.getArea();
   }
}
