import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesPlus30 = minutes + 30;

        if(hour >= 0 && hour <=23) {
            if(minutesPlus30 > 59) {
                hour+=1;
                minutesPlus30 = minutesPlus30 - 60;

            }
        }
        if(hour > 23) {
            hour = 0;
        }
        if(minutesPlus30 < 10) {
            System.out.printf("%d:0%d",hour,minutesPlus30);
        }else {
            System.out.printf("%d:%d", hour, minutesPlus30);
        }

    };
};


->11
  32
  
---> 12:02
