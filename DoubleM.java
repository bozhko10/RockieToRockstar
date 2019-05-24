/*
    Class which represents the letter M printed twice
*/
public class DoubleM
{
    // Instance variables
    private int N;
    private int startEndN;
    private int starsMiddle;
    private int dashMiddle;

    // Constructor
    public DoubleM(int givenN)
    {
        N = givenN;
        startEndN = N;
        starsMiddle = N;
        dashMiddle = N;
    } // DoubleM

    // Printing method
    public void print()
    {
        // While printing the first half of the letter
        while (dashMiddle >= 1) 
        {
            for (int i = 0; i < 10; i++) 
            {
                if (i == 0 || i == 4 || i == 5 || i == 9)
                    for (int j = 0; j < startEndN; j++)
                        System.out.print("-");
                else if (i == 2 || i == 7)
                    for (int j = 0; j < dashMiddle; j++)
                        System.out.print("-");
                else
                    for (int j = 0; j < starsMiddle; j++)
                        System.out.print("*");
            } // for
            System.out.println();
            // Decrementing/Incrementing the variables after each printed line
            startEndN--;
            starsMiddle += 2;
            dashMiddle -= 2;
        } // while
        // Setting the variables for the next half
        dashMiddle = 1;
        starsMiddle -= 2;
        // Second while loop printing the second half of the letter
        while (dashMiddle <= N) 
        {
            for (int i = 0; i < 14; i++) 
            {
                if (i == 1 || i == 5 || i == 8 || i == 12)
                    for (int j = 0; j < N; j++)
                        System.out.print("*");
                else if (i == 2 || i == 4 || i == 9 || i == 11)
                    for (int j = 0; j < dashMiddle; j++)
                        System.out.print("-");
                else if (i == 3 || i == 10)
                    for (int j = 0; j < starsMiddle; j++)
                        System.out.print("*");
                else
                    for (int j = 0; j < startEndN; j++)
                        System.out.print("-");
            } // for
            System.out.println();
            // Decrementing/Incrementing the variables after each printed line
            startEndN--;
            starsMiddle -= 2;
            dashMiddle += 2;
        } // while 
    } // print()
} // class DoubleM 
