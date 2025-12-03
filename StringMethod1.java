package stringmethod1;

public class StringMethod1 {

        public static void main(String[] args) {
          String str="Mahesh";
          int a=str.length();
          System.out.println(a);
          
          str=str.toUpperCase();
          String str1=str.toLowerCase();
          System.out.println(str+" \n"+str1);
          
          //.string trim
          String str2=str.trim();
          System.out.println("str2 is "+str2);
          
          //String substring(int begin)
          String str3=str.substring(3);
         
          //String substring(int begin,int end)
          String str4=str.substring(2,6);
          System.out.println(str3+" \n"+str4);
          //replacing old letters with new
          String str5=str.replace('H','P');
          System.out.println("str5 is "+str5);
        }
    
}
