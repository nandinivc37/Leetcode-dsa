class Solution {
    public int fib(int n) {
        int[] memo = new int[n+1];
        
        return fibMem(n, memo);
    }
    /* public int fibRec(int n) {
        if(n<= 1) {
            return n;
        }

        return fibRec(n-1) + fibRec(n-2);
    } */

    //memoization/ topdown approach
    public int fibMem(int n, int[] memo) {
        if(n<= 1) {
            return n;
        }

        if(memo[n] != 0) {
           return memo[n];
        }
        memo[n] = fibMem(n-1, memo) + fibMem(n-2, memo);
        return memo[n];
    }
}