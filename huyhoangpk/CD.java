package huyhoangpk;

public class CD {
	private int maCD;
	private String tuaCD;
	private int SoBaiHat;
	private double GiaThanh;
	
	public static final int MA_CD_MAC_DINH = 999999;
	public static final String TUA_CD_MAC_DINH = "Chua xac dinh";
	
	public CD() {
		this.maCD = MA_CD_MAC_DINH;
		this.tuaCD = TUA_CD_MAC_DINH;
		this.SoBaiHat = 1;
		this.GiaThanh = 1.0;
		
	}
	
	public CD(int maCD, String tuaCD, int SoBaiHat,double GiaThanh) {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setsoBaiHat(SoBaiHat);
		setgiaThanh(GiaThanh);
	}
	
	public int getMaCD() {return maCD;}
	public String getTuaCD() {return tuaCD;}
	public int getsoBaiHat() {return SoBaiHat;}
	public double getgiaThanh() {return GiaThanh;}
	
	public void setMaCD(int maCD) {
		if (maCD <=0) 
			throw new IllegalArgumentException("Loi : ma CD phai >0!");
		this.maCD = maCD;
	}
	
	public void setTuaCD( String tuaCD){
		if (tuaCD == null || tuaCD.trim().isEmpty())
			throw new IllegalArgumentException("Loi : Tua CD khong duoc rong!");
		this.tuaCD = tuaCD;		
	}
	public void setsoBaiHat(int SoBaiHat) {
		if (SoBaiHat <= 0)
			throw new IllegalArgumentException("Loi : So bai hay phai >0! ");
		this.SoBaiHat = SoBaiHat;
	}
	public void setgiaThanh(double GiaThanh) {
		if (GiaThanh <=0 )
			throw new IllegalArgumentException("Loi : Gia thanh phai >0!");
		this.GiaThanh = GiaThanh;
			
	}

	public String toString() {
		return String.format("| %-10d | %-25s | %-12d | %-15.2f",maCD,tuaCD,SoBaiHat, GiaThanh);
	}

}
