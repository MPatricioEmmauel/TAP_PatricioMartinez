public class HiloSuma extends Thread{
   private static double[] vector;
   
   public HiloSuma(double[] v){
      vector = v;
      setPriority(MAX_PRIORITY);
      start();
   }
   
   public void run() {
      double x = 0;
      for(int i = 0; i < vector.length; i++)
         x += vector[i];
      System.out.println("\nSuma de los elementos del vector: " + Double.toString(x));
   }
}