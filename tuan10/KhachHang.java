package DinhHuyHoang_25641911;
import java.time.LocalDate;
import java.util.Objects;
public abstract class KhachHang {
	protected String maKhachHang;
	protected String hoTen;
	protected LocalDate ngayLapHoaDon;
	protected double soKW;
	protected double donGia;
	public KhachHang(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia) {
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.soKW = soKW;
		this.donGia = donGia;
	}
	public abstract double thanhTien();
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public String getHoTen() {
		return hoTen;
	}
	public LocalDate getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	@Override
	public String toString() {
		return String.format("%-10s | %-20s | Ngay: %s | TT: %,.0f",
				maKhachHang,hoTen,ngayLapHoaDon, thanhTien());
	}
	@Override
	public int hashCode() {
		return Objects.hash(maKhachHang);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(this.maKhachHang, other.maKhachHang);
	}
}
