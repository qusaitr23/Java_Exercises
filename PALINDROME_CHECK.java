public class PALINDROME_CHECK {
    /**
     * In the above snippet, we simply iterate the given String from the last character and append each character to the next character, all the way through to the first character thereby reversing the given String.
     * Finally, we test for equality between the given String and reversed String.
     * @param text
     * @return True/False.
     */
    public boolean isPalindromeReverseTheString(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }
}
