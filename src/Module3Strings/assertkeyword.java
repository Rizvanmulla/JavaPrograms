package Module3Strings;

public class assertkeyword
{
    public static void main(String[] args) 
    {
        int a = 75; // to enable assertions, use -ea (enable assertions) while running the program
        assert a >= 50: "a is less than 50"; // This assertion passes because 100 >= 50

        assert a < 200: "Conditions are not matching"; // This assertion also passes because 100 < 200
        
        System.out.println("Hello, I am Rijwan"); // This will execute if all assertions pass
    }
}
