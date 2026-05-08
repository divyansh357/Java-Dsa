public class Bit_Manipulation {
    //Even and Odd
    public static void evenOrOdd(int n){
        int bitMask =1;
        if((n&bitMask)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    //Get Ith Bit
    public static int getIthbit(int n, int i){
        int bitMask = (1<<i);
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    // Set Ith Bit
    public static int setIthBit(int n,int i){
        int bitMask = (1<<i);
        return (n|bitMask);
    }

    // Clear Ith Bit
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    // Update Ith Bit
    //public static int updateIthBit(int n,int i,int newBit){
        // if(newBit ==0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }

        // Approach-2
        // n = clearIthBit(n, i);
        // int bitMask = newBit<<i;
        // return n | bitMask;

    //}

    // Clear Last I Bits
    public static int clearIbits(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    // Clear Range Of Bits
    public static int clearBitsInRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    // Is Power Of Two Checker
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1))==0;
    }

    // Count Set Bits 
    public static int CountSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    // Fast Exponetiation
    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n>0){ // Using LSB
            if((n&1)!=0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    //Swapping without third variable
    public static void Swap2Numbers(int a,int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a: "+a + " b: "+b);
    }

    // Adding One to a number
    public static int addingOne(int n){
        return -(~n);
    }
    public static void main(String[] args) {
        // Binary AND
        //System.out.println(5 & 6);

        //Binary OR
        //System.out.println(5 | 6);

        //Binary XOR
        //System.out.println(5 ^ 6);

        // Binary One's Compliment
        // System.out.println((~5));
        // System.out.println((~0));
        
        // Binary Left Shift
        //System.out.println(5<<2);

        //Binary Shift Right
        //System.out.println(6>>1);

        //q1= odd and even

        // evenOrOdd(3);
        // evenOrOdd(11);
        // evenOrOdd(54);

        //Get Ith Bit
        //System.out.println(getIthbit(10,3));

        // Set Ith Bit
        //System.out.println(setIthBit(10,2 ));
        
        // Clear Ith Bit
        //System.out.println(clearIthBit(10,1));

        // Update Ith Bit
        //System.out.println(updateIthBit(10, 1, 0));
       
        // Clear Last Ith Bits 
        //System.out.println(clearBitsInRange(10, 2,4));

        // Is Power of two Checking 
          
        //System.out.println(isPowerOfTwo(7));

        // Count Set Bits 
        //System.out.println(CountSetBits(15));

        // Fast Exponential Code 
        //System.out.println(fastExpo(3, 3));

        // Questions 
        //q2 
        //Swap2Numbers(5,6);

        //q3
        //System.out.println(addingOne(5));

        //q4
        for(char ch ='A';ch<='Z';ch++){
            System.out.print((char)(ch | ' '));
        }
    }
}
