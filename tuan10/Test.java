package DinhHuyHoang_25641911;

import java.time.LocalDate; import java.util.ArrayList; import java.util.Scanner;

public class Test { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		ArrayList<KhachHang> ds = new ArrayList<>();
		KhachHang vn = new KhachHangVietNam( "VN01", "Nguyen Van A", LocalDate.of(2026, 10, 1), 100, 2000, "Sinh hoat", 50 );
		KhachHang nn = new KhachHangNuocNgoai( "NN01", "John", LocalDate.of(2026, 10, 2), 80, 2500, "My" );
		KhachHang nv1 = new KhachHangNuocNgoai("NN02","Justine",LocalDate.of(2024, 07, 12),90,1300,"Anh");
		ds.add(vn);
		ds.add(nn);
		ds.add(nv1);
		for (KhachHang kh : ds) {
			System.out.println(kh);
		}
sc.close(); } }