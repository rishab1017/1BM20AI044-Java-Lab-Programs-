import java.util.Random;
import cube.find_cube;
import square.find_square;

abstract public class rand_cs{
   public int number;
   abstract public void random();
}

class find_rcs extends rand_cs{
   int[] r= new int[5];
   public void random(){
      Random rand= new Random();
      
      for (int i=0; i<5; i++){
         int rgen=0;
         rgen= rand.nextInt(100);
         r[i]= rgen;
         
      }
      for (int j = 0; j < r.length; j++)
         System.out.println("Element at index " + j + " : "+ r[j]);
   } 
   

}

class testrcs{

   public static void main(String args[]){
      
      find_rcs fr = new find_rcs();
      fr.random();  
   }
}