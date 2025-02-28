public class Comparison {
    public static void main(String[] args) {
        String a = "Rudra";
        String b = "Rudra";

        // ==(

        System.out.println(a == b); // giving warning?

        String first = new String("Rudy");
        String second = new String("Rudy");

        System.out.println(first == second);

        System.out.println(first.equals(second));
    }
}
