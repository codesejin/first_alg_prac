import java.util.Arrays;

// boolean[] 초기화법
// boolean[] if문 시, true/false 할당못하는지?
public class Solution2 {
    public static void main(String[] args) {
        int[] absol = {1, 2, 3, -5, -7, -9};
        boolean[] signs = new boolean[6];
        Arrays.fill(signs,true);

        for ( int i : absol){
            if ( i > 0) {
                signs[i] = true;
            } else {
                signs[i] = true;
            }
        }

        System.out.println(signs);
    }
}
