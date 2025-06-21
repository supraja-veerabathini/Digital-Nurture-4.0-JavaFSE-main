public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O101", "Supraja", 3500.75),
                new Order("O102", "Anil", 2200.50),
                new Order("O103", "Nisha", 4500.90),
                new Order("O104", "Ravi", 1500.00)
        };

        System.out.println("Original Orders:");
        SortingAlgorithms.printOrders(orders);

        // Bubble Sort
        System.out.println("\nSorted by Bubble Sort:");
        SortingAlgorithms.bubbleSort(orders);
        SortingAlgorithms.printOrders(orders);

        // Resetting array
        orders = new Order[]{
                new Order("O101", "Supraja", 3500.75),
                new Order("O102", "Anil", 2200.50),
                new Order("O103", "Nisha", 4500.90),
                new Order("O104", "Ravi", 1500.00)
        };

        // Quick Sort
        System.out.println("\nSorted by Quick Sort:");
        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);
        SortingAlgorithms.printOrders(orders);
    }
}
