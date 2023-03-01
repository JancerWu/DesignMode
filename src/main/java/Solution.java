import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public static void main(String[] args) {
        new Solution().longestWPI(new int[]{6,6,9});


    }
    public int longestWPI(int[] hours) {
        int n = hours.length;
        for (int i = 0; i < n; i++) {
            if (hours[i] > 8) hours[i] = 1;
            else hours[i] = -1;
        }
        int[] pre = new int[n+1];
        for (int i = 1; i <= n; i++) pre[i] = pre[i-1] + hours[i-1];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            if (stack.isEmpty() || pre[i] < pre[stack.peek()]) stack.push(i);
        }
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && pre[i] - pre[stack.peek()] > 0) {
                ans = Math.max(ans, i - stack.peek());
                stack.pop();
            }
        }
        return ans;

    }
}