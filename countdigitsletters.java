public class countdigitsletters
{
public static void main(String[] args) 
{
String str = "Java123";
int letters = 0;
int digits = 0;
for (int i = 0; i < str.length(); i++) 
{
char ch = str.charAt(i);
if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) 
{
   letters++;
}
            
else if (ch>='0' && ch<='9') 
{
  digits++;
}
}
System.out.println("Letters = " + letters);
System.out.println("Digits = " + digits);
}
}