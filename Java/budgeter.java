import java.util.*;

public class Budgeter {
    public static final int DAYS_IN_MONTH = 31;
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);
        welcomeMessege();
        double totalMoney = incomeAmount(console);
        double dividedIncome = monthlyDaily(console);
        totalIncome(totalMoney , dividedIncome);
    }

//this method is for the first two lines of the program that introduces what it is about.
public static void welcomeMessege(){
    System.out.println("This program asks for your monthly income and");
    System.out.println("expenses, then tells you your net monthly income.");
    System.out.println();
}

//This method takes the users input of income amount and adds it together and returns the amount labeled "income"
public static double incomeAmount(Scanner console){
    System.out.print("How many categories of income? ");
    int categories = console.nextInt();
    double income = 0;
    for(int i = 1; i <=categories; i ++){
        System.out.print("    Next income amount? $");
        double amountCount = console.nextDouble();
        income = amountCount + income;
    }
    System.out.println();
    return income;
    }

//this method takes the input of daily expenses or monthly expeneses base on user input and caluclates the amount of money
public static double monthlyDaily(Scanner console){
    System.out.print("Enter 1) monthly or 2) daily expenses? ");
    double answer = console.nextDouble();
    double value = 0;
    if(answer == 1){
        System.out.print("How many categories of expense? ");
        int category = console.nextInt();
        double expense = 0;
        for(int i = 1; i <= category; i++){
            System.out.print("    Next expense amount? $");
            expense += console.nextDouble();
            value = expense + expense;
        }
    }
    else if(answer == 2){
        System.out.print("How many categories of expense? ");
            int category = console.nextInt();
            double expense = 0;
        for(int i = 1; i <= category; i++){
            System.out.print("    Next expense amount? $");
            expense += console.nextDouble();
            value = expense * DAYS_IN_MONTH;
        }
    }
    System.out.println();
    return value;
}

//this method is used to round to 2 decimal points.
public static double mathRound(double x){
    return Math.round(x * 100.0)/ 100.0;
}

//this method prints out the total income and expenses from the calculated values from the users input and it also tells you how much money you saved or spent.
public static void totalIncome(double totalMoney, double dividedIncome){
    System.out.println("Total income = $" + mathRound(totalMoney) + " " + "($" + mathRound(totalMoney / DAYS_IN_MONTH) + "/day)");
    System.out.println("Total expenses = $" + mathRound(dividedIncome) + " " + "($" + mathRound(dividedIncome / DAYS_IN_MONTH) + "/day)");
    System.out.println();
    double diff = mathRound(totalMoney - dividedIncome);
    if(totalMoney > 0){
        if(diff < 250){
            System.out.println("You spent $" + Math.abs(diff) + " more than you earned this month.");
            System.out.println("You're a big spender.");
            System.out.println("Congrats you have saved money good job!");
        } else if(diff > 250){
            System.out.println("You earned $" + Math.abs(diff) + " more than you spent this month.");
            System.out.println("You're a saver.");
            System.out.println("You can do better to save more money next month!");
        }
    }
} 
}
