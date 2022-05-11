public class For_Loop  {
    public static void main(String[] args) {
        //numeros del 1 al 10
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //for each
        String[] myArray = {"Hello", "World"};
        for (String element : myArray) {
            System.out.println(element);
        }
    }
}