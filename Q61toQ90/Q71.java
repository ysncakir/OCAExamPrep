package Q61toQ90;

public class Q71 {

    public static void main(String[] args) {

        int [][] arr = new int [2] [4];

        System.out.println(arr[1].length);
        arr[0] = new int [] {1,3,5,7};
        arr[1] = new int [] {1,3};
        System.out.println(arr[1].length);


        for (int [] a: arr ) { // iki arrayi ayri ayri alacak {1,3,5,7}  {1,3}
            for (int i = 0; i < arr.length; i++) {  // multi array length 2 oldugu icin sadece 0 ve 1 elementi loop edecek
                System.out.print(a[i]+ " ");  // ilk array icin 1,3; ikinci array icin de 1,3 basilir
            }
            System.out.println();
        }
    }
}
