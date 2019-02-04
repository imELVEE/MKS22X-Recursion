import java.util.ArrayList;
import java.util.List;

public class Recursion{
  public static void main(String[] args){
    System.out.println("TESTING makeAllSums\n------------------------\n");
    System.out.println("//Should print [0, 1, 2, 3]");
    System.out.println(makeAllSums(2) + "\n");
    System.out.println("//Should print [0, 3, 2, 5, 1, 4, 3, 6]");
    System.out.println(makeAllSums(3) + "\n");

    
  }


  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> nums = new ArrayList<Integer>();
    addSums(nums,n,1,0);
    return nums;
  }
  public static void addSums(ArrayList<Integer> mod, int n, int index, int sum){
    if (index <= n){
      addSums(mod,n,index+1,sum+index);
      addSums(mod,n,index+1,sum);
    }
    else{
      mod.add(sum);
    }
  }

  public static double sqrt(double n, double tolerance){
    return root(n,tolerance,1.0);
  }
  public static double root(double n, double tolerance, double guess){
    if (Math.abs(guess*guess - n) <= n*tolerance){
      return guess;
    }
    return root(n,tolerance,(n/guess + guess)/n);
  }


}
