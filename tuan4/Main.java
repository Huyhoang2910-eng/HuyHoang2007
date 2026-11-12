package BaiTH_2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(2564,"Dinh Huy Hoang",8.0f,7.5f);
		SinhVien sv2 = new SinhVien(2565,"To Huu Duc",7.0f,7.5f);
		SinhVien sv3 = new SinhVien();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so cua SV thu 3 :");
		int ma = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten SV thu 3 :");
		String ten = sc.nextLine();
		System.out.println("Nhap diem LT SV thu 3 :");
		float lt = sc.nextFloat();
		System.out.println("Nhap diemTH SV thu 3 :");
		float th = sc.nextFloat();
		sv3.setMaSV(ma);
		sv3.setHoTen(ten);
		sv3.setDiemLT(lt);
		sv3.setDiemTH(th);
		System.out.println(String.format("%-10s %-25s %6s %10s %10s",
				"maSV","hoTen","diemLT","diemTH","diemTB"));
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}

}
