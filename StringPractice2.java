package stringpractice2;

public class StringPractice2 {

    public static void main(String[] args) {
        String str="http.dangi.com";
        boolean b=str.startsWith("http");
        boolean c=str.endsWith("com");
        System.out.println(b+" \n"+c);
        System.out.println(str.startsWith("dangi",5));
        
        char h=str.charAt(5);
        System.out.println(h);
        System.out.println(str.charAt(8));
        
        int m=str.indexOf("t");
        int n=str.lastIndexOf("t");
        int q=str.lastIndexOf("t",1);
        System.out.println(m+" "+n+" "+q);
        
        for(int i=0;i<str.length();i++)
            System.out.print(str.charAt(i));
        
    }
    
}
