class Solution {
    public boolean isPalindrome(String s) {
        String str1 ="";
        int k =0;
        for(char str :s.toCharArray()){
            if(Character.isAlphabetic(str) || Character.isDigit(str)){
                str1 = str1 + Character.toLowerCase(str);
            }
        }

        System.out.println(str1);
        for(int i = 0; i<str1.length()/2;i++){
            if(str1.charAt(i)!=str1.charAt(str1.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}