package DinhHuyHoang_25641911;

import java.time.LocalDate;

public class QuanLyHangHoa {
	private HangHoa[] ds;
	private int count;
	public QuanLyHangHoa(int capacity) {
		ds = new HangHoa[capacity];
		count = 0;
	}
	private int indexOf(String maHang) {
		for(int i=0;i<count;i++) {
			if(ds[i].getMaHang().equals(maHang)) {
				return i;
			}
		}
		return -1;
	}
	public boolean themHangHoa(HangHoa s) {
		if(indexOf(s.getMaHang())==-1) {
			return false;
		}
		if(count==ds.length) {
			HangHoa[] newDS = new HangHoa[ds.length*2];
			for(int i=0;i<count;i++) {
				newDS[i] = ds[i];
			}
			ds = newDS;
		}
		ds[count++]=s;
		return true;
	}
	public boolean xoaHangHoa(String maHang) {
		int pos = indexOf(maHang);
		if(pos==-1) {
			return false;
		}
		if(pos==-1) {
			return false;
		}
		for(int i = pos;i<count-1;i++) {
			ds[i] = ds[i+1];
		}
		ds[--count] = null;
		return true;
	}
	public boolean suaGiaBan(String maHang,double giaMoi) {
		int pos = indexOf(maHang);
		if(pos==-1) {
			return false ;
		}
		ds[pos].setGiaBan(giaMoi);
		return true;
	}
	public void xuatTatCa(LocalDate ngay) {
		int k = 0;
		for (int i=0;i<count;i++) {
			if(ds[i].getNgayNhapHang()==ngay) {
				k=1;
				System.out.println(ds[i].toString());
			}
		}
		if(k==0) {
			System.out.println("Khong co mat hang nao trong ngay: "+ngay);
		}
	}
	public void xuatHangHoaTonKhoCaoNhat() {
		float max = 0 ;
		for (int i=0;i<count;i++) {
			if(ds[i].getSoLuongTon()>max) {
				max = ds[i].getSoLuongTon();
			}
		}
		for(int i=0;i<count;i++) {
			if(ds[i].getSoLuongTon()==max) {
				System.out.println(ds[i].toString());
			}
		}
	}
}
