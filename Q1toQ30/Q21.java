package Q1toQ30;

public class Q21 {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        int i = 0;

        do{
            System.out.print(arr[i] + " "); //1 2 3 4 arr[4] yok
            i ++;
        } while (i<arr.length +1); //1 <5, 2<5 3<5 4<5


    }
}

// do ile once yazdiraracak fakat i<5