package com.github.ndtaylor.FibonacciFun;

/**
 * A cool way to calculate fibonacci numbers with maximum speed and a minimal 
 * memory footprint.
 * @author Nathan Taylor
 * @version 0.1
 */
public class FibonacciCalculator {
    
    /**
     * Calculates the nth fibonacci number with maximum speed and a minimal 
     * memory footprint. 
     * @param n The number in the sequence you wish to find. This should be 
     * larger than zero.
     * @return The nth fibonacci number or 0 if n < 1.
     */
    public static int fibonacci(int n) {
        int holder1 = 1;
        int holder2 = 1;
        
        if (n <= 0) {
            return 0;
        }
        
        if (n == 1 || n == 2) {
            return 1;
        }
        
        for (int i = 1; i < (n + 1)/2; i++) {
            holder1 = holder1 + holder2;
            holder2 = holder1 + holder2;
        }
        
        if ((n % 2) == 0)
            return holder2;
        
        return holder1;
        
    }

}
