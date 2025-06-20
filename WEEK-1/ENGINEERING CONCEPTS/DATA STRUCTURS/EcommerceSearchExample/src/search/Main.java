package search;
import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Product[] products = {
                    new Product(1, "Laptop", "Electronics"),
                    new Product(2, "Shirt", "Clothing"),
                    new Product(3, "Comic Book", "Entertainment"),
                    new Product(4, "Keyboard", "Electronics"),
                    new Product(5, "Book", "Education"),
                    new Product(6, "Mouse", "Electronics"),
                    new Product(7, "lipstick", "cosmetics"),
            };

            // Linear Search
            System.out.println("Please choose the product from the Product List: ");
            String a=sc.nextLine();
            Product found = SearchAlgorithms.linearSearch(products, a);
            System.out.println("****  Linear Search ****");
            //Product found = SearchAlgorithms.linearSearch(products, "Keyboard");
            //String a=sc.nextLine();
            //Product found = SearchAlgorithms.linearSearch(products, a);
            System.out.println(found != null ? "Product Found: " + found : "Product not found");

            // first we should sort the element to perform  for Binary Search
            SearchAlgorithms.sortByName(products);

            // Binary Search
            System.out.println("\n\n**** Binary Search ****");
            found = SearchAlgorithms.binarySearch(products, a);
            System.out.println(found != null ? "Product Found: " + found : "Product is not present sorry!");
        }
    }


