class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2 = nums2.length;
        int[] next = new int[n2];
        for (int i = 0; i < n2; i++) {
            next[i] = -1;
        }

        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = 0; i < n2; i++) {
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                int topIndex = stack.pop();
                next[topIndex] = nums2[i];
            }
            stack.push(i);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < n2; j++) {
                if (nums2[j] == nums1[i]) {
                    result[i] = next[j];
                    break;
                }
            }
        }
        return result;
    }
}
