package p1;

public class AutomaticTransmission extends Transmission {

	private double eigthGareRatio;

	public AutomaticTransmission(String transmissionModel) {
		super(transmissionModel);

	}

	public double getEigthGareRatio() {
		return eigthGareRatio;
	}

	public void setEigthGareRatio(double eigthGareRatio) {
		this.eigthGareRatio = eigthGareRatio;
	}

}
