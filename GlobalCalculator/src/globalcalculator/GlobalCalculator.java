package globalcalculator;

/**
 *
 * @author Oscar
 */
import java.util.Scanner;
public class GlobalCalculator {

    public static void main(String[] args) {
    // The Scanner Object
    Scanner KeyBoard = new Scanner(System.in);
    
    System.out.println("Welcome to Global Calculator");
    
    // Main loop for the calculator
    
    while(true){
    
        //Display Manu
        
       System.out.println("\n Select an Operation");
       System.out.println("1. Addition (+) ");
       System.out.println("2. Subtraction (-) ");
       System.out.println("3. Multiplication (*) ");
       System.out.println("4. Division (/) ");
       System.out.println("5. Exit ");
       
       System.out.println("Enter your choice: ");
       int choice = KeyBoard.nextInt();
       
       // check if the user wants to exit
       if(choice == 5){
       
       System.out.println("Exiting the Global: GoodBye ");
       break;
       }
       
       // Ask for two numbers
       
       System.out.println("Enter The first Number: ");
       double num1 = KeyBoard.nextDouble();
       
       System.out.println("Enter The Second Number: ");
       double num2 = KeyBoard.nextDouble();
       
       // Perfom the selected Opration 
       switch(choice){
           case 1: // Addition
           System.out.println("Results: " + (num1 + num2));
           break;
           
           case 2: // Subtraction
           System.out.println("Results: " + (num1 - num2));
           break;
           
           case 3: // Multiplication
           System.out.println("Results: " + (num1 * num2));
           break;
           
           case 4: // Division 
               
               if(num2 != 0){
               System.out.println("Results: " + (num1 / num2));
           
           }else{
               
               System.out.println("Error: Division by zero is not allowed. ");
               }
           break;
           default: // invalid input
           System.out.println("Invalid choice: Please select a valid operation. ");
               
}
}
// close the scanner

}
}
