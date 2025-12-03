package stringpractice3;

public class StringPractice3 {

    public static void main(String[] args) {
        String str1="JAVA";
        String str2="java";
        String str3=new String("java");
        String str4="python";
        String str5="java";
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str4.compareTo(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("j"));
        System.out.println(str2.concat(str4));
        System.out.println(str1.equals(str2));
        
        //Difference between equals and ==
        System.out.println(str2.equals(str5));
        System.out.println(str2==str5);
        System.out.println(str3.equals(str2));
        System.out.println(str3==str2);
    }
    
}
