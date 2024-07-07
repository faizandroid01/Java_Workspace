package greedyAlgo;

public class GreedyFibonacci {

    static int fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }
// 0 1 1

    static int greedyFibonacci(int n){

        int[] arr = new int[100];

        if(n==0){arr[0]=0; return 0;}
        if(n==1){arr[1]=1; return 1;}

        if(arr[n]!=0){
            return arr[n];
        }

        arr[n] = greedyFibonacci(n-1) + greedyFibonacci(n-2);

        return arr[n];
    }
    public static void main(String[] args) {
      //  System.out.println("Normal Fibonacci : "+fibonacci(5));
        System.out.println("Greedy Fibonacci : "+greedyFibonacci(5));
    }
}
