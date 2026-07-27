interface PatientManagement
{
    void viewPatientDetails();
}

interface Billing
{
    void generateBill();
}

class HospitalService implements PatientManagement, Billing
{
    public void viewPatientDetails()
    {
        System.out.println("Patient Name: Durga");
        System.out.println("Patient ID: 101");
        System.out.println("Disease: Fever");
    }

    public void generateBill()
    {
        System.out.println("Bill Amount: $500");
        System.out.println("Payment Status: Paid");
    }
}

class multipleinheritancetask2
{
    public static void main(String[] args)
    {
        HospitalService h = new HospitalService();

        h.viewPatientDetails();
        h.generateBill();
    }
}