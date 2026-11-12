public class Main {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle("Dinh Huy Hoang", "HonDa", 40000000, 100);
        Vehicle xe2 = new Vehicle("Nguyen Tien Dung", "VF5", 5000000, 10);
        Vehicle xe3 = new Vehicle();
        
        System.out.println("Nhap thong tin xe cua ban:");
        xe3.nhapXe();
        
        System.out.println("\n=========================================================================================");
        System.out.printf("%-25s %-15s %-15s %-15s %-15s\n", "Ten chu xe", "Loai xe", "Tri gia", "Dung tich", "Thue");
        System.out.println("=========================================================================================");
        xe1.xuatXe();
        xe2.xuatXe();
        xe3.xuatXe();
    }
}