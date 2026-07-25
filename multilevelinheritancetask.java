class Employee
{
    String employeeName = "Arun";
    int employeeId = 101;

    void displayEmployee()
    {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer extends Employee
{
    String programmingLanguage = "Java";

    void displayDeveloper()
    {
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class SeniorDeveloper extends Developer
{
    int experience = 6;

    void displaySeniorDeveloper()
    {
        System.out.println("Experience: " + experience + " years");

        if(experience >= 5)
        {
            System.out.println("Eligible for Team Lead");
        }
        else
        {
            System.out.println("Not Eligible for Team Lead");
        }
    }
}

class multilevelinheritancetask
{
    public static void main(String[] args)
    {
        SeniorDeveloper sd = new SeniorDeveloper();

        sd.displayEmployee();
        sd.displayDeveloper();
        sd.displaySeniorDeveloper();
    }
}