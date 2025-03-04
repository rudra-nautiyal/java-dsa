public class Palindrome {
    public static void main(String[] args) {
        String str = "RaceCars";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
