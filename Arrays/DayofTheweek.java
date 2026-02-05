public class DayofTheweek {
    public static void Days(int day){
           switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid day");
        }
    }
    public static void main(String[] args){
        Days(5);
    }
}
