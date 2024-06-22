public class test {
    public static void main(String[] args) {
        String input2 = "sKy is BLUE!";
        String result = capitalizeFirstAndLast(input2);
        System.out.println(result); // Output: "Sky Is Blue"
    }
    static String capitalizeFirstAndLast(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+"); // Split by whitespace
        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                char lastChar = Character.toUpperCase(word.charAt(word.length() - 1));
                result.append(firstChar).append(word.substring(1, word.length() - 1)).append(lastChar).append(" ");
            }
        }
        return result.toString().trim();
    }

}
