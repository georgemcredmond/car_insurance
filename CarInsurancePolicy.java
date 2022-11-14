// Chapter 4 practice exercise

public class CarInsurancePolicy
{
	// instance variables for this class
	private int policyNumber;
	private int numPayments;
	private String residentCity;

	// custom overloaded constructor for the class
	public CarInsurancePolicy(int num, int payments, String city)
	{
		policyNumber = num;
		numPayments = payments;
		residentCity = city;
	}

	public CarInsurancePolicy(int num, int payments)
	{
		policyNumber = num;
		numPayments = payments;
		residentCity = "Mayfield";
	}

	public CarInsurancePolicy(int num)
	{
		policyNumber = num;
		numPayments = 2;
		residentCity = "Mayfield";
	}

	// accessor (getter) method for the class
	public void display()
	{
		System.out.println("Policy #" + policyNumber + ". " + numPayments + " payments annually. Driver resides in " + residentCity + ".");
	}
}