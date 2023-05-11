package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.GiamThi;
import bean.GiamThiService;
import bean.NguyenVong;
import bean.ThiSinh;
import bean.ThiSinhService;
import data.datamanage;
import data.value;

public class main {
	
	public static void main (String[] main) {
		Scanner sc = new Scanner(System.in);
		value vt = new value();
		datamanage dt = new datamanage();
		dt.add();
		
		int luaChon;
		do {
			menu();
			System.out.println("Mời chọn");
			luaChon = sc.nextInt();
			sc.nextLine();
			switch (luaChon) {
			case 1: 
				   vt.addStudents();
				   break;
			case 2:
				   vt.addGiamThi();
				   break;
			case 3:
				   vt.updatStudents();
				   break;
			case 4:
					
					break;
			case 5: 
					vt.deleteStudent();
					break;
			case 6:
					vt.deleteGiamThi();
					break;
			case 7:
					vt.xuatThiSinh();
					break;
			case 8:
					vt.xuatThiSinhTheoSBD();
					break;
			case 9: 
					vt.xuatGiamThi();
					break;
			case 10: 
					vt.xuatThiSinhTheoSBD();
					break;					
			default:
				break;
			}
		} while(luaChon != 0);
	}
	
	public static void menu() {
			System.out.println("=================MENU================");
			System.out.println("1.Nhập thông tin thí sinh");
			System.out.println("2.Nhập thông tin giám thị");
			System.out.println("3.Nhập thông tin thí sinh cần cập nhật");
			System.out.println("4.Nhập thông tin giám thị cần cập nhật");
			System.out.println("5.Nhập số báo danh cần xóa");
			System.out.println("6.Nhập mã giám thị cần xóa");
			System.out.println("7.Xuất danh sách thí sinh");
			System.out.println("8.Xuất danh sách thí sinh theo số báo danh");
			System.out.println("9.Xuất danh sách giám thị");
			System.out.println("10.Xuất danh sách giám thị theo quê quán là TP HCM");		
			System.out.println("0.Thoát chương trình");
	}
	
}
