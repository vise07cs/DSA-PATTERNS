

public class P4 {
    public static void printPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(i+1 + " ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
    
}