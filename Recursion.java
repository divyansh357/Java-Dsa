public class Recursion {
    // Problem 1 
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    // Problem 2 
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    // Problem 3: Factorial
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n* fnm1;
        return fn;
    }
    
    // Problem 4 : Sum of n natural numbers
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = sum(n-1);
        int sn = n + snm1;
        return sn;
    }
    // Problem 5 : Print Nth Fibonacci Number
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib_nm1 = fibonacci(n-1);
        int fib_nm2 = fibonacci(n-2);
        int fib_n = fib_nm1 + fib_nm2;
        return fib_n;
    }
    // Problem 6: Checking if an array is sorted
    public static boolean isSorted(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    // Problem 7 : Finding 1st occurence of an element in an array 
    public static int first_occurence(int[] arr, int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first_occurence(arr, i+1, key);
    }
    // Problem 8 : Last occurence of an element in an array
    public static int last_occurence(int[] arr, int i, int key){
        if(i==arr.length){
            return -1;
        }
        int isFound = last_occurence(arr, i+1, key);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    } 
    // Problem 9 : 
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x * power(x, n-1);
    }
    // Problem 10
    public static int optimized_power(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimized_power(x, n/2);
        int halfPowerSqr = halfPower * halfPower;
        
        // if n = odd
        if(n%2!=0){
            halfPowerSqr = x * halfPowerSqr;
        }
        return halfPowerSqr;
    }
    // Problem 11: Tilling Problem
    public static int tillingProblem(int n){ // 2X1 floor size
        if(n==0 || n==1){ // base case
            return 1;
        }
        // kaam 
        // Vertical choice 
        int fnm1 = tillingProblem(n-1);
        // Horizontal Choice
        int fnm2 = tillingProblem(n-2);

        // Total ways 
        int tways = fnm1 + fnm2;
        return tways;
    }
    
        public static void main(String args[]){
        //int n = 5;
        // printDec(n);
        // printInc(n);
        //System.out.println(fact(n));
        //System.out.println(sum(n));
        //System.out.println(fibonacci(45));
        //int[] arr = {8,3,6,9,5,10,2,5,3};

        // Problem 6
        //System.out.println(isSorted(arr, 0));

        //Problem 7
        //System.out.println(first_occurence(arr,0,10));

        // Problem 8
        //System.out.println(last_occurence(arr, 0, 5));

        // Problem 9
        //System.out.println(power(2,5));

        // Problem 10
        //System.out.println(optimized_power(2, 5));

        // Problem 11
        System.out.println(tillingProblem(4));




    }
}
