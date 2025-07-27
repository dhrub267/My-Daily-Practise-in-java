class Solution {
    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
// in gfg above code is enough because below code are hidden in gfg
public class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.swap(1, 2);  // or whatever input is tested
    }
}
