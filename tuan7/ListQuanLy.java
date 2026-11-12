package quanLiNhanSu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

class ListQuanLy implements IQuanLy<NhanVien> {
	private List<NhanVien> danhSach = new ArrayList<>();
	
	//-------CRUD-------
	@Override
	public void them(NhanVien nv) {
		// TODO Auto-generated method stub
		if(timTheoMa(nv.getMaNV()) != null) {
			System.out.println("Ma da ton tai");
			return;
			
		}
		danhSach.add(nv);
		
	}
	//------HAM PHU TRO PRIVATE: TIM MA 
	private NhanVien timTheoMa(String ma) {
		return danhSach.stream().filter(nv->nv.getMaNV().equalsIgnoreCase(ma)).findFirst().orElse(null);
	}

	@Override
	public boolean xoa(String ma) {
		// TODO Auto-generated method stub
		return danhSach.removeIf(nv-> nv.getMaNV().equalsIgnoreCase(ma));
	}

	@Override
	public boolean sua(String ma, NhanVien nvMoi) {
	    if (nvMoi == null) return false;   // ← kiểm tra null
	    for(int i = 0; i < danhSach.size(); i++) {
	        if(danhSach.get(i).getMaNV().equalsIgnoreCase(ma)) {
	            danhSach.set(i, nvMoi);
	            return true;
	        }
	    }
	    return false;
	}
	//--------TIM KIEM--------
	@Override
	public List<NhanVien> timKiemTheoTen(String ten) {
		// TODO Auto-generated method stub
		String keyword = ten.toLowerCase();
		return danhSach.stream().filter(nv-> nv.getHoTen().toLowerCase().contains(keyword)).collect(Collectors.toList());
		
	}
	
	@Override
	public List<NhanVien> timKiemTheoMa(String frefix) {
		// TODO Auto-generated method stub
		return danhSach.stream().filter(nv -> nv.getMaNV().toLowerCase().startsWith(frefix.toLowerCase())).
				collect(Collectors.toList());
	}

	@Override
	public List<NhanVien> sapXepTheoLuong() {
		// TODO Auto-generated method stub
		return danhSach.stream().sorted(Comparator.comparingDouble(NhanVien::tinhLuong)).
				collect(Collectors.toList());
		
	}

	@Override
	public List<NhanVien> sapXepTheoTen() {
		// TODO Auto-generated method stub
		return danhSach.stream().sorted(Comparator.comparing(NhanVien::getHoTen)).collect(Collectors.toList());
	}
	//THONG KE THEO NHOM MAP<> API
	@Override
	public Map<String, Double> thongKeLuongTheoLoai() {
		// TODO Auto-generated method stub
		return danhSach.stream().collect(Collectors.groupingBy(nv-> nv.getLoai().getMa(),
				Collectors.summingDouble(NhanVien::tinhLuong)));
	}

	@Override
	public Map<String, List<NhanVien>> groupByLoai() {
		// TODO Auto-generated method stub
		return danhSach.stream().collect(Collectors.groupingBy(nv-> nv.getLoai().getMa())); 	
	}

	@Override
	public Map<String, List<NhanVien>> groupByPhongBan() {
		// TODO Auto-generated method stub
		return danhSach.stream().collect(Collectors.groupingBy(nv -> nv.getPhongBan().getTen()));
	}
	//LOC THEO DIEU KIEN
	@Override
	public List<NhanVien> locLuongTren(double mucLuong) {
		// TODO Auto-generated method stub
		return danhSach.stream().filter(nv->nv.tinhLuong() > mucLuong).collect(Collectors.toList());
	}
	

	@Override
	public List<NhanVien> timTheoChucVu(ChucVu chucVu) {
		// TODO Auto-generated method stub
		return danhSach.stream().filter(nv->nv.getChucVu() == chucVu).collect(Collectors.toList());
	}
	public List<NhanVien> getDanhSach(){
	    return new ArrayList<>(danhSach);   // trả bản sao
	}
}
