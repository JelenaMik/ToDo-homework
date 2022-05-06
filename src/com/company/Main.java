package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mylist mylist = new Mylist();

        String userInput = "";
        do {
            System.out.println("Please choose an activity: ");
            System.out.println("""
                    1. Add ToDo
                    2. View All ToDos
                    3. View single ToDo
                    4. Mark ToDo as done
                    5. Delete ToDo
                    """);
            userInput = scanner.nextLine();

            switch(userInput){
                case "quit":
                    System.out.println("Exiting Aplication!");;
                    break;
                case "1":
                    System.out.println("Add new ToDo");
                    mylist.addTodo();
                    break;
                case "2":
                    System.out.println("View All ToDos");
                    mylist.viewAllToDos();
                    break;
                case "3":
                    System.out.println("View single ToDo");

                    mylist.singleTODo();
                    break;
                case "4":
                    System.out.println("Mark ToDo as done");
                    mylist.markToDoAsDone ();
                    break;

                case "5":
                    System.out.println("Delete ToDo");
                    mylist.deleteToDo();
                    break;
            }

        }while(!userInput.equalsIgnoreCase("quit"));

    }
}





