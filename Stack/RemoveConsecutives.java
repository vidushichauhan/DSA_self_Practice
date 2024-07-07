//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//taking the length of the string
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //taking the string
		   String str = br.readLine().trim();
		   
		   //calling removeConsecutiveDuplicates method of class solve
		   System.out.println(new Solution().removeConsecutiveDuplicates(str));
		}
	}
}
// } Driver Code Ends



class Solution
{
    //Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String s)
    {
        Stack<Character> st = new Stack<Character>();
        String str="";
        for(Character c: s.toCharArray()){
            if(st.isEmpty() ||(!st.isEmpty() && st.peek()!=c)){
                st.push(c);
            }
        }
while(!st.isEmpty()){
str = st.peek()+str;
st.pop();
}

return str;
    }
}