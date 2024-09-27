import java.util.Scanner;
public class PemilihanHariDenganIf23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dayNumber;
        String whichone;

        System.out.println("Input Number :");
        dayNumber = input.nextInt();

        if (dayNumber ==1 ) {
            whichone = "weekday";
        }
        else if (dayNumber ==2){
            whichone = "weekday";
        }
        else if (dayNumber ==3){
            whichone = "weekday";
        }
        else if (dayNumber ==4){
            whichone= "weekday";
        }
        else if (dayNumber ==5){
            whichone = "weekday";
        }
        else if (dayNumber ==6){
            whichone = "weekend";
        }
        else if (dayNumber ==7){
            whichone = "weekend";
        }
        else { 
            whichone = "ERRORR";
        }

        System.out.println(dayNumber + " is a " + whichone);

        }

}
