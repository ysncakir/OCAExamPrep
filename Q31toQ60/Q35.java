package Q31toQ60;

public class Q35 {

    public static void main(String[] args) {

        int nums1 [] = {1,2,3};
        int nums2 [] = {1,2,3,4,5};

        nums2 = nums1; //{1,2,3}

        for ( int x : nums2) {
            System.out.print(x + " ");
        }
    }
}
