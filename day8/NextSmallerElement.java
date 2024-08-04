import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] nextSmaller = nextSmallerElement(arr);

        // Printing the next smaller elements
        System.out.print("Next Smaller Elements: ");
        for (int i : nextSmaller) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Finding the minimum of the next smaller elements
        int minElement = findMin(nextSmaller);
        System.out.println("Minimum of the next smaller elements: " + minElement);
    }

    public static int[] nextSmallerElement(int[] arr) {
        int n = arr.length;
        int[] nextSmaller = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Pop elements that are greater than or equal to the current element
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // If stack is not empty, the top of the stack is the next smaller element
            if (!stack.isEmpty()) {
                nextSmaller[i] = stack.peek();
            } else {
                // If stack is empty, there is no smaller element
                nextSmaller[i] = -1;
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return nextSmaller;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i != -1) { // -1 indicates no smaller element
                min = Math.min(min, i);
            }
        }
        return min;
    }
}
