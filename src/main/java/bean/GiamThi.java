package bean;

public class GiamThi {
	private String maGiamThi;
	private String donViCongTac;
	private String hoTen;
	private int gioiTinh;
	private int namSinh;
	private String queQuan;
	
	public GiamThi() {
		super();
	}

	public GiamThi(String maGiamThi, String donViCongTac, String hoTen, int gioiTinh, int namSinh, String queQuan) {
		super();
		this.maGiamThi = maGiamThi;
		this.donViCongTac = donViCongTac;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
		this.queQuan = queQuan;
	}

	public String getMaGiamThi() {
		return maGiamThi;
	}

	public void setMaGiamThi(String maGiamThi) {
		this.maGiamThi = maGiamThi;
	}

	public String getDonViCongTac() {
		return donViCongTac;
	}

	public void setDonViCongTac(String donViCongTac) {
		this.donViCongTac = donViCongTac;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	@Override
	public String toString() {
		return "GiamThi [maGiamThi=" + maGiamThi + ", donViCongTac=" + donViCongTac + ", hoTen=" + hoTen + ", gioiTinh="
				+ gioiTinh + ", namSinh=" + namSinh + ", queQuan=" + queQuan + "]";
	}
}
