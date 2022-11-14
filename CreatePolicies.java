// Chapter 4 practice exercise

public class CreatePolicies
{
	public static void main(String[] args)
	{
		// variables and constants
		CarInsurancePolicy first = new CarInsurancePolicy(123);
		CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
		CarInsurancePolicy third = new CarInsurancePolicy(789, 12, "Newcastle");

		// output phase
		first.display();
		second.display();
		third.display();
	}
}