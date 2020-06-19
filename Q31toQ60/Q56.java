package Q31toQ60;

public class Q56 {

    public static void main(String[] args) {

        String names [] = {"Thomas", "Peter", "Joseph" };
        String pwd [] = new String [3];

        int idx = 0;

        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);
                System.out.println(pwd[idx]);
                idx++;
            }
        } catch (Exception e){
            System.out.println("Invalid name");
            //e.printStackTrace();
        }
    }

    // thomas dan sonra exception yakaldigi icin sadece omas yazilir sonra error mesaji ile loop
    // tan cikilir
}
