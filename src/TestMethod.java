public class TestMethod {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(12,"May",2023);
        MyDate m2 = new MyDate(12,"May",2023);
        MyDate m3 = new MyDate(12,"April",2022);
        System.out.println("MyDate m1 equals m2 -"+m1.equals(m2));
        System.out.println("MyDate m2 equals m3 -"+m2.equals(m3));
        System.out.println("MyDate m3 equals m1 -"+m3.equals(m1));
        System.out.println("HashCode m1 -"+m1.hashCode());
        System.out.println("HashCode m2 -"+m2.hashCode());
        System.out.println("HashCode m3 -"+m3.hashCode());
        /*Output:
MyDate m1 equals m2 -false
MyDate m2 equals m3 -false
MyDate m3 equals m1 -false
HashCode m1 - 1791741888
HashCode m2 - 1595428806
HashCode m3 - 1072408673
         */
        /*Output after:
MyDate m1 equals m2 -true
MyDate m2 equals m3 -false
MyDate m3 equals m1 -false
HashCode m1 - 2434221
HashCode m2 - 2434221
HashCode m3 - 1967872939

         */


    }
}
