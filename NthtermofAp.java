
public class NthtermofAp {

    public static int solution(int a, int d, int n) {
        int Nthterm = a + (n - 1) * d;
        return Nthterm;
    }

    public static void main(String[] args) {
        int result = solution(5, 2, 6);
        System.out.println("The 6th term of the AP is: " + result);
    }
}
