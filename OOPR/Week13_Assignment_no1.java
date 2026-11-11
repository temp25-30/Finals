import java.util.Scanner;
public class Week13_Assignment_no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10]; 
        System.out.println("Enter ten numbers:");
        for(int i = 0; i < 10; i++){
            numbers[i] = input.nextInt();
        }
        
        System.out.println("Even numbers:");
        for(int i = 0; i < 10; i++){
            if(numbers[i]%2 == 0){
                System.out.print(numbers[i]+" ");
            }
        } 
        input.close();
    }
}