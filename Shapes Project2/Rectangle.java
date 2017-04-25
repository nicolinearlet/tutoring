/* Project 2 Chae Lee */


public class Rectangle extends Shape { // New subclass Rectangle of superclass Shape

   private Point upperRight;
   private Point lowerLeft;
   public double height, length;
   
   Rectangle(Point upperRight, Point lowerLeft) {
      this.upperRight = upperRight;
      this.lowerLeft = lowerLeft;
     
      this.nameOfShape = "Rectangle";
      
      height = Math.abs(upperRight.getY() - lowerLeft.getY());
      length = Math.abs(upperRight.getX() - lowerLeft.getX());
     
   }
   
   @Override
   // Override means anything under this takes priority over the exact same method in superclass
   // @Override is an annotation that tells the computer to output an error if i'm overriding wrong
  
   public double computeArea() {
      return (length * height);
   }
  
   public double computePerimeter() {
      double Perimeter = 2*(length + height);
      return Perimeter;
   }
   
   public boolean isSquare() { // Returns true if the rectangle is a square, false otherwise
      if(length == height)
         return true;
      else
         return false;
   }
}

