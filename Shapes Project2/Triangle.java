/* Project 2 Chae Lee */


public class Triangle extends Shape { // New subclass Triangle of superclass Shape

   private Point vertex1;
   private Point vertex2;
   private Point vertex3;
   
   public double A, B, C;   
      
   Triangle(Point vertex1, Point vertex2, Point vertex3) {
      this.vertex1 = vertex1;
      this.vertex2 = vertex2;
      this.vertex3 = vertex3;
      
      A = vertex1.distance(vertex2); // A is distance from vertex1 and vertex2
      B = vertex2.distance(vertex3);
      C = vertex3.distance(vertex1);
      
      this.nameOfShape = "Triangle";

   }
 
   public boolean isRight() { // Returns true if the triangle is a right triangle, false otherwise
      boolean Right;
      if((A*A + B*B) == (C*C)) // Using Pythagorean Theorem to check if the triangle is right
         Right = true;
      else 
         Right = false;
         
      return Right;
   }

   public boolean isEquilateral() { // Returns true if the triangle is equilateral, false otherwise
      if(A==B && B==C && A==C)
         return true;
      else
         return false;
   
   }
   
   @Override   
   // Override means anything under this takes priority over the exact same method in superclass
   // @Override is an annotation that tells the computer to output an error if i'm overriding wrong
  
   public double computeArea() {
   
      double Area;
      double slope1;
      double slope2;
      double slope3;
      double S;
      
      slope1 = (vertex1.getY() - vertex2.getY()) / (vertex1.getX() - vertex2.getX());
      slope2 = (vertex1.getY() - vertex3.getY()) / (vertex1.getX() - vertex3.getX());
      slope3 = (vertex2.getY() - vertex3.getY()) / (vertex2.getX() - vertex3.getX());

      if((slope1 == slope2 && slope2 == slope3))
      Area = 0;
      else{
         S = 0.5 * (A + B + C); // S is semi-perimeter of a triangle
         Area = Math.sqrt(S*(S-A)*(S-B)*(S-C)); // This is Heron's Formula
      }
      return Area;
   }
   public double computePerimeter() {
      double Perimeter = (A + B + C);
      return Perimeter;
   }
}

