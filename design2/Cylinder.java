public class Cylinder extends Circle 
{
   private double height;
   
   public Cylinder() 
   {
      super();  // invoke superclass' constructor Circle()
      this.height = 1.0;
   }

   public Cylinder(double height) 
   {
      super();  // invoke superclass' constructor Circle()
      this.height = height;
   }

   public Cylinder(double height, double radius) 
   {
      super(radius);  // invoke superclass' constructor Circle(radius)
      this.height = height;
   }
  
   // Getter and Setter
   public double getHeight() 
   {
      return this.height;
   }

   public void setHeight(double height) 
   {
      this.height = height;
   }
   
   public double getVolume() 
   {
      return super.getArea() * this.height;   // use superclass' getArea()
   }

   // Override the getArea() method inherited from superclass Circle
   @Override
   public double getArea() 
   {
      return super.getCircumference() * this.height + 2 * super.getArea();
   }
}
