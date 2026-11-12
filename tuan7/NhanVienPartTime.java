package quanLiNhanSu;

import java.time.LocalDate;

class NhanVienPartTime extends NhanVien{

	private int soGioLam;
	private double luongTheoGio;
	
	public NhanVienPartTime(String maNV, String hoTen, LocalDate ngayVaoLam, double luongCoBan, LoaiNhanVien loai,
			ChucVu chucVu, PhongBan phongBan, int soGioLam, double luongTheoGio) {
		super(maNV, hoTen, ngayVaoLam, luongCoBan, loai, chucVu, phongBan);
		this.soGioLam = soGioLam;
		this.luongCoBan = luongCoBan;
	}
	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		return soGioLam * luongTheoGio;
	}

	@Override
	public String getMoTaLoai() {
		// TODO Auto-generated method stub
		return "Lam viec ban theo thoi gian, luong theo gio";
	}

}
