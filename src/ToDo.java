import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by earlbozarth on 10/12/15.
 */
public class ToDo {
    public static void main(String [] args){
        ArrayList <ToDoItem> toDos = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        //this are some changes

        //static void printToDos(ArrayList<ToDoItem>){}
        while(true){
            int toDoNum = 1;
            for(ToDoItem todo : toDos){
                String checkBox = "[ ]";
                if (todo.isDone){
                    checkBox = "[X]";
                }
                System.out.println(toDoNum + ". " + checkBox + " " + todo.text);
                toDoNum++;
            }//End of for loop

            System.out.println("Options:");
            System.out.println("[1] Create To Do");
            System.out.println("[2] Mark To Do as done or not done");

            String option = scanner.nextLine();
            int optionNum = Integer.valueOf(option);

            if (optionNum ==1){
                System.out.println("What would you like to add?");
                String todo = scanner.nextLine();
                ToDoItem item = new ToDoItem(todo);
                toDos.add(item);

            }//End of option 1
            else if (optionNum ==2){
                System.out.println("Type the number of the To Do you want to toggle");
                String select = scanner.nextLine();
                try {
                    int selectNum = Integer.valueOf(select);
                    ToDoItem item = toDos.get(selectNum - 1);
                    item.isDone = !item.isDone;
                }//End of Try
                catch (Exception e){
                    System.out.println("An error occurred");
                }//End of catch
            }//End of option 2
            else {
                System.out.println("Invalid Number");
            }
        }//End of while loop

    }//End of main method

}//End of ToDo class
