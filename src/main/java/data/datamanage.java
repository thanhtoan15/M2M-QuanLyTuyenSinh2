package data;

import java.util.ArrayList;
import java.util.List;

import bean.GiamThi;
import bean.GiamThiService;
import bean.NguyenVong;
import bean.ThiSinh;
import bean.ThiSinhService;

public class datamanage {
	ThiSinhService danhSachThiSinh = new ThiSinhService();
	GiamThiService danhSachGiamthi = new GiamThiService();
	List<ThiSinhService> danhSachTrungTuyen = new ArrayList<ThiSinhService>();

	public void add() {
		GiamThi giamThi1 = new GiamThi("TA01", "Đại Học NTT10", "Trương Thanh Toàn", 0, 1995, "TP HCM");
		GiamThi giamThi2 = new GiamThi("TA02", "Đại Học FPT", "Lương Vũ Hảo", 1, 1997, "TP Đà Nẳng");
		GiamThi giamThi3 = new GiamThi("TA03", "Đại Học UEH", "Trương Thi Cẩm Tú", 1, 1990, "TP Cần Thơ");
		GiamThi giamThi4 = new GiamThi("TA04", "Đại Học UFN", "Phan Quốc Thái", 0, 1989, "TP HCM");
		GiamThi giamThi5 = new GiamThi("TA05", "Đại Học UEE", "Nguyễn Thái Học", 1, 1992, "TP Biên Hòa");

		danhSachGiamthi.add(giamThi1);
		danhSachGiamthi.add(giamThi2);
		danhSachGiamthi.add(giamThi3);
		danhSachGiamthi.add(giamThi4);
		danhSachGiamthi.add(giamThi5);

		NguyenVong nguyenVong1 = new NguyenVong("HA", "QHQT", "FPT", "A", 12.5);
		NguyenVong nguyenVong2 = new NguyenVong("HU", "KDQT", "NTT", "B", 16.5);
		NguyenVong nguyenVong3 = new NguyenVong("HF", "GDTC", "FPT", "A", 17.5);
		NguyenVong nguyenVong4 = new NguyenVong("EF", "TA", "UEH", "B", 14.5);
		NguyenVong nguyenVong5 = new NguyenVong("RA", "CNTT", "UFR", "A", 12.5);

		ThiSinh thiSinh1 = new ThiSinh("PS21", "Nguyễn Văn A", 1, 2005, "Bến Tre", 15.4, 1.2, nguyenVong1);
		ThiSinh thiSinh2 = new ThiSinh("PS22", "Nguyễn Văn B", 0, 2005, "Bình Định", 15.4, 1.2, nguyenVong2);
		ThiSinh thiSinh3 = new ThiSinh("PS23", "Nguyễn Văn C", 1, 2005, "Gia Lai", 15.4, 1.2, nguyenVong3);
		ThiSinh thiSinh4 = new ThiSinh("PS24", "Nguyễn Văn D", 0, 2005, "Vĩnh Long", 15.4, 1.2, nguyenVong4);
		ThiSinh thiSinh5 = new ThiSinh("PS25", "Nguyễn Văn E", 1, 2005, "Cần Thơ", 15.4, 1.2, nguyenVong5);

		danhSachThiSinh.add(thiSinh5);
		danhSachThiSinh.add(thiSinh4);
		danhSachThiSinh.add(thiSinh3);
		danhSachThiSinh.add(thiSinh2);
		danhSachThiSinh.add(thiSinh1);
	}
}
