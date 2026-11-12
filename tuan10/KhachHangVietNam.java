package DinhHuyHoang_25641911;

import java.time.LocalDate;
import java.util.Objects;

public class KhachHangVietNam extends KhachHang{
	private String doiTuong;
	private double dinhMuc;
	public KhachHangVietNam(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia,
			String doiTuong, double dinhMuc) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKW, donGia);
		this.doiTuong = doiTuong;
		this.dinhMuc = dinhMuc;
	}
	public String getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}
	public double getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	@Override
	public double thanhTien() {
		return soKW <=dinhMuc?soKW*donGia:dinhMuc*donGia + (soKW-dinhMuc)*donGia*2.5;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dinhMuc);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHangVietNam other = (KhachHangVietNam) obj;
		return Double.doubleToLongBits(dinhMuc) == Double.doubleToLongBits(other.dinhMuc);
	}
	
}
