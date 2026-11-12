package quanLiNhanSu;

enum LoaiNhanVien {
	FULL_TIME("FullTime", "Toàn thời gian"),
	PART_TIME("PartTime","Bán thời gian");
	private final String ma;
	private final String moTa;
	/**
	 * @param ma
	 * @param moTa
	 */
	private LoaiNhanVien(String ma, String moTa) {
		this.ma = ma;
		this.moTa = moTa;
	}
	/**
	 * @return the ma
	 */
	public String getMa() {
		return ma;
	}
	/**
	 * @return the moTa
	 */
	public String getMoTa() {
		return moTa;
	}
	@Override
	public String toString() {
		return moTa;
	}
	
}
