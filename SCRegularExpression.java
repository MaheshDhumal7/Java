
package scregularexpression;

public class SCRegularExpression {

    public static void main(String[] args) {
        // to check binary number
        int i=11010010;
        String str=String.valueOf(i);
        //String str=i+"";
        System.out.println(str.matches("[10]+"));

        //to check hexadecimal number
        
        String str1="234AD";
        System.out.println(str1.matches("[0-9A-F]+"));
        
        //data in data format
        
        String str2="10/03/2003";
        System.out.println(str2.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
    
}
