import java.util.Scanner;
class program3{
    
}

class program2{
    public static void run(){
        Scanner input = new Scanner(System.in);
        String[] prodNames = {"Notebook", "Pen", "Folder", "USB"};
        int[] stock = new int[4]; 
        int[] reorder = {5,10, 5, 2};
        int[] target = {20,30, 20, 10};
        
        for (int i = 0; i < prodNames.length; i++) {
            while (true){
                System.out.print(prodNames[i] + " (0-10000): ");
                int tempStock = input.nextInt();
                if (tempStock >= 0 && tempStock <= 10000) {
                    stock[i] = tempStock;
                    break;
                } else {
                    System.out.println("Error: Stock must be between 0 and 10000. Try again.");
                }
            }
        }
        
        System.out.println("");
        int[] order = new int[4]; 
        for(int i = 0; i < prodNames.length; i++){
            System.out.print(prodNames[i] + " stock: " + stock[i]);
            order[i] = target[i]-stock[i];
            if(stock[i]<=reorder[i]){
                System.out.println(" | " + "Order: " + order[i]);
            }
            else{
                System.out.println("");
            }
        }
        
        int totalStock = 0;
        int totalSuggestedOrd = 0;
        for(int i = 0; i < prodNames.length; i++){
            totalStock += stock[i];
            totalSuggestedOrd += order[i];
        }
        System.out.println("Total stock: " + totalStock);
        System.out.println("Total suggested order: " + totalSuggestedOrd);
    }
}

class program1{
    public static void run(){
        Scanner input = new Scanner(System.in);
        int[] studentScores = new int[1];
        int total;
        while(true){
            System.out.print("Enter number of students(Maximum of 50): ");
            total = input.nextInt();
            if(total > 50){
                System.out.println("Too many students.");
            } else if(total < 1){
                System.out.println("Not enough students! Please enter at least 1.");
            } else {
                studentScores = new int[total];
                break;
            }            
        }
        
        System.out.println("\nEnter their scores:");
        for(int i = 0; i < studentScores.length; i++){
            int studentNo = i + 1;
            
            // Task 1 & Test Case: Input validation loop to reject scores < 0 or > 100
            while(true) {
                System.out.print("Score of student:[" + studentNo + "]: ");
                int score = input.nextInt();
                
                if(score >= 0 && score <= 100) {
                    studentScores[i] = score;
                    break; // valid score, exit validation loop
                } else {
                    System.out.println("Invalid score! Please enter a value from 0 to 100.");
                }
            }
        }
        
        //calculation variables
        int highest = studentScores[0];
        int lowest = studentScores[0];
        int sum = 0;
        int passingScores = 0;
        int failingScores = 0;
        
        //Use loop to compute statistics, passing, and failing scores
        for(int i = 0; i < studentScores.length; i++) {
            int currentScore = studentScores[i];
            sum += currentScore;
            
            if(currentScore > highest) {
                highest = currentScore;
            }
            if(currentScore < lowest) {
                lowest = currentScore;
            }
            
            if(currentScore >= 75) {
                passingScores++;
            } else {
                failingScores++;
            }
        } 
        double average = (double) sum / studentScores.length;
        
        // Display statistics summary
        System.out.println("\n>>Exam Statistics<<");
        System.out.println("Students: " + total);
        System.out.printf("Average Score: %.2f\n", average);
        System.out.print("Highest Score: " + highest+" | ");
        System.out.println("Lowest Score: " + lowest);
        System.out.print("Passed: " + passingScores+" | ");
        System.out.println("Failed: " + failingScores);
        
        //Display all student numbers tied for the highest score
        System.out.print("Top student numbers: ");
        for(int i = 0; i < studentScores.length; i++) {
            if(studentScores[i] == highest) {
                System.out.print("[" + (i + 1) + "] ");
            }
        }
        System.out.println();

        input.close();       
    }
}

public class Week14_F_Activity_1_Java_Array {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a number from 1 to 10: ");
            number = input.nextInt();

            if (number >= 1 && number <= 10) {
                break;
            } else {
                System.out.println("Invalid input! The number must be between 1 and 10.");
            }
        }
        switch(number) {
            case 1:
                program1.run();
                break;
            case 2:
                program2.run();
                break;
            default: // Runs if no cases match
                break;
        }
        input.close();
    }
}