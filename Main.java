
package pkg2darray;

public class Main {

    public static void main(String[] args) {
        int A[][]=new int[5][5];
        int B[][]={{1,3,5},{2,4,9},{7,4,9},{3,6,0}};
        int c[][];
        c=new int[5][5];
        int []D[]=new int[5][5];
        
        int[]E,F[];
        //here second becomes 2D array and 1st=1D array
        E=new int[5];
        F=new int[5][5];
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[0].length;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("For Each Loop");
        for(int x[]:B)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
                }
        
        
        System.out.println("Jagged array");
        int x[][];
        x=new int[3][];
        x[0]=new int[4];
        x[1]=new int[3];
        x[2]=new int[6];
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
    
}
