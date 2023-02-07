import java.util.Scanner;
class Solution 
{
    static void PrintSeq(char c, int number)
    {
        while (number > 1)
        {
            System.out.print(c);
            number--;
        }
    }
    static void ToConvert(String str)
    {
        char c[] = str.toCharArray();
        for (int i = 0; i < c.length; i++)
        {
            int val = 0;
            if ( c[i] >= '0' && c[i] <= '9' )
            {
                try
                {
                    if ( c[i + 1] >= '0' && c[i + 1] <= '9' )
                    {
                        String a1 = String.valueOf(c[i] - 48);
                        String a2 = String.valueOf(c[i + 1] - 48);
                        val = Integer.parseInt(a1 + a2);
                        PrintSeq(c[i - 1], val);
                        i++;
                    }
                    else
                    {
                        val = c[i] - 48;
                        PrintSeq(c[i - 1], val);
                    }
                }
                catch (ArrayIndexOutOfBoundsException ex)
                {
                    val = c[i] - 48;
                    PrintSeq(c[i - 1], val);
                }
            }
            else
            {
                System.out.print(c[i]);
            }
        }
    }
    public static void main(String args[]) throws Exception
    {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        ToConvert(word);
        s.close();
    }
}

