class Solution {
    public static LinkedList<Integer> insertion(int arr[]) {
        // Your code here
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int val : arr){
            list.add(val);
        }
        return list;
    }
}