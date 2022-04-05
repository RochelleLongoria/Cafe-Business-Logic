import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil{

    // Implement the getStreakGoal method and test.
    public int getStreakGoal(){
        int sum = 0;
        int numWeeks = 10;
        for(int i = 0; i <= numWeeks; i++){
            sum = sum + i;
        }
        return sum;
    }
    // Implement the getOrderTotal method and test.
    public double getOrderTotal(double [] lineItems ){
        double sum = 0;
        for(int i = 0; i < lineItems.length; i++){
            sum = sum + lineItems[i];
        }
        return sum;
    }
    
    // Implement the displayMenu method and test.
    public void displayMenu(ArrayList<String> menu){
        for(int i = 0; i < menu.size(); i++ ) {
            System.out.println((i) + " " +  menu.get(i));
        }
    }
    // Implement the addCustomer method and test.
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!" + "There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }

}