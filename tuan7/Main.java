package quanLiNhanSu;
import java.time.LocalDate;
import java.util.*;
public class Main {
	//STATIC DUNG CHUNG CHO TOAN CHUONG TRINH 
	static Scanner sc = new Scanner(System.in);
	static ListQuanLy ql = new ListQuanLy();
	public static void main(String[] args) {
		while(true) {
			hienThiMenu();
			System.out.println("Chon: ");
			int chon  = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1: chucNangThem();	break;
			case 2: chucNangXoa();	break;
			case 3:	chucNangSua();	break;
			case 4: chucNangTimTheoTen();	break;
			case 5:	chucNangTimTheoMa();	break;
			case 6: hienThi(ql.sapXepTheoLuong());	break;
			case 7: hienThi(ql.sapXepTheoTen());	break;
			case 8: chucNangThongKeLuong();	break;
			case 9: chucNangNhomTheoLoai();	break;
			case 10: chucNangNhomTheoPhongBan();	break;
			case 11: chucNangTimTheoChucVu(); 		break;
			case 12: chucNangLocLuong(); 		break;
			case 13: hienThi(ql.getDanhSach());		break;
			case 0:
				System.out.println("Tam biet !!!");
				return;
			default:
				System.out.println("Lua chon khong hop le!!!");
		}
			
	}
}
	static void hienThiMenu() {
		System.out.println("\n======MENU QUAN LI NHAN SU=====\n");
		System.out.println("1. Them nhan vien");
		System.out.println("2. Xoa theo ma");
		System.out.println("3. Sua theo ma");
		System.out.println("4. Tim theo ten");
		System.out.println("5. Tim theo ma (Tien to)");
		System.out.println("6. Sap xep theo luong");
		System.out.println("7. Sap xep theo ten");
		System.out.println("8. Tong ke luong theo loai");
		System.out.println("9. Nhom theo loai");
		System.out.println("10. Nhom theo phong ban");
		System.out.println("11. Tim theo chuc vu");
		System.out.println("12. Loc luong tren muc X");
		System.out.println("13. Xuat tat ca");
		System.out.println("0. Thoat");
	}
	//CAC HAM XU LI CHUC NANG
	static void chucNangThem() {
		NhanVien nv = nhapNV();
		ql.them(nv);
		System.out.println("Da them!!!");;
	}
	static void chucNangXoa() {
		System.out.println("Nhap ma can xoa: ");
		String ma = sc.nextLine();
		boolean ok = ql.xoa(ma);
		System.out.println(ok ? "Da xoa!! " : "Khong tim thay!!");
	}
	static void chucNangSua() {
		System.out.println("Nhap ma can sua: ");
		String ma = sc.nextLine();
		System.out.println("Nhap thong tin moi: ");
			NhanVien nvMoi = nhapNV();
			boolean ok = ql.sua(ma, nvMoi);
			System.out.println(ok ? "Da sua !!" : " Khong tim thay !!!");
			
	}
	static void chucNangTimTheoTen() {
		System.out.println("Nhap ten can tim: ");
		hienThi(ql.timKiemTheoTen(sc.nextLine()));
	}
	static void chucNangTimTheoMa() {
		System.out.println("Nhap tien to ma: ");
		hienThi(ql.timKiemTheoMa(sc.nextLine()));
	}

	
	static void chucNangThongKeLuong() {
		System.out.println("-----Thong ke luong theo loai----");
		ql.thongKeLuongTheoLoai().forEach((k, v)-> System.out.printf("%-12s : %.2f VND%n", k, v));
	}
	static void chucNangNhomTheoLoai() {
		System.out.println("-----Nhom Theo Loai-----");
		ql.groupByLoai().forEach((k, v)-> {
			System.out.println("Loai: " + k);
			v.forEach(nv -> System.out.println(" " + nv));
		});
	}	
	static void chucNangNhomTheoPhongBan() {
		System.out.println("------Nhom theo phong ban-------");
		ql.groupByPhongBan().forEach((k, v)-> {
			System.out.println("Phong: " + k);
			v.forEach(nv-> System.out.println(" " + nv));
		});
	}
	static void chucNangTimTheoChucVu() {
		System.out.println("-----Chon chuc vu------");
		ChucVu[] chucVus = ChucVu.values();
		for(int i=0;i<chucVus.length;i++) {
			System.out.println((i+1) + ". " + chucVus[i]);
		}
		System.out.println("Chon: ");
		int chon = Integer.parseInt(sc.nextLine());
		if(chon>=1 && chon<= chucVus.length) {
			hienThi(ql.timTheoChucVu(chucVus[chon - 1]));
		}
	}
	static void chucNangLocLuong() {
		System.out.println("Nhap muc luong: ");
		double muc = Double.parseDouble(sc.nextLine());
		hienThi(ql.locLuongTren(muc));
	}
	// HAM NHAP NHAN VIEN (CO ENUM)
	static NhanVien nhapNV() {
		System.out.println("Nhap ma NV");
		String ma = sc.nextLine();
		System.out.println("Nhap ho ten");
		String ten = sc.nextLine();
		System.out.println("Nhap ngay lam(yyyy-MM-dd): ");
		LocalDate ngay = LocalDate.parse(sc.nextLine());
		System.out.println("Luong co ban: ");
		double lcb = Double.parseDouble(sc.nextLine());
		//----chon----
		System.out.println("-------Chon loai nhan vien------ ");
		LoaiNhanVien[] loais = LoaiNhanVien.values();
		for(int i=0;i<loais.length;i++) {
			System.out.println((i+1) + " " + loais[i].getMoTa());
		}
		System.out.println("Chon: ");
		LoaiNhanVien loai = loais[Integer.parseInt(sc.nextLine())-1];
		System.out.println("------Chon chuc vu-------");
		ChucVu[] chucVus = ChucVu.values();
		for(int i =0;i<chucVus.length;i++) {
			System.out.println((i+1) + ". " + chucVus[i]);
		}
		System.out.println("Chon: ");
		ChucVu chucVu = chucVus[Integer.parseInt(sc.nextLine())-1];
		//------chon phong ban-------
		System.out.println("-----Chon phong ban-----");
		PhongBan[] phongBans = PhongBan.values();
		for(int i=0;i<phongBans.length;i++) {
			System.out.println((i+1) + ". " + phongBans[i]);
		}
		System.out.println("Chon: ");
		PhongBan phongBan = phongBans[Integer.parseInt(sc.nextLine())-1];
		
		if(loai == LoaiNhanVien.FULL_TIME) {
			System.out.println("He so luong");
			double hs = Double.parseDouble(sc.nextLine());
			System.out.println("Phu cap ");
			double pc = Double.parseDouble(sc.nextLine());
			return new NhanVienFullTime(ma, ten, ngay, lcb, loai, chucVu, phongBan, hs, pc);
		}
		else {
			System.out.println("So gio lam ");
			int gio = Integer.parseInt(sc.nextLine());
			System.out.println("Luong theo gio: ");
			double lg = Double.parseDouble(sc.nextLine());
			return new NhanVienPartTime(ma, ten, ngay, lcb, loai, chucVu, phongBan, gio, lg);
		}
	}
	static void hienThi(List<NhanVien> list) {
		if(list.isEmpty()) {
			System.out.println("Danh sach rong !!!!");
		}
		else {
			list.forEach(System.out::println);
		}
	}
}

