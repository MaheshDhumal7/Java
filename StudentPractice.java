
package studentpractice;

public class StudentPractice {

    public static void main(String[] args) {
        String str="programmer@gmail.com";
        int a=str.indexOf("@");
        String uname=str.substring(0,a);
        String dname=str.substring(a+1,str.length());
        System.out.println(dname.startsWith("gmail"));
        System.out.println(a+" \n"+"username is:"+uname+"\n"+"domainname is:"+dname);
        
        int j=dname.indexOf(".");
        String str2=dname.substring(0,j);
        System.out.println(str2.equals("gmail"));
        System.out.println(dname.substring(0, j));
        
        
    }
    
}
