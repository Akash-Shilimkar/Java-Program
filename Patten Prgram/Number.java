class Number{
    public static void main(String[] args)
    {
        int a = 1;
        int j;
        for(i=0;i<=4;i++)
        {
            for(j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(a);
                a++;
            }
        }
    }
}