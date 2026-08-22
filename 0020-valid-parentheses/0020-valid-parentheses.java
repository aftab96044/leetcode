class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);


            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;

            }

            
            if (stack.isEmpty()) {
                return false;
            }

            if (c == ')') {
                if (stack.peek() != '(') {

                    return false;
                } else {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();
                }

            } else if (c == '}') {
                if (stack.peek() != '{') {

                    return false;
                } else {
                    stack.pop();
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();

    }
}