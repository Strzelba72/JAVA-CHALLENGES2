import java.util.Scanner;

public class InputCalculator{
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        int count=0;
        while (true) {

            if(scanner.hasNextInt())
            {
                int val = scanner.nextInt();
                sum+=val;
                count++;
            }
            else {
                break;
            }



        }
        scanner.close();
        double var=(double)(sum)/(count);
        double avr=Math.round(var);
        int avr_=(int)avr;

        System.out.println("SUM = "+sum+" AVG = "+avr_);

    }
}
