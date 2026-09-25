package DinhHuyHoang_25641911;

import java.time.LocalDate;

public class HangThucPham implements Comparable<HangThucPham> {
    private int id;
    private final String maHang; 
    private String tenHang;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    private float gia;

    private static int demSoLuong = 0;

    public HangThucPham() {
        this.id = ++demSoLuong;
        this.maHang = "MAC_DINH";
        this.tenHang = "Mặc định";
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = LocalDate.now().plusDays(7);
        this.gia = 1.0f;
    }

    public HangThucPham(String maHang, String tenHang,
                        LocalDate ngaySanXuat, LocalDate ngayHetHan,
                        float gia) {

        this.id = ++demSoLuong;

        if (maHang == null || maHang.trim().isEmpty())
            throw new IllegalArgumentException("Ma hang khong đuoc đe trong!");

        if (tenHang == null || tenHang.trim().isEmpty())
            throw new IllegalArgumentException("Ten hang khong đuoc đe trong!");

        if (gia <= 0)
            throw new IllegalArgumentException("Gia phai lon hon 0!");

        if (!kiemTraNgaySanXuat(ngaySanXuat))
            throw new IllegalArgumentException("Ngay SX khong đuoc la tuong lai!");

        if (kiemTraNgayHetHan(ngaySanXuat, ngayHetHan))
            throw new IllegalArgumentException("Ngay HH phai sau ngay SX!");

        this.maHang = maHang;
        this.tenHang = tenHang;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.gia = gia;
    }

   
    private boolean kiemTraNgaySanXuat(LocalDate ngaySX) {
        return ngaySX != null && !ngaySX.isAfter(LocalDate.now());
    }


    private boolean kiemTraNgayHetHan(LocalDate ngaySX, LocalDate ngayHH) {
        return ngaySX != null && ngayHH != null
                && !ngayHH.isAfter(ngaySX);
    }

    // -------- Getter --------
    public int getId() {
        return id;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public float getGia() {
        return gia;
    }

    // -------- Setter --------
    public void setTenHang(String tenHang) {
        if (tenHang == null || tenHang.trim().isEmpty())
            throw new IllegalArgumentException(
                "Tên hàng không được để trống!");

        this.tenHang = tenHang;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (!kiemTraNgaySanXuat(ngaySanXuat))
            throw new IllegalArgumentException(
                "Ngày SX không được là tương lai!");

        if (this.ngayHetHan != null
                && !ngaySanXuat.isBefore(this.ngayHetHan))
            throw new IllegalArgumentException(
                "Ngày SX phải trước ngày HH!");

        this.ngaySanXuat = ngaySanXuat;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (this.ngaySanXuat == null)
            throw new IllegalArgumentException("Chua co ngay SX!");

        if (kiemTraNgayHetHan(this.ngaySanXuat, ngayHetHan))
            throw new IllegalArgumentException(
                "Ngay HH phai sau ngay SX!");

        this.ngayHetHan = ngayHetHan;
    }

    public void setGia(float gia) {
        if (gia <= 0)
            throw new IllegalArgumentException(
                "Gia phai lon hon 0!");

        this.gia = gia;
    }

   
    public boolean kiemTraHetHan() {
        return LocalDate.now().isAfter(this.ngayHetHan);
    }

    public String trangThaiChiTiet() {
        LocalDate homNay = LocalDate.now();

        if (homNay.isBefore(ngaySanXuat))
            return "Chua san xuat";

        if (homNay.isAfter(ngayHetHan))
            return "Het han";

        if (homNay.isEqual(ngayHetHan))
            return "Het han hom nay";

        long con = ngayHetHan.toEpochDay()
                - homNay.toEpochDay();

        return "Con " + con + " ngay";
    }

   
    
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(
            "Khong the sao chep HangThucPham!");
    }

   
    public int compareTo(HangThucPham o) {
        return Integer.compare(this.id, o.id);
    }

    
    
    public String toString() {
        return String.format(
            "| %-4d | %-18s | %-12s | %-12s | %10s| %-10.0f |",
            id, maHang, tenHang, ngaySanXuat, ngayHetHan, gia);
    }
}



