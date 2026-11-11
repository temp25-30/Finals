import java.util.Scanner;
public class Week13_Assignment_no2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter five numbers:");
        for(int i = 0; i < 5; i++){
            numbers[i] = input.nextInt();
        }
        
        int highest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
        
        System.out.println("\nthe highest number is: " + highest);

        System.out.println("the difference from the highest are:");
        for (int i = 0; i < numbers.length; i++) {
            int difference = highest - numbers[i];
            System.out.println(highest + " - " + numbers[i] + " = " + difference);
        }
              
        input.close();
    }
}
