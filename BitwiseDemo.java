package bitwisedemo;

public class BitwiseDemo {
    
    public static void main(String[] args) {
        /*int x=7;
        int y=5;*/
        
        int x=0b111;
        int y=0b101;
        int z,v,r,w,p,q;
        
        z=x|y;  //Or 
        v=x^y;  //Xor
        r=x>>1; //Right shift
        w=x<<1; //Left shift
        p=x>>>1;//Unsigned Right shift
        q=~x;   //Not
        
        System.out.println(z);      
        System.out.println(v);
        System.out.println(r);
        System.out.println(w);
        System.out.println(p);
        //Binary representation of x and y
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%32s",Integer.toBinaryString(y)));
        //Not operator
        System.out.println(q);
        System.out.println(String.format("%s",Integer.toBinaryString(q)));
        
    }
    
}
