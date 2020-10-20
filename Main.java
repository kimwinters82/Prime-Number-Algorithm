import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter 1st int: ");
    System.out.println("Please enter 2nd int: ");
    int start = sc.nextInt();
    int end = sc.nextInt();
    boolean[] sieve = new boolean[end];
    for (int i = 0; i<sieve.length; i++){
       if (i != 0 && i != 1){
        sieve[i] = true;
      } 
    }
    //nested for loop 
    //move to next true - outer
    //change all multiples of this num to false
    for(int i = 0; i < Math.sqrt(sieve.length); i++){
      for(int j = 2; j < sieve.length; j++){
        if (sieve[i] == true){
          if ((i*j)<sieve.length){
            sieve[i*j] = false;
          }
        }
      }
    }
    int count = 0;
    for (int i = start; i < sieve.length; i++){
      if (sieve[i] == true){
        count++;
      }
    }
    System.out.println(count);
  }
}