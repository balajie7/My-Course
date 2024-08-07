package Task4;

import java.util.Arrays;

public class Collection {

        private int stack[];
        private int top;

    public Collection( int SIZE){
            stack = new int[SIZE];
            top = -1;
        }
        public void push ( int i){
            if (top == stack.length) {
                extendStack();

            }
            stack[top] = i;
            top++;
        }
        public int pop () {
            top--;
            return stack[top];

        }
        private void extendStack () {
            int[] copy = Arrays.copyOf(stack, stack.length);

        }


}
