public class HiloSuma2 extends Thread{
   private static double[] vector;
   
   public HiloSuma2(double[] v){
      vector = v;
      start();
   }
   
   public void run() {
      double x = 0;
      for(int i = 0; i < vector.length; i++)
         x += Math.pow(vector[i], 2);
      System.out.println("Suma de los elementos al cuadrado del vector: " + Double.toString(x));
   }
}