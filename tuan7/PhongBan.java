package quanLiNhanSu;

enum PhongBan {
	IT("Công nghệ thông tin"),
	HR("Nhân sự"),
	KE_TOAN("Kế toán"),
	MARKETING("Marketing");
	
	private final String ten;

	/**
	 * @param ten
	 */
	private PhongBan(String ten) {
		this.ten = ten;
	}

	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}
	@Override
	public String toString() {
		return ten;
	}
}
