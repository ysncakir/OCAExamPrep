package Q61toQ90;

import java.util.ArrayList;

public class Q76 {

    interface Cycle {

   }

   static class MotorCycle implements Cycle{

   }


    public static void main(String[] args) {

        ArrayList<Cycle> myList = new ArrayList<Cycle>();
        myList.add(new MotorCycle());
    }
}

// main icindeki obje eklemeyi compile yapmak icin :
// 1. Cycle class i motorcycle icin super class yapabiliz. Cycle abstract de olabilir
// 2. Cycle interface olup, Motorcyle onu extend edebilir
