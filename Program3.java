//Dawson Cummings
//Program 3
import java.util.EmptyStackException;
public class Program3 {
    public static double orderOfOperations (char a){
        if ( a == '^'){ // this command will take priority in order of operations
            return 2;
        }
        if (a == '*' || a == '/'){ // this command will take second priority
            return 1;
        }
        if (a == '+'|| a == '-'){ // this command will take third priority
            return 0;
        }
        return -1;
    }
    public static String InfixToPostfix( String s ){
        ArrayStackClass Stack = new ArrayStackClass(32);
        int n = Stack.maxSize;
        String answer = "";
        for (int i = 0; i < n; i ++){
            char a = s.charAt(i);
            if ( a >= 0 && a <=9){
                answer = s;
            }
            else if (a == '('){
                Stack.push(a);
            }
            else if (a == ')'){
                while (Stack.peek() != '(' && Stack.empty() != 0){
                    Stack.pop();
                }
            }

        else{
            while (Stack.empty() != 0 && Stack.peek() >= (orderOfOperations(a))){
                Stack.pop();
                }
            Stack.push(a);
            }
        if (Stack.empty() != 0){
            Stack.pop();
        }
        }
        return answer;
    }
    public static void main(String[] args) {
    System.out.println(InfixToPostfix("4 + 6 * 3.1"));
    System.out.println(InfixToPostfix("4 + (6 * 3.1)"));
    System.out.println(InfixToPostfix("(4 + 6) * 3.1"));
    System.out.println(InfixToPostfix("2 + 3 * 4"));
    System.out.println(InfixToPostfix("2 & 3 @ 4"));
    System.out.println(InfixToPostfix("2 + 3 % 4"));
    System.out.println(InfixToPostfix("2.0 + 3 * 4"));
    System.out.println(InfixToPostfix("2.0 + 3 / 4"));
    System.out.println(InfixToPostfix("3 + 4 * 2 / ( 1 – 5 )"));
    System.out.println(InfixToPostfix("3 + 4.0 * 2 / ( 1.0 – 5 )"));
    System.out.println(InfixToPostfix("2 / 9.2 / 3.1 * 6"));
    }
}
