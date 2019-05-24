/*
    Class which represents the letter M printed twice
*/
public class DoubleM
{
    // Instance variables
    private int N;
    private int StartEndN;
    private int StarsMiddle;
    private int DashMiddle;

    // Constructor
    public DoubleM(int givenN)
    {
        N = givenN;
        StartEndN = N;
        StarsMiddle = N;
        DashMiddle = N;
    } // DoubleM

    // Printing method
    public void print()
    {
        // While printing the first half of the letter
        while (DashMiddle >= 1) 
        {
            for (int i = 0; i < 10; i++) 
            {
                if (i == 0 || i == 4 || i == 5 || i == 9)
                    for (int j = 0; j < StartEndN; j++)
                        System.out.print("-");
                else if (i == 2 || i == 7)
                    for (int j = 0; j < DashMiddle; j++)
                        System.out.print("-");
                else
                    for (int j = 0; j < StarsMiddle; j++)
                        System.out.print("*");
            } // for
            System.out.println();
            // Decrementing/Incrementing the variables after each printed line
            StartEndN--;
            StarsMiddle += 2;
            DashMiddle -= 2;
        } // while
        // Setting the variables for the next half
        DashMiddle = 1;
        StarsMiddle -= 2;
        // Second while loop printing the second half of the letter
        while (DashMiddle <= N) 
        {
            for (int i = 0; i < 14; i++) 
            {
                if (i == 1 || i == 5 || i == 8 || i == 12)
                    for (int j = 0; j < N; j++)
                        System.out.print("*");
                else if (i == 2 || i == 4 || i == 9 || i == 11)
                    for (int j = 0; j < DashMiddle; j++)
                        System.out.print("-");
                else if (i == 3 || i == 10)
                    for (int j = 0; j < StarsMiddle; j++)
                        System.out.print("*");
                else
                    for (int j = 0; j < StartEndN; j++)
                        System.out.print("-");
            } // for
            System.out.println();
            // Decrementing/Incrementing the variables after each printed line
            StartEndN--;
            StarsMiddle -= 2;
            DashMiddle += 2;
        } // while 
    } // print()
} // class DoubleM 