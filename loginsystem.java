import java.util.Scanner;
public class loginsystem 
{
static boolean login(String username, String password) 
{
if (username.equals("admin") && password.equals("1234")) 
{
return true;
} 
else 
{
return false;
}
}
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Username: ");
String username = sc.next();
System.out.print("Enter Password: ");
String password = sc.next();
if (login(username, password)) 
{
System.out.println("Login Successful");
}
else 
{
System.out.println("Login Failed");
}
}
}