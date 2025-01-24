public class javaViva1 {
    public static void main(String[] args) {
        try{
            float f = 1/1000;
            if(f < 1)
            {
                throw new Myexception("not the exact value");
            }
        }
        catch(Myexception e)
        {
            System.out.println(e.getMessage());
        }
    }
}


class Myexception extends Exception
{
    Myexception(String message)
    {
        super("This is intentionaly created ");
    }
}