package main.java.list.basic_operation;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList;

    public TaskList () {
        this.taskList = new ArrayList<> ();
    }

    public void addTask(String description) {
        taskList.add (new Task (description));
    }

    public void removeTask(String description) {
        List<Task> taskToRemove = new ArrayList<> ();
        for (Task i : taskList) {
            if (i.getDescription ().equalsIgnoreCase (description)) {
                taskToRemove.add(i);
            }
        }

        taskList.removeAll (taskToRemove);
    }

    public int getTotalTasks() {
        return taskList.size ();
    }

    public void getTasksDescriptions() {
        System.out.println (taskList);
    }

    public static void main (String[] args) {
        TaskList taskList = new TaskList ();

//        taskList.addTask ("Tarefa 01");
//        taskList.addTask ("Tarefa 01");
//        taskList.addTask ("Tarefa 02");
        System.out.println ("O número total de elementos na lista é: " + taskList.getTotalTasks ());

        taskList.removeTask ("Tarefa 01");
        System.out.println ("O número total de elementos na lista é: " + taskList.getTotalTasks ());

        taskList.getTasksDescriptions ();
    }
}