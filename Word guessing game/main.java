
import java.util.Random;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int num = rand.nextInt(101);
        int acc = 0;

        String cold = "Cold";
        String very_cold = "Very Cold";
        String freezing = "Freezing";
        String antartica = "Antartica";
        String normal = "Normal Sunday";
        String mild = "Normal day in Africa";
        String hot = "Cooked";
        String very_hot = "Desert's Sun";
        String fire = "The Sun";

        boolean win = false;
        
        System.out.println("Do you want to play?(true/false)");
        boolean condition = scanner.nextBoolean();
        if(condition){
            System.out.println("Enter a number between 0-100: ");
        }
        
        
        while(!win){




            int Expected = scanner.nextInt();

            if (Math.abs(num - Expected) == 0){

                System.out.println("You Won!!. The number was : "+Expected+". It only took you "+acc+" tries!!");
                System.out.println(num);
                win = true;

            }

            if (Math.abs(num - Expected) <= 3){
                System.out.println(fire);
                acc ++;
            }

            else if(Math.abs(num - Expected) <= 5){
                System.out.println(very_hot);
                acc ++;
            }

            else if(Math.abs(num - Expected) <= 7){
                System.out.println(hot);
                acc ++;
            }
            else if(Math.abs(num - Expected) <= 9){
                System.out.println(mild);
                acc ++;
            }
            else if(Math.abs(num - Expected) <= 11){
                System.out.println(normal);
                acc ++;
            }
            else if(Math.abs(num - Expected) <= 15){
                System.out.println(cold);
                acc ++;
            }
            else if(Math.abs(num - Expected) <= 20){
                System.out.println(very_cold);
                acc ++;
            }
            else if(Math.abs(num - Expected) <= 25){
                System.out.println(freezing);
                acc ++;
            }
            else if(Math.abs(num - Expected) <= 30){
                System.out.println(antartica);
                acc ++;
            }
            else{
                System.out.println("Way off!!!");
                acc ++;
            }
            


        }
    
            
                           

    }
}
