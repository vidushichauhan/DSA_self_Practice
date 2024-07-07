//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class BalancedParathesis
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<Character> ();
        for(char s:x.toCharArray()){
            if(s == '{'||s == '('||s == '['){
                st.push(s);
            }
            else if((s == '}' && !st.isEmpty() && st.peek() == '{') || 
                       (s == ')' && !st.isEmpty() && st.peek() == '(') || 
                       (s == ']' && !st.isEmpty() && st.peek() == '[')){
                st.pop();
            }
            else{
                return false;
            }
        }
        return st.isEmpty();
    }
}
