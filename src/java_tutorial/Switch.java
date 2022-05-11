public class Switch {
    public static void main(String[] args) {
        //dias de la semana
        int day = 4;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break; 
            case 6:
                System.out.println("Saturday");
                break;
            //en caso de que no haber match
            default:
                System.out.println("Sunday");
                break;
        }
    }
}