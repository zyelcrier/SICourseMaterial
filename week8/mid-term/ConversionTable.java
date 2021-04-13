public class ConversionTable {
    public static void main(String[] args) {
        System.out.println("This is the ConversionTable problem.\n");

        // add statements that will print a table showing
        // dollar amounts from $100 to $500 in $50 increments
        // with the equivalent value in pounds
        // use the conversion rate of
        // 1 dollar to 0.72 pounds
        for (int i = 100; i <= 500; i = i + 50) {
            System.out.printf("%d \t %10.2f\n", i, (i * 0.72));
        }
    }
}
