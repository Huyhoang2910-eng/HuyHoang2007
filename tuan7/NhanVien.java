package quanLiNhanSu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class NhanVien {
	protected String maNV;
	protected String hoTen;
	protected LocalDate ngayVaoLam;
	protected double luongCoBan;
	protected LoaiNhanVien loai;
	protected ChucVu chucVu;
	protected PhongBan phongBan;
	/**
	 * @param maNV
	 * @param hoTen
	 * @param ngayVaoLam
	 * @param luongCoBan
	 * @param loai
	 * @param chucVu
	 * @param phongBan
	 */
	public NhanVien(String maNV, String hoTen, LocalDate ngayVaoLam, double luongCoBan, LoaiNhanVien loai,
			ChucVu chucVu, PhongBan phongBan) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.ngayVaoLam = ngayVaoLam;
		this.luongCoBan = luongCoBan;
		this.loai = loai;
		this.chucVu = chucVu;
		this.phongBan = phongBan;
	}
	//--PHUONG THUC TRUU TUONG 
	//--lop con BAT BUOC phai override 2 phuong thuc nay
	public abstract double tinhLuong();
	public abstract String getMoTaLoai();

	public String getMaNV() {
		return maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public LocalDate getNgayVaoLam() {
		return ngayVaoLam;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public LoaiNhanVien getLoai() {
		return loai;
	}

	public ChucVu getChucVu() {
		return chucVu;
	}

	public PhongBan getPhongBan() {
		return phongBan;
	}
	//-------SETTER(Chi cho nhung gi co the sua)
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan =  luongCoBan;
	}
	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-8s | %-20s | %-12s | %-12s | %-15s | %.2f VND", maNV, hoTen, loai, chucVu,
				phongBan, tinhLuong());
		
	}
	
}
