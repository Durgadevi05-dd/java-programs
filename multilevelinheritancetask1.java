class Person
{
    String name = "Durga";

    void displayName()
    {
        System.out.println("Name: " + name);
    }
}

class Student extends Person
{
    int rollNo = 101;

    void displayRollNo()
    {
        System.out.println("Roll Number: " + rollNo);
    }
}

class GraduateStudent extends Student
{
    String specialization = "MCA";

    void displaySpecialization()
    {
        System.out.println("Specialization: " + specialization);
    }
}

class multilevelinheritancetask1
{
    public static void main(String[] args)
    {
        GraduateStudent g = new GraduateStudent();

        g.displayName();
        g.displayRollNo();
        g.displaySpecialization();
    }
}