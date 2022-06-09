public class HiloMedia extends Thread{
   private static double[] vector;
   
   public HiloMedia(double[] v){
      vector = v;
      setPriority(MIN_PRIORITY);
      start();
   }
   
   public void run() {
      double x = 0;
      for(int i = 0; i < vector.length; i++)
         x += vector[i];
      x /= vector.length;
      System.out.println("Media de los elementos del vector: " + Double.toString(x));
   }
}