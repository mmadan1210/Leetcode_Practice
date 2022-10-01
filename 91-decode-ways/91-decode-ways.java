class Solution {
    public int numDecodings(String s) {
        int[] dpArray = new int[s.length()];
        
        // handle the result for a single character (base case).  If a single 
        // character is 0, then it cannot be decoded.  Everything else should be 1
        if (s.charAt(0) == '0') {
            dpArray[0] = 0;
        } else {
            dpArray[0] = 1;   
        }
        
        for(int i = 1; i < s.length(); i++) {
            
            // combine the previous digit and current digit to make a number two digits long
            int value = Integer.valueOf(s.substring(i - 1, i + 1));
            
            // if my combined two digits is 0, then that means I have consecutive 0s
            // which is an invalid number and should immediately return false
            if (value == 0) return 0; 
            
            // if my current character is a 0, I have to handle special cases
            if (s.charAt(i) == '0') {
                // if I'm on a 0, and the last two digits together make a number greater than 26
                // that is an invalid character so immediately return false
                if (value > 26) {
                    return 0;
                }
                // I'm on a 0, which cannot be used by itself.  Since I know that
                // I have a valid two digit number (would have returned false up
                // above if not the case), I need to return the result
                // prior to the two digit value which is two back
                dpArray[i] = dpArray[i - 2 < 0 ? 0 : i - 2];
            } else if (value <= 26 && value > 9) {
                dpArray[i] = dpArray[i - 1] + dpArray[i - 2 < 0 ? 0 : i - 2];
            } else {
                dpArray[i] = dpArray[i - 1];
            }
        }
        return dpArray[dpArray.length - 1];
    }
}