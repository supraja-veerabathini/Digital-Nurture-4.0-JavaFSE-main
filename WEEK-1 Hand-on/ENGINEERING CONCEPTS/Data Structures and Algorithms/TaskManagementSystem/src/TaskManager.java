public class TaskManager {
    // Inner Node class
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head = null;

    // Add task at the end
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added.");
    }

    // Search task by ID
    public Task searchTask(String taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getTaskId().equals(taskId)) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    // Delete task by ID
    public void deleteTask(String taskId) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }

        // If head is the task to delete
        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        // Search and delete
        Node prev = head;
        Node current = head.next;

        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                prev.next = current.next;
                System.out.println("Task deleted.");
                return;
            }
            prev = current;
            current = current.next;
        }

        System.out.println("Task not found.");
    }

    // Traverse all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }
}
