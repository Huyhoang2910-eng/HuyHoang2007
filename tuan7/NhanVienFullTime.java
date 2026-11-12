package quanLiNhanSu;

import java.time.LocalDate;

class NhanVienFullTime extends NhanVien{

	private double heSoLuong;
	private double phuCap;
	
	public NhanVienFullTime(String maNV, String hoTen, LocalDate ngayVaoLam, double luongCoBan, LoaiNhanVien loai,
			ChucVu chucVu, PhongBan phongBan, double heSoLuong, double phuCap) {
		super(maNV, hoTen, ngayVaoLam, luongCoBan, loai, chucVu, phongBan);
		this.heSoLuong = heSoLuong;
		this.phuCap = phuCap;
	}

	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		return luongCoBan * heSoLuong * chucVu.getHeSoPhuCap() + phuCap;
	}

	@Override
	public String getMoTaLoai() {
		// TODO Auto-generated method stub
		return "Lam viec toan thoi gian, huong luong cung + phu cap";
	}

}
