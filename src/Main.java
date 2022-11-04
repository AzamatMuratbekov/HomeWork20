import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        Days days = Days.valueOf(day.toUpperCase());
        switch (days){
            case MONDAY:
                System.out.println("Дуйшомбу Техникалык сабак окуйм");
                break;
            case WEDNESDAY:
                System.out.println("Шаршенби Техникалык сабак окуйм");
                break;
            case FRIDAY:
                System.out.println("Жума куну Техникалык сабак окуйм");
                break;
            case TUESDAY:
                System.out.println("Шейшемби Практикалык жана Англис тили сабактарын окуйм");
                break;
            case THURSDAY:
                System.out.println("Бейшемби Практикалык жана Софт скилл  сабактарын окуйм");
                break;
            case SATURDAY:
                System.out.println("Ишенби куну Практикалык сабак окуйм");
                break;
            case SUNDAY:
                System.out.println("Жекшенби эс алуу куну");
                break;
        }
    }
}