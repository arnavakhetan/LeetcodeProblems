class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for (String word : words) {
            int len = word.length();
            int position = word.charAt(len - 1) - '1'; // Convert '1'-'9' to 0-8
            result[position] = word.substring(0, len - 1); // Remove the digit
        }
        return String.join(" ", result);
    }
}
