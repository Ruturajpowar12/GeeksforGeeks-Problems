class Solution {
    public int convertFive(int n) {
        // code here
      String str = Integer.toString(n);
      
      String result = str.replace('0','5');
      return Integer.parseInt(result);
        
    }
}