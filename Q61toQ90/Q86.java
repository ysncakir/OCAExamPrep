package Q61toQ90;

public class Q86 {

    static class Vehicle {
        int x;
        Vehicle () {
            this (10);
        }

        Vehicle (int x) {
            this.x = x ;
        }

        static class Car extends Vehicle {

            int y; //20

            Car () {
                super (10);
            }

            Car ( int y) {
                super (y);
                this.y = y;
            }

            public String toString () {
                return super.x + ":" + this.y;
            }
        }

        public static void main(String[] args) {

            Vehicle y = new Car (20);
            System.out.println(y);

        }
    }
}

// constructor call yaparak 20 : 20 sonucuna ulasilir
