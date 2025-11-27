//Platform : InterviewBit

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        
        long n = A.size();
        
        long sumExp = n * (n + 1) / 2;
        long sumSqExp = n * (n + 1) * (2 * n + 1) / 6;
        
        long sum = 0;
        long sumSq = 0;
        
        for (int num : A) {
            sum += num;
            sumSq += (long) num * num;
        }
        
        // diff1 = expectedSum - actualSum = (1+2+...+n) - sum(A)
        // With duplicate = A, missing = B:
        // actualSum = expectedSum + A - B
        // diff1 = expectedSum - actualSum = B - A
        
        long diff1 = sumExp - sum;        // = B - A
        
        // diff2 = expectedSqSum - actualSqSum = B^2 - A^2 = (B - A)(A + B)
        long diff2 = sumSqExp - sumSq;    // = (B - A)(A + B)
        
        long sumAB = diff2 / diff1;       // = A + B
        
        long B = (diff1 + sumAB) / 2;     // = missing number
        long duplicate = B - diff1;       // = A
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add((int) duplicate);  // A (repeated)
        result.add((int) B);          // B (missing)
        
        return result;
    }
}
