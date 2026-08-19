class Day7p2
{
    public static void main(String[] args) {
        try
        {
            int a = 9;
            int b = 0;
            System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("code executed");
        }
        int[] num = {2,4,2,1};
        try
        {
        System.out.println(num[8]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid array index");
        }
        finally{
            System.out.println("code executed");
        }
        String name = null;
         try
        {
        System.out.println(name);
        }
        catch(NullPointerException e)
        {
            System.out.println("Null value");
        }
        finally{
            System.out.println("code executed");
        }
        

    }
    
       
}