import java.io.*;

public class javaViva {
    public static void main(String[] args)  {
        int array [] = new int [5];
        try
        {
            System.out.println(array[1]);
        }
        catch (Exception e)
        {
            System.out.println("Inavalid index: "+e.getMessage());
        }
        finally
        {
            System.out.println("This is an error");
        }
    }
}