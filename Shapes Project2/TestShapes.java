/* 
Project 2
Chae Lee
I attest that this program is my own work and that, 
other than the Zybook programs mentioned in the instructions, 
I have not copied from other sources.
*/


import java.util.*;

public abstract class TestShapes{ // The Main

   public static void main(String args[]) {
   
   
      Point P1 = new Point(Math.random(), Math.random()); // Will be on a scale of 0 to 1
      Point P2 = new Point(Math.random(), Math.random());
      Point P3 = new Point(Math.random(), Math.random());
   
      double A = P1.distance(P2); // A is distance from point P1 to point P2
      double B = P2.distance(P3);
      double C = P3.distance(P1);
   
      Shape T = new Triangle(P1, P2, P3);
      Shape R1 = new Rectangle(P1, P2);
      Shape R2 = new Rectangle(P2, P3);
      Shape R3 = new Rectangle(P1, P3);
      Shape C1 = new Circle(P1, A);
      Shape C2 = new Circle(P2, B);
   
      ArrayList<Shape> allShapes = new ArrayList<Shape>(6);
      allShapes.add(T);
      allShapes.add(R1);
      allShapes.add(R2);
      allShapes.add(R3);
      allShapes.add(C1);
      allShapes.add(C2);
     
      System.out.println("Point P1 is located at: (" + P1.getX() + ", " + P1.getY()+ ")"); 
      System.out.println("Point P2 is located at: (" + P2.getX() + ", " + P2.getY()+ ")"); 
      System.out.println("Point P3 is located at: (" + P3.getX() + ", " + P3.getY()+ ")"); 
   
   
   /* 
   TRIANGLE CALCULATIONS
   In this section I will do all Triangle related calculations
   - including checking if the triangle is a rght triangle or equilateral 
   */
   
      double TArea = T.computeArea();
      double TPerimeter = T.computePerimeter();
   
   // To check if the triangle is a right triangle or equilateral
   
      if(((Triangle) T).isRight())
         System.out.println("Triangle defined by the three points: P1, P2, and P3 is right triangle");
      else
         System.out.println("Triangle defined by the three points: P1, P2, and P3 is not right triangle");
   
      if(((Triangle) T).isEquilateral())
         System.out.println("Triangle defined by the three points: P1, P2, and P3 is equilateral");
      else
         System.out.println("Triangle defined by the three points: P1, P2, and P3 is not equilateral");
   
   
   /*
   RECTANGLE CALCULATIONS
   In this section I will do all Rectangle related calculations
   - including checking if the rectangles are square or are equal to each other.
   */
   
      double R1Area = R1.computeArea();
      double R2Area = R2.computeArea();
      double R3Area = R3.computeArea();
   
      double R1Perimeter = R1.computePerimeter();
      double R2Perimeter = R2.computePerimeter();
      double R3Perimeter = R3.computePerimeter();
   
   // Checking if the Rectangles are square
   
      if(((Rectangle)R1).isSquare())
         System.out.println("Rectangle defined by the two points: P1 and P2 is square");
      else
         System.out.println("Rectangle defined by the two points: P1 and P2 is not a square");
   
      if(((Rectangle)R2).isSquare())
         System.out.println("Rectangle defined by the two points: P1 and P2 is square");
      else
         System.out.println("Rectangle defined by the two points: P1 and P2 is not a square"); 
   
      if(((Rectangle)R3).isSquare())
         System.out.println("Rectangle defined by the two points: P1 and P2 is square");
      else
         System.out.println("Rectangle defined by the two points: P1 and P2 is not a square"); 
   
   // Checking if Rectangle 1 has equality to any other Rectangles
   
      if(R1Perimeter == R2Perimeter){
         if(R1Perimeter == R3Perimeter)
            System.out.println("All generated rectangles have equal perimeters");
         else
            System.out.println("Rectangle defined by the two points: " + P1 + P2 + " has equal perimeter as Rectangle defined by the two points:" + P2 + P3);
      }
      
      else if(R1Perimeter == R3Perimeter)
         System.out.println("Rectangle defined by the two points: " + P1 + P2 + " has equal perimeter to Rectangle defined by the two points:" + P1 + P3);
   
      if(R1Area == R2Area){
         if(R1Area == R3Area)
            System.out.println("All generated rectangles have equal Areas");
         else
            System.out.println("Rectangle defined by the two points: " + P1 + P2 + " has equal area to Rectangle defined by the two points:" + P2 + P3);
      }
      
      else if(R1Area == R3Area)
         System.out.println("Rectangle defined by the two points: " + P1 + P2 + " has equal area to Rectangle defined by the two points:" + P1 + P3);
      
      // Checking if Rectangle 2 has equality to Rectangle 3
      
      else if(R2Perimeter == R3Perimeter){
         System.out.println("Rectangle defined by the two points: " + P2 + P3 + "has equal perimeter as Rectangle defined by the two points:" + P1 + P3);
      }
      
      else if(R2Area == R3Area){
         System.out.println("Rectangle defined by the two points: " + P2 + P3 + " has equal area to Rectangle defined by the two points:" + P1 + P3);
      }
      
      else
         System.out.println("All Rectangle have different Perimeters and Areas");
   
   
   /* 
   CIRCLE CALCULATIONS
   In this section I will do all Circle related calculations.
   */
   
      double C1Area = C1.computeArea();
      double C2Area = C2.computeArea();
   
      double C1Perimeter = C1.computePerimeter();
      double C2Perimeter = C2.computePerimeter();
   
   
   /* 
   ARRAYLIST MANIPULATION 
   In this section, I will manipulate the ArrayList. 
   First, I will print the content of the ArrayList from the 6 previously created shapes to the ArrayList, which is ArrayList unsorted. 
   Next, I will print the content of the ArrayList sorted by Perimeter. 
   Finally, I will print the conetne of the ArrayList sorted by Area.
   */
   
   // Arraylist Unsorted
   
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("ArrayList Unsorted");
   
      int i;
      for (i = 0; i < 6; i++) {
      
         Shape temp = (Shape) allShapes.get(i);
      
         System.out.println(temp.nameOfShape + "   Area: " + temp.computeArea() + " - Perimeter:" + temp.computePerimeter());
      
      }
   
   // ArrayList Sorted by Perimeter (Smallest to Largest)
selectionSort(allShapes);
   
   
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("ArrayList Sorted by Perimeter (Smallest to Largest)");
    
   
      for (i = 0; i < 6; i++) {
      
         Shape temp = (Shape) allShapes.get(i);
      
         System.out.println(temp.nameOfShape + "   Area: " + temp.computeArea() + " - Perimeter:" + temp.computePerimeter());
      
      }
   
      Collections.sort(allShapes);
   
   // ArrayList Sorted by Area (Smallest to Largest)
   
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("ArrayList Sorted by Area (Smallest to Largest)");
   
      for (i = 0; i < 6; i++) {
      
         Shape temp = (Shape) allShapes.get(i);
      
         System.out.println(temp.nameOfShape + "   Area: " + temp.computeArea() + " - Perimeter:" + temp.computePerimeter());
      
      } 
   
      return;
   }
   
   public static void selectionSort(ArrayList<Shape>perimSort){
      int smallestIndex;
      double smallest;
   
      for (int i = 0; i < perimSort.size(); i++) {
      
      	/* find the index at which the element has smallest value */
      	// initialize variables
         smallest = perimSort.get(i).computePerimeter();
         smallestIndex = i;
      
         for (int k = i + 1; k < perimSort.size(); k++) {
            if (smallest > perimSort.get(k).computePerimeter()) {
            	// update smallest
               smallest = perimSort.get(k).computePerimeter();
               smallestIndex = k;
            }
         }
      
      	/* swap the value */
      	// do nothing if the curIndex has the smallest value
         if (smallestIndex == i)
            ;
         // swap values otherwise
         else {
            Shape temp = perimSort.get(i);
            perimSort.set(i, perimSort.get(smallestIndex));
            perimSort.set(smallestIndex, temp);
         }
      
      }
   }
    
}