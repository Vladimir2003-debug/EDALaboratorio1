public class Methods_Overloading {
    public static void main(String[] args) {
        int a = 34,b = 5;
        System.out.println(divisionSinDecimales(a,b));
        double c = 6.7 , d = 6.8;
        System.out.println(divisionConDecimales(c,d));

    }
    public static void divisionSinDecimales( int a, int b) {
        return a/b;
    }
    public static void divisionSinDecimales( double a, double b) {
        return (int)(a/b);
    }
}