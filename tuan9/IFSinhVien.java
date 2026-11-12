package DinhHuyHoang_25641911;

import java.util.List;

public interface IFSinhVien {
	boolean them(SinhVien sv);
	boolean sua(String maSv, SinhVien svMoi);
	boolean xoa(String maSV);
	boolean xoaTatCa();
	
	List<SinhVien> layTatCa();
	SinhVien timTheoMa(String maSV);
	List<SinhVien> timTheoTen(String tuKhoa);
	List<SinhVien> timTheoLop(String lop);
	List<SinhVien> timTheoLoai(String loai);
	List<SinhVien> timTheoMon(MonHoc monhoc);
	
	
	int tongSoLuong();
	double tongThanhTien();
	
	List<SinhVien> sapXepTheoTen();
	List<SinhVien> sapXeptheoThanhTienGiamDan();
	
}
