/**
 * LeetCode：20.有效的括号 Description：给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。左括号必须以正确的顺序闭合。
 * 示例 1:
 * 输入：s = "()"
 * 输出：true
 * 示例 4：
 * 输入：s = "([)]"
 * 输出：false
 * Solution：构造栈进行匹配
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution0020 {
    public boolean isValid(String s) {
        MyStack stack = new MyStack(s.length());
        Map<String, String> matchMap = new HashMap<>();
        matchMap.put("(", ")");
        matchMap.put("{", "}");
        matchMap.put("[", "]");
        List<String> leftList = new ArrayList<>();
        leftList.add("(");
        leftList.add("{");
        leftList.add("[");
        List<String> rightList = new ArrayList<>();
        rightList.add(")");
        rightList.add("}");
        rightList.add("]");

        for (String str : s.split("")) {
            // 添加首字符
            if (stack.top < 0) {
                // 首字符为右括号则无法匹配
                if (rightList.contains(str)) {
                    return false;
                }
                stack.push(str);
                continue;
            }
            // 非首字符为左括号
            if (leftList.contains(str)) {
                stack.push(str);
                continue;
            }
            // 非首字符为右括号且匹配栈顶则弹栈
            if (matchMap.get(stack.peek()).equals(str)) {
                stack.pop();
                continue;
            }
            // 非首字符为右括号且不匹配栈顶
            return false;
        }
        // 栈为空则说明完全匹配
        return stack.isEmpty();
    }

    static class MyStack {
        private String[] stack;

        private int top;

        public MyStack(int size) {
            this.stack = new String[size];
            this.top = -1;
        }

        public void push(String input) {
            this.stack[++top] = input;
        }

        public void pop() {
            top--;
        }

        public String peek() {
            return this.stack[top];
        }

        public boolean isEmpty() {
            return this.top < 0;
        }
    }
}