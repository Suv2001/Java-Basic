import java.lang.*;

public class Day25 {
    public static void main(String[] args) {
        
        int x =1;
        int y =100;
        
        try{
            float f = (float)x/y;
            if( f<0.01)
            {
                throw new A("Hello World!");
        }
        
    }
    catch(A a){
        System.out.println("Exception caught ");    
        System.out.println(a.getMessage());
        
    }
    
    }
}

class A extends Exception 
{
    A(String sms)
    {
        super(sms);
    }
}
