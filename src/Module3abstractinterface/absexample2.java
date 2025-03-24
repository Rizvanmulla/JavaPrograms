package Module3abstractinterface;

abstract class google_authen
{
    abstract void login();
    abstract void logout();
}

public class absexample2 extends google_authen 
{
    @Override
    void login() {
        System.out.println("You are logged in");
    }

    @Override
    void logout() {
        System.out.println("You are logged out");
    }

    public static void main(String[] args) 
    {
        absexample2 e = new absexample2();
        e.login();
        e.logout();
    }
}
