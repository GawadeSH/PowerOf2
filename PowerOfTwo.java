import java.util.Scanner;
public class PowerOfTwo
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any power of 2");
        int n = s.nextInt();
        for(int i=1;i<=n;i++)
        {
            int pow = (i*2);
            System.out.println(pow);

        }

    }
}
