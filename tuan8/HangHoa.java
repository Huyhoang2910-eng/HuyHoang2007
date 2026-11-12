package DinhHuyHoang_25641911;
import java.time.LocalDate ;
public class HangHoa {
	private String maHang;
	private String tenHang;
	private String hangSX;
	private double giaBan;
	private float soLuongTon;
	private LocalDate ngayNhapHang;
	public HangHoa(String maHang, String tenHang, String hangSX, double giaBan, float soLuongTon,
			LocalDate ngayNhapHang) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.hangSX = hangSX;
		this.giaBan = giaBan;
		this.soLuongTon = soLuongTon;
		this.ngayNhapHang = ngayNhapHang;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		if (maHang == null || maHang.isEmpty()) {
			throw new IllegalArgumentException("Ma hang khong duoc rong!");
		}
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if (tenHang == null || tenHang.isEmpty()) {
			throw new IllegalArgumentException("Ten hang khong duoc rong!");
		}
		this.tenHang = tenHang;
	}
	public String getHangSX() {
		return hangSX;
	}
	public void setHangSX(String hangSX) {
		if (hangSX == null || hangSX.isEmpty()) {
			throw new IllegalArgumentException("Hang san xuat khong duoc rong!");
		}
		this.hangSX = hangSX;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		if (giaBan<=0) {
			throw new IllegalArgumentException("Gia ban phai lon hon 0!");
		}
		this.giaBan = giaBan;
	}
	public float getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(float soLuongTon) {
		if(soLuongTon <0) {
			throw new IllegalArgumentException("So luong ton phai lon hon 0!");
		}
		this.soLuongTon = soLuongTon;
	}
	public LocalDate getNgayNhapHang() {
		return ngayNhapHang;
	}
	public void setNgayNhapHang(LocalDate ngayNhapHang) {
		if(ngayNhapHang.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Ngay Nhap Hang phai truoc hoac bang ngay hien tai!");
		}
		this.ngayNhapHang = ngayNhapHang;
	}
	public double tinhTongGiaTri() {
		double total = giaBan*soLuongTon;
		return total;
	}
	@Override
	public String toString() {
		return String.format("| %-10s|%-20s|%-20s|%.2f|%s|%.2f|",this.maHang,this.tenHang,this.hangSX,this.giaBan,this.soLuongTon,this.ngayNhapHang);
	}
}
