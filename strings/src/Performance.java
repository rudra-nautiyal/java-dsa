public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            System.out.print((char)('a' + i));
            series = series + (char)('a' + i);
        }
        System.out.println();
        System.out.println(series);
    }
}
