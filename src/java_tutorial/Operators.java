
public class Operators {
    public static void main(String[] args) {
        int x = 5, y = 3;

        //Comparadores logicos
        //equal
        System.out.println(x == y);
        //no equal
        System.out.println(x != y);
        //mayor que
        System.out.println(x > y);
        //menor que
        System.out.println(x < y);
        
        //Operadores logicos
        x = 5;
        y = 3;
         //not
        System.out.println(!(x == y)) ;//result true;
        //and
        System.out.println((x == y) && (x == y)); //result false;
        //or
        System.out.println((x == y) || (x != y)); //result true;
       
    }
}