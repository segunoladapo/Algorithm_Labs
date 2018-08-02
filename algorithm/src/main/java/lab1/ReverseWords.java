package lab1;

import java.util.Stack;

public class ReverseWords {

    public static String reverseSting(String s) {
        StringBuilder reversedWords = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                while(!stack.isEmpty()) {
                    reversedWords.append(stack.pop());

                }
                reversedWords.append(' ');
            }else {
                stack.push(s.charAt(i));
            }

        }
        while(!stack.isEmpty()) {
            reversedWords.append(stack.pop());

        }
        return reversedWords.toString();
    }



    public static void main(String... args) {
        String words = "There is no built-in way to see for how long your program has been running. However, you could at the start of the program just store the current time, so that sometime later you can see how much time has elapsed There is no built-in way to see for how long your program has been running. However, you could at the start of the program just store the current time, so that sometime later you can see how much time has elapsed There is no built-in way to see for how long your program has been running. However, you could at the start of the program just store the current time, so that sometime later you can see how much time has elapsed There is no built-in way to see for how long your program has been running. However, you could at the start of the program just store the current time, so that sometime later you can see how much time has elapsed There is no built-in way to see for how long your program has been running. However, you could at the start of the program just store the current time, so that sometime later you can see how much time has elapsed There is no built-in way to see for how long your program has been running. However, you could at the start of the program just store the current time, so that sometime later you can see how much time has elapsed";
        words +=words;
        words +=words;
        words +=words;
        words +=words;
        words +=words;
        words +=words;
        long startTime = System.currentTimeMillis();
        reverseSting(words);
        long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
    }
}