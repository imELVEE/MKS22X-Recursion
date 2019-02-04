import java.util.ArrayList;
import java.util.List;

public class Recursion{
  /*
  public static void main(String[] args){
    System.out.println("TESTING makeAllSums\n------------------------\n");
    System.out.println("//Should print [0, 1, 2, 3]");
    System.out.println(makeAllSums(2) + "\n");
    System.out.println("//Should print [0, 3, 2, 5, 1, 4, 3, 6]");
    System.out.println(makeAllSums(3) + "\n");

    System.out.println("\nTESTING sqrt\n------------------------\n");
    System.out.println("//Should print something close to 1.4142");
    System.out.println(sqrt(2,0.00001) + "\n");
    System.out.println("//Should print something close to 3");
    System.out.println(sqrt(9,0.00001) + "\n");
    System.out.println("//Should print something close to 2");
    System.out.println(sqrt(4,0.00001) + "\n");
    System.out.println("//Should print something close to 67");
    System.out.println(sqrt(67*67,0.00001) + "\n");

    System.out.println("\nTESTING fib\n------------------------\n");
    System.out.println("//Should print 0");
    System.out.println(fib(1) + "\n");
    System.out.println("//Should print 1");
    System.out.println(fib(2) + "\n");
    System.out.println("//Should print 13");
    System.out.println(fib(7) + "\n");
    System.out.println("//Should print 3");
    System.out.println(fib(4) + "\n");
    System.out.println("//Should print 1836311903");
    System.out.println(fib(46) + "\n");
  }
  */


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
    return root(n,tolerance,1);
  }
  public static double root(double n, double tolerance, double guess){
    if (Math.abs(guess*guess - n) <= n*tolerance){
      return guess;
    }
    return root(n,tolerance,(n/guess + guess)/2.0);
  }

  public static int fib(int n){
    return remember(0,1,1,n);
  }
  public static int remember(int previous, int now, int index, int n){
    if (index < n){
      return remember(now,now+previous,index+1,n);
    }
    return now;
  }
}
