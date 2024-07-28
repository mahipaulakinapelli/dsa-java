import java.util.*;

class FormPalindrome {
    public static void main(String[] args) {
       System.out.println(countMin("abcd"));
    }
    
     static int countMin(String s1)
    {
        StringBuffer sb = new StringBuffer(s1);
        
        sb=sb.reverse();
        
        int n=s1.length();
        
        String s2=sb.toString();
        
        StringBuffer str1= new StringBuffer("");
        StringBuffer str2= new StringBuffer("");
        
        int dp[][] = new int[n+1][n+1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    if(i==1 && Math.max(dp[i-1][j],dp[i][j-1])==0){         //for printing the palindrome string 
                        str1=str1.append(s1.charAt(j-1));
                    }
                    if(j==1 && Math.max(dp[i-1][j],dp[i][j-1])==0){
                        str2=str2.append(s2.charAt(i-1));
                    }
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }   
        
        str1=str1.reverse();
        // str2=str2.reverse();
        
        System.out.println(str1);
        System.out.println(str2);
        
        StringBuffer sb1 = new StringBuffer();
        sb1=sb;
        
      //  System.out.println(sb.reverse().append(str1));
         System.out.println(str2.append(sb1.reverse()));
        
        return n-dp[n][n];
    }
}

