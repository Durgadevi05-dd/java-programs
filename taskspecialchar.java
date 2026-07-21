import java.util.Scanner;
public class taskspecialchar
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int space = 0;
int special = 0;
for (int i = 0; i < str.length(); i++) 
{
char ch = str.charAt(i);
if (ch == '.') 
{
space++;
} 
else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) 
{
                
} 
else 
{
special++;
}
}
System.out.println("Spaces: " + space);
System.out.println("Special Characters: " + special);
}
}