import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number beetween(1 to 12) to check month :");
        int num=sc.nextInt();
        String month="";
        switch (num) {
            case 1:
                month="january";
                System.out.println(month);
                break;
            case 2:
                month="february";
                System.out.println(month);
                break;
            case 3:
                month="March";
                System.out.println(month);
                break;
            case 4:
                month="april";
                System.out.println(month);
                break;
            case 5:
                month="may";
                System.out.println(month);
                break;
            case 6:
                month="june";
                System.out.println(month);
                break;
            case 7:
                month="july";
                System.out.println(month);
                break;
            case 8:
                month="August";
                System.out.println(month);
                break;
            case 9:
                month="September";
                System.out.println(month);
                break;
            case 10:
                month="October";
                System.out.println(month);
                break;
            case 11:
                month="November";
                System.out.println(month);
                break;
            case 12:
                month="December";
                System.out.println(month);
                break;
        
            default:
            System.out.println("Invalid input");
                break;
        }
    }
}
