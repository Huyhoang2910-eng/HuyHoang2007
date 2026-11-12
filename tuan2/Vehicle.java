import java.util.Scanner;

public class Vehicle {
    private String chuXe;
    private String loaiXe;
    private double giatriXe;
    private int dungtichXylanh;

    public Vehicle() {
        this.chuXe = "";
        this.loaiXe = "";
        this.giatriXe = 0.0;
        this.dungtichXylanh = 0;
    }

    public Vehicle(String chuXe, String loaiXe, double giatriXe, int dungtichXylanh) {
        this.chuXe = chuXe;
        this.loaiXe = loaiXe;
        this.giatriXe = giatriXe;
        this.dungtichXylanh = dungtichXylanh;
    }

    public String getChuXe() {
        return chuXe; 
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public double getGiaTriXe() {
        return giatriXe;
    }

    public void setGiaTriXe(double giatriXe) {
        this.giatriXe = giatriXe;
    }

    public double getDungTichXyLanh() {
        return dungtichXylanh;
    }

    public void setDungTichXyLanh(int dungtichXylanh) {
        if (dungtichXylanh >= 0) {
            this.dungtichXylanh = dungtichXylanh;
        } else {
            this.dungtichXylanh = 0;
        }
    }

    public double tinhTienThue() {
        if (dungtichXylanh < 100) {
            return giatriXe * 0.01;
        } else if (dungtichXylanh >= 100 && dungtichXylanh <= 200) {
            return giatriXe * 0.03;
        } else {
            return giatriXe * 0.05;
        }
    }

    public void nhapXe() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten chu xe: ");
        this.chuXe = sc.nextLine();
        
        System.out.print("Nhap loai xe: ");
        this.loaiXe = sc.nextLine();

        do {
            System.out.print("Nhap gia tri xe (x >= 0): ");
            this.giatriXe = sc.nextDouble();
            if (giatriXe < 0) System.out.println("Nhap gia tri sai!");
        } while (giatriXe < 0);

        do {
            System.out.print("Nhap dung tich xylanh (x >= 0): ");
            this.dungtichXylanh = sc.nextInt();
            if (dungtichXylanh < 0) System.out.println("Nhap dung tich sai!");
        } while (dungtichXylanh < 0);
    }

    public void xuatXe() {
        System.out.printf("%-25s %-15s %-15.2f %-15d %-15.2f\n", chuXe, loaiXe, giatriXe, dungtichXylanh, tinhTienThue());
    }
}