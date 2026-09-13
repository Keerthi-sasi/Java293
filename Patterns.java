class Patterns
{
    public static void main(String[] args)
    {
        //square pattern
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //right triangle
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //inverted right triangle
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print("* ");    
            }
             System.out.println("");
        }

        //number triangle
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        //same number triangle
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }

        //increasing numbers continuously
        int num = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
        }

        
    }
}