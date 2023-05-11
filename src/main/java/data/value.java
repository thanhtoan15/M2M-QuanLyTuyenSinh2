package data;

import java.util.Scanner;

import bean.GiamThi;
import bean.ThiSinh;

public class value {
	datamanage dt = new datamanage();
	Scanner sc = new Scanner(System.in);
	
	public void addStudents() {
		  ThiSinh nhapthisinh = new ThiSinh();
		   System.out.println("Nhập số báo danh: ");
		   nhapthisinh.setSoBaoDanh(sc.nextLine());
		   System.out.println("Nhập họ tên: ");
		   nhapthisinh.setHoTen(sc.nextLine());
		   System.out.println("Nhập giới tính: ");
		   nhapthisinh.setGioiTinh(sc.nextInt());
		   System.out.println("Nhập năm sinh: ");
		   nhapthisinh.setNamSinh(sc.nextInt());
		   System.out.println("Nhập quê quán: ");
		   nhapthisinh.setQueQuan(sc.nextLine());
		   sc.nextLine();
		   System.out.println("Nhập điểm thi: ");
		   nhapthisinh.setDiemThi(sc.nextDouble());
		   dt.danhSachThiSinh.add(nhapthisinh);
	}
	
	public void addGiamThi() {
		GiamThi nhapGiamThi = new GiamThi();
		   System.out.println("Nhập mã giám thị: ");
		   nhapGiamThi.setMaGiamThi(sc.nextLine());
		   System.out.println("Nhập đơn vị công tác: ");
		   nhapGiamThi.setDonViCongTac(sc.nextLine());
		   System.out.println("Nhập họ tên: ");
		   nhapGiamThi.setHoTen(sc.nextLine());
		   System.out.println("Nhập giới tính: ");
		   nhapGiamThi.setGioiTinh(sc.nextInt());
		   System.out.println("Nhập năm sinh: ");
		   nhapGiamThi.setNamSinh(sc.nextInt());
		   System.out.println("Nhập quê quán: ");
		   nhapGiamThi.setQueQuan(sc.nextLine());
		   dt.danhSachGiamthi.add(nhapGiamThi);
	}
	
	public void updatStudents() {
		ThiSinh capNhapThiSinh = new ThiSinh() ;
		   System.out.println("Nhập số báo danh thí sinh muốn cập nhật: ");
		   capNhapThiSinh.setSoBaoDanh(sc.nextLine());
		   System.out.println("Nhập họ tên thí sinh: ");
		   capNhapThiSinh.setHoTen(sc.nextLine());
		   System.out.println("Nhập giới tính thí sinh: ");
		   capNhapThiSinh.setGioiTinh(sc.nextInt());
		   System.out.println("Nhập năm sinh thí sinh: ");
		   capNhapThiSinh.setNamSinh(sc.nextInt());
		   System.out.println("Nhập quê quán thí sinh: ");
		   capNhapThiSinh.setQueQuan(sc.nextLine());
		   System.out.println("Nhập điểm thi thí sinh: ");
		   capNhapThiSinh.setDiemThi(sc.nextDouble());
		   System.out.println("Nhập điểm ưu tiên thí sinh: ");
		   capNhapThiSinh.setDiemUuTien(sc.nextDouble());
		   dt.danhSachThiSinh.capNhatThiSinh(capNhapThiSinh);
	}
	
	public void updateGiamThi() {
		GiamThi capNhatGiamThi = new GiamThi();
		System.out.println("Nhập mã giám thị: ");
		capNhatGiamThi.setMaGiamThi(sc.nextLine());
		System.out.println("Nhập đơn vị công tác: ");
		capNhatGiamThi.setDonViCongTac(sc.nextLine());
		System.out.println("Nhập họ tên: ");
		capNhatGiamThi.setHoTen(sc.nextLine());
		System.out.println("Nhập giới tinh: ");
		capNhatGiamThi.setGioiTinh(sc.nextInt());
		System.out.println("Nhập năm sinh: ");
		capNhatGiamThi.setNamSinh(sc.nextInt());
		System.out.println("Nhập quê quán: ");
		capNhatGiamThi.setQueQuan(sc.nextLine());
		dt.danhSachGiamthi.capNhatGiamThi(capNhatGiamThi);
	}
	
	public void deleteStudent() {
		System.out.println("Nhập số báo danh thí sinh muốn xóa: ");
		String soBaoDanhMuonXoa = sc.nextLine();
		dt.danhSachThiSinh.xoaThiSinh(soBaoDanhMuonXoa);
	}
	
	public void deleteGiamThi() {
		System.out.println("Nhập mã giám thị muốn xóa: ");
		String maGiamThiMuonXoa = sc.nextLine();
		dt.danhSachGiamthi.xoaGiamThi(maGiamThiMuonXoa);
	}
	
	public void xuatThiSinh() {
		System.out.println("Danh sách thí sinh");
		dt.danhSachThiSinh.xuatDanhSachThiSinh();
	}
	
	public void xuatThiSinhTheoSBD() {
		System.out.println("Nhập số báo danh thí sinh muốn tìm");
		String soBaoDanh = sc.nextLine();
		dt.danhSachThiSinh.xuatThiSinhTheoSoBaoDanh(soBaoDanh);
	}
	
	public void xuatGiamThi() {
		System.out.println("Danh sách giám thị");
		dt.danhSachGiamthi.xuatdanhsachgiamthi();
	}
	
	public void xuatGiamThiTheoQue() {
		System.out.println("Danh sách giám thị có quê quán là TP HCM");
		dt.danhSachGiamthi.xuatdanhsachgiamthitheoquequan("TP HCM");
	}
}
