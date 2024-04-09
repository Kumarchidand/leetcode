// class Solution {
//     public String reverseWords(String s) {
//         String ans="";
//         int n=s.length(),i=n-1;
//         while(i>=0){
//             if(s.charAt(i)==' '){
//                 i--;
//                 continue;
//             }
//             int j=i+1;
//             while(i>=0 && s.charAt(i)!=' ') i--;
//             if(ans.equals(""))   ans=ans+s.substring(i+1,j);
//             else    ans=ans+" "+s.substring(i+1,j);
//         }
//         return ans;
//     }
// }

// we need to split the string into string array
// then we need to reverse the array,so for reversing we are going to to take string builder class
// then store the reverse word into string builder,add also spaces
// then return the string array to string .
class Solution {
    public String reverseWords(String s) {
     String[] words=s.split(" +");
    //  (space + means it could be any number of spaces)
    // stringbuilder is a class ,is used to create mutable string .
    // if we modify the sting then rather than creating of objectjust 
    // go towards stringbuilder class)
     StringBuilder sb=new StringBuilder();
     for(int i=words.length-1;i>=0;i--){
        sb.append(words[i]);
        sb.append(" ");
     }
      return sb.toString().trim();
    }
}