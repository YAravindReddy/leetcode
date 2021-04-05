class Solution {
    public boolean isValid(String s) {
        
  if (s.isEmpty()) {
            return true;
        }
            else {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);
                if (current == '(' || current == '{' || current == '[') {
                    stack.push(current);
                    System.out.println("ist if");
                } else {

                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.peek();
                    
                    if ((current == ')' && top != '(') || (current == '}' && top != '{') || (current == ']' && top != '[')) {
                        
                        return false;
                    } else {
                       
                        stack.pop();
                    }

                }
            }
            if(stack.isEmpty()!=true){
                return false;
            }else{
            return true;}
        }
    }

public static void main(String[] args) {

        Solution sol= new Solution();
        System.out.println(sol.isValid("([])"));
}
}