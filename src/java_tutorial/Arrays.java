public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //cambiar un elemnto del array
        cars[0] = "Opel";
        System.out.println(cars[0]);
        //largo de un arrays
        System.out.println(cars.length);

        //Arrays multidimensionales
        int[][] myArray = {{1, 2, 3},{6, 7, 3, 4}};
        int  x = myArray[1][2];
        System.out.println(x);//imprmime 3

    }
}