/* Project 2 Chae Lee */


public class Point {

   private double x;
   private double y;

   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public double getX() {
      return x;
   }

   public double getY() {
      return y;
   }

   public void setX(double x) {
           this.x = x;
           
           return;
   }
   
   public void setY(double y) {
           this.y = y;
           
           return;
   }
   
   public double distance(Point P) { // Which computes the distance from a given point ppassed in as a parameter;
      
      double xOfP = P.getX();
      double yOfP = P.getY();
      double DistanceX = Math.pow((this.x - xOfP),2);
      double DistanceY = Math.pow((this.y - yOfP),2);
      
      double D = Math.sqrt (DistanceX + DistanceY);
      
         return D;
      }
}

