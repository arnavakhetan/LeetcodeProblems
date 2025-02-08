class Solution {
    public int calPoints(String[] operations) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (String op : operations) {
            switch (op) {
                case "+":
                    int top = stack.pop();
                    int newScore = top + stack.peek();
                    stack.push(top);     
                    stack.push(newScore);
                    break;

                case "D":
                    stack.push(stack.peek() * 2);
                    break;

                case "C":
                    stack.pop();
                    break;

                default:
                    stack.push(Integer.parseInt(op));
            }
        }
        int totalScore = 0;
        for (int score : stack) {
            totalScore += score;
        }
        return totalScore;
    }
}
