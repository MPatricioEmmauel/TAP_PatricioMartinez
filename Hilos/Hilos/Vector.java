public class Vector{
   private static double[] vector;
   public static HiloSuma h1;
   public static HiloSuma2 h2;
   public static HiloMedia h3;
   
   public Vector(int t) {
      vector = new double[t];
      for(int i = 0; i < vector.length; i++)
         vector[i] = (int)(Math.random()*100+1);
      
      System.out.println("Elementos del vector");
      System.out.println("______________");
      for(int i = 0; i < vector.length; i++){
         System.out.printf("| %2d | %5s |", i+1, vector[i]);
         System.out.println("\n______________");
      }
      
      h1 = new HiloSuma(vector);
      h2 = new HiloSuma2(vector);
      h3 = new HiloMedia(vector);
   }
   
}