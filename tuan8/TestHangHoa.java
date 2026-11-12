package DinhHuyHoang_25641911;
import java.time.LocalDate;
public class TestHangHoa {
	public static void main(String[] args) {
		QuanLyHangHoa manager = new QuanLyHangHoa(5);
		manager.themHangHoa(new HangHoa("ms01","tivi","LG",12000000,2,LocalDate.of(2024,1,1)));
		manager.themHangHoa(new HangHoa("ms02","tu lanh","panasonic",9000000,3,LocalDate.of(2025,7,9)));
		manager.themHangHoa(new HangHoa("ms03","dien thoai","xiaomi",2000000,10,LocalDate.of(2023,5,5)));
		manager.themHangHoa(new HangHoa("ms04","noi com dien","cookcu",1000000,4,LocalDate.of(2024,7,6)));
		manager.themHangHoa(new HangHoa("ms05","bep gas","huyhoang",50000,12,LocalDate.of(2007,7,8)));
		System.out.println(manager.toString());
		manager.xoaHangHoa("ms01");
		manager.suaGiaBan("ms02", 7000);
		manager.xuatTatCa(LocalDate.of(2007,7,8));
		manager.xuatHangHoaTonKhoCaoNhat();
	}
}
