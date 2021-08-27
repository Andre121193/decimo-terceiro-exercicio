package entities;

public class individual extends TaxPayer {
	
	private double healthExpenditures;
	
	public individual() {
		super();
	}

	public individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}



	public double getHealthExpenditures() {
		return healthExpenditures;
	}



	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}



	@Override
	public double tax() {
		if (getAnualIncome() < 20000) {
			return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		} else {
			return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
	}

}
