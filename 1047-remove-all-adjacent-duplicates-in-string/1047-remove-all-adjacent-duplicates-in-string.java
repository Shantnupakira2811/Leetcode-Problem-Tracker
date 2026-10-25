class Solution {
    public String removeDuplicates(String S) {
        if(S == null || S.length() == 0) {
            return S;
        }
        int j = 0;
        int n = S.length();
        char[] ans = new char[n];
        
        for(int i = 0; i < n; i++) {
            ans[j] = S.charAt(i);
            if(j > 0 && ans[j] == ans[j - 1]) {
                j--;
            } else {
                j++;
            }
        }
        return new String(ans, 0, j);
    }
}