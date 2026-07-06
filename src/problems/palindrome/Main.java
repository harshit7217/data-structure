package problems.palindrome;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();

        operations.insert();

        boolean check = operations.isPalindrome();
        System.out.println(check ? "List is Palindrome" : "List is not Palindrome");
    }
}
