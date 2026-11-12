package BaiTH_2;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	public SinhVien() {
		this.maSV =1;
		this.hoTen= "Chua cap nhat";
		this.diemLT = 0.0f;
		this.diemTH = 0.0f;
	}
	public SinhVien(int maSv,String hoTen,float diemLT,float diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		if (maSV > 0) {
			this.maSV = maSV;
		}
		else {
			this.maSV =1;
		}
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		if (hoTen != null && !hoTen.trim().isEmpty()) {
			this.hoTen = hoTen;
		}
		else {
			this.hoTen = "Chua cap nhat";
		}
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		if (diemLT >= 0.0f && diemLT <= 10.0f) {
			this.diemLT = diemLT;
		}
		else {
			this.diemLT = 0.0f;
		}
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		if (diemTH >= 0.0f && diemTH <= 10.0f) {
			this.diemTH = diemTH;
		}
		else {
			this.diemTH = 0.0f;
		}
	}
	public float tinhDiemTB() {
		return (this.diemLT + this.diemTH)/2;
	}
	public String toString() {
		return String.format("%-10d %-25s %-10.2f %-10.2f %-10.2f",
				maSV,hoTen,diemLT,diemTH,tinhDiemTB());
	}
}
