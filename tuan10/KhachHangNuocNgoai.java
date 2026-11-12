package DinhHuyHoang_25641911;
import java.time.LocalDate;
import java.util.Objects;
public class KhachHangNuocNgoai extends KhachHang {
	private String quocTich;

	public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia,
			String quocTich) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKW, donGia);
		this.quocTich = quocTich;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	@Override 
	public double thanhTien() {
		return soKW * donGia;
	}
}
