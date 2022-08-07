class Solution {
    static int mod = 1000000007;
        public int countVowelPermutation(int n) {
        
        Map<Character, List<Character>> map = new HashMap<>();
        
        map.put('a', new ArrayList<>());
        map.put('e', new ArrayList<>());
        map.put('i', new ArrayList<>());
        map.put('o', new ArrayList<>());
        map.put('u', new ArrayList<>());
        
        map.get('a').add('e');
        
        map.get('e').add('a');
        map.get('e').add('i');
        
        map.get('i').add('a');
        map.get('i').add('e');
        map.get('i').add('o');
        map.get('i').add('u');
        
        map.get('o').add('i');
        map.get('o').add('u');
        
        map.get('u').add('a');
        
        int count = 0;
        
        Integer[][] dp = new Integer[26][n + 1];
        
        for(Character i : map.keySet()) {
            count = (count % mod + dfs(i, map, 1, n, dp) % mod) % mod;
        }
        
        return count;
    }
    
    int dfs(Character ch, Map<Character, List<Character>> map, int currentLength, int n, Integer[][] dp) {
        if(currentLength == n) {
            return 1;
        }
        
        if(dp[ch - 'a'][currentLength] != null) {
            return dp[ch - 'a'][currentLength];
        }
        
        int count = 0;
        
        for(Character c : map.get(ch)) {
            count = (count % mod + dfs(c, map, currentLength + 1, n, dp) % mod) % mod;
        }
        
        return dp[ch - 'a'][currentLength] = count;
    }
}