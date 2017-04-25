/* Project 2 Chae Lee */


public class Circle extends Shape { // // New subclass Circle of superclass Shape
   private double radius;
   private Point center;

   public Circle(Point center, double radius) {
      this.radius = radius;
      this.center = center;
      
      this.nameOfShape = "Circle";
   }

   @Override
   // Override means anything under this takes priority over the exact same method in superclass
   // @Override is an annotation that tells the computer to output an error if i'm overriding wrong

   public double computeArea() {
      return (Math.PI * Math.pow(radius, 2));
   }
   
   public double computePerimeter() {
      return (Math.PI * 2 * radius);
   }
   
   public void moveCenter(Point P) { // Changes the center to point P, radius remains unchanged;
      double x = P.getX(); 
      double y = P.getY();
      this.center.setX(x); 
      this.center.setY(y);
   }
   
   public void changeRadius(double r) { // Changes the value of the radius to r
      this.radius = r;
   } 
}

