// Exceptions to be used with Solution class
public class SolutionException extends Exception
{
    public SolutionException()
    {
        super();
    } // SolutionException

    // Create SolutionException with message but no cause
    public SolutionException(String message)
    {
        super(message);
    } // SolutionException

    // Create SolutionException with message and cause
    public SolutionException(String message, Throwable cause)
    {
        super(message, cause);
    } // SolutionException

    // Create SolutionException with no message but with cause
    public SolutionException(Throwable cause)
    {
        super(cause);
    } // SolutionException
} // class SolutionException