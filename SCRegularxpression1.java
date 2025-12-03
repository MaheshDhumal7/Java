
package scregularxpression1;

public class SCRegularxpression1 {

    public static void main(String[] args) {
        //Remove special characters from string
        String str="A!a@X$Gb%7";
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
        
        //Replace all spaces from string
        String str2="  daku mangal singh ";
        System.out.println(str2.replaceAll("\\s"," ").trim());
                
        // number of words of string
        String str1=str2.replaceAll("\\s"," ").trim();
        String Words[]=str1.split("\\s");
        System.out.println(Words.length);
    }
    
}
