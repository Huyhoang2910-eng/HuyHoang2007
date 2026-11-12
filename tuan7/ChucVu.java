package quanLiNhanSu;

enum ChucVu {
	NHAN_VIEN("Nhân viên", 1.0),
	TRUONG_PHONG("Trưởng phòng", 1.5),
	GIAM_DOC("Giám đốc", 2.5);
	private final String ten;
	private final double heSoPhuCap;
	/**
	 * @param ten
	 * @param heSoPhuCap
	 */
	private ChucVu(String ten, double heSoPhuCap) {
		this.ten = ten;
		this.heSoPhuCap = heSoPhuCap;
	}
	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}
	/**
	 * @return the heSoPhuCap
	 */
	public double getHeSoPhuCap() {
		return heSoPhuCap;
	}
	@Override 
	public String toString() {
		return ten;
	}
	
}
