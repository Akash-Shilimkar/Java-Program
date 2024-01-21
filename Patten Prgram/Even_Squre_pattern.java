//W.A.P in java to print the even number in given number.

class Even_Squre_pattern{
    public static void main(String[] args){
        int a = 2;
        for(int i = 1;i<=4; i++)
        {
            for(int j=1;j<=4;j++)
            {
                System.out.print(a+" ");
                a = a +2;
            }
            System.out.println();
        }
    }
}