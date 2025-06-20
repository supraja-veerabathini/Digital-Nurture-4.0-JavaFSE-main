package search;

import java.util.*;

    public class SearchAlgorithms {

        // Linear Search
        public static Product linearSearch(Product[] products, String name) {
            for (Product product : products) {
                if (product.getProductName().equalsIgnoreCase(name)) {
                    return product;
                }
            }
            return null;
        }

        // Binary Search - assumes sorted by productName
        public static Product binarySearch(Product[] products, String name) {
            int left = 0;
            int right = products.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                int result = products[mid].getProductName().compareToIgnoreCase(name);

                if (result == 0) {
                    return products[mid];
                } else if (result < 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return null;
        }

        // Sort helper
        public static void sortByName(Product[] products) {
            Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
        }
    }


