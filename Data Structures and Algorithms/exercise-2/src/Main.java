public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shirt", "Clothing"),
            new Product(310, "Watch", "Accessories"),
            new Product(450, "Shoes", "Footwear"),
            new Product(502, "Book", "Books")
        };

        Product[] sortedProducts = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shirt", "Clothing"),
            new Product(310, "Watch", "Accessories"),
            new Product(450, "Shoes", "Footwear"),
            new Product(502, "Book", "Books")
        };

        int targetId = 310;

        long start = System.nanoTime();
        int linearResult = SearchUtils.linearSearch(products, targetId);
        long linearTime = System.nanoTime() - start;

        start = System.nanoTime();
        int binaryResult = SearchUtils.binarySearch(sortedProducts, targetId);
        long binaryTime = System.nanoTime() - start;

        System.out.println("Linear Search: index=" + linearResult + ", time=" + linearTime + "ns");
        System.out.println("Binary Search: index=" + binaryResult + ", time=" + binaryTime + "ns");
    }
}
