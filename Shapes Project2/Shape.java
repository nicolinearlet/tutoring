/* Project 2 Chae Lee */


public abstract class Shape implements Comparable<Shape> {
   
   String nameOfShape;  
   
   abstract double computeArea();
   abstract double computePerimeter();
   
   @Override
   // Override means anything under this takes priority over the exact same method in superclass
   // @Override is an annotation that tells the computer to output an error if i'm overriding wrong

   public int compareTo(Shape s){ // Sorting the ArrayLisy by Area
      if(this.computeArea()< s.computeArea())
         return -1;
      else if(this.computeArea()==s.computeArea())
         return 0;
      else 
         return 1;
   }
    public double compare(Shape S1, Shape S2){
      return S1.computePerimeter() -S2.computePerimeter();
    }
   
 
  //  public ArrayList<Shape> sortPerimeter(ArrayList<Shape> allShapes){ // Sorting the ArrayList by Perimeter
//       ArrayList<Shape> sortedArray= new ArrayList<Shape> (6);
//       int i,k;
//       for(i=0;i<6 ;i++){
//        for(k=i+1; k<6 ; k++){
//          if(allShapes.get(i).computePerimeter()<allShapes.get(k).computePerimeter()){
//             sortedArray.set(0)=allShapes.get(i);
//          }
//       }  
//      }
//        for(i=0;i<6 ;i++){
//        for(k=i+1; k<6 ; k++){
//          if(allShapes.get(i).computePerimeter()>allShapes.get(k).computePerimeter()){
//             sortedArray.set(5)=allShapes.get(i);
//          }
//       }  
//     }
   
}
