package quanLiNhanSu;

import java.util.List;
import java.util.Map;
interface IQuanLy<T> {
	//----CRUD CO BAN-----
	void them(T t);
	boolean xoa(String ma);
	boolean sua(String ma, T tMoi);
	//----TIM KIEM-------
	List<T> timKiemTheoTen(String ten);
	List<T> timKiemTheoMa(String frefix);
	
	//----SAP XEP--------
	List<T> sapXepTheoLuong();
	List<T> sapXepTheoTen();
	
	//-----MAP(API) THONG KE & NHOM-------
	Map<String, Double> thongKeLuongTheoLoai();
	Map<String, List<T>> groupByLoai();
	Map<String, List<T>> groupByPhongBan();
	
	List<T> locLuongTren(double mucLuong);
	List<T> timTheoChucVu(ChucVu chucVu);
	
	
}
