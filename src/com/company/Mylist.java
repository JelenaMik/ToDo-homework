package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Mylist {

    private ArrayList<ToDo> todos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);
    Scanner boolScanner = new Scanner(System.in);

    void addTodo(){
        System.out.println("Please input ToDo description");
        String description = scanner.nextLine();

        System.out.println("Is ToDo done?");
        Boolean done = boolScanner .nextBoolean();

        System.out.println("Please input ToDo Id");
        int Id = intScanner.nextInt();

        ToDo todo = new ToDo(description, done, Id);
        this.todos.add(todo);
    }

    void viewAllToDos(){
        System.out.println("View all ToDos");
        for(ToDo todo: todos){
            System.out.println("ToDo: " + todo.description + " Done: " + todo.done + " Id: " + todo.Id);
        }
    }

    void  singleTODo(){
        System.out.println("Please enter index of ToDo");
        int id =intScanner.nextInt();
        ToDo todo =todos.get(id);
        System.out.println("ToDo: " + todo.description + " Done: " + todo.done + " Id: " + todo.Id);
    }

    void markToDoAsDone (){
        System.out.println("Please enter index of ToDo");
        int id =intScanner.nextInt();
        ToDo todo =todos.get(id);
        todo.done = Boolean.TRUE;
    }

    void deleteToDo(){
        System.out.println("Please enter index of ToDo to remove");
        int index =intScanner.nextInt();
        todos.remove(index);
        System.out.println("ToDo removed sucesfully");
    }



}
