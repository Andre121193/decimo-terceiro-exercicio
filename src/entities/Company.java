package entities;

public class Company extends TaxPayer{
	
	private int numberOfEmployees;
	
	public Company() {
		super();
	}
	
	
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}



	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}



	public Company(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}



	@Override
	public double tax() {
		if (numberOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
		
	}

}
