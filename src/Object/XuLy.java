package Object;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		// SinhVien sv = new SinhVien();
		Scanner scan = new Scanner(System.in);
//		sv.nhap(scan);
//		sv.tinhDTB();
//		sv.xepLoai();
//		sv.xuat();
		DanhSachSinhVien ds = new DanhSachSinhVien();
		doMenu(ds);

	}

	private static void inMenu() {
		System.out.println("Vui long thuc hien: ");
		System.out.println("1. Them Sinh Vien");
		System.out.println("2. Xuat danh sach Sinh Vien");
		System.out.println("0. Thoat");
	}

	private static void doMenu(DanhSachSinhVien ds) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			System.out.print("Vui long chon: ");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(scan);
				ds.themSinhVien(sv);
				break;
			case 2:
				ds.tinhDTB();
				ds.xepLoai();
				ds.xuat();
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}

}
