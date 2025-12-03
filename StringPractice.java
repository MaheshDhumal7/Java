
package stringpractice;

public class StringPractice {

    public static void main(String[] args) {
        String str1="Java Program";
        String str2=new String("Java");
        System.out.println(str2);
        
        char c[]={'a','b','c','d'};
        String str3=new String(c);
        System.out.println(str3);
        
        byte b[]={65,66,67,68};
        String str4=new String(b);
        String str5=new String(b,2,2);// 1st 2 no indicates index from byte and 2nd 2 no indicates no of letters onwards
        System.out.println(str4+" \n "+str5);    
    }
    
}
