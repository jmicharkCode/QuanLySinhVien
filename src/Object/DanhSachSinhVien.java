package Object;

import java.util.ArrayList;
import java.util.Scanner;

// Muc dich : tao ra de quan ly danh sach nhieu sinh vien

public class DanhSachSinhVien {

	// Attributes/ Fields
	private ArrayList<SinhVien> listSV;

	// Get,set methods
	public ArrayList<SinhVien> getListSV() {
		return listSV;
	}

	public void setListSV(ArrayList<SinhVien> listSV) {
		this.listSV = listSV;
	}

	// Constructor methods
	public DanhSachSinhVien() {
		thietLapDefault();
	}

	// HAm nay dung de khoi dong cac list va cac gia tri mac dinh cho list
	private void thietLapDefault() {
		this.listSV = new ArrayList<SinhVien>();
	}

	// Input, output methods
	public void nhap(Scanner scan) {
		for (SinhVien sv : this.listSV) {
			sv.nhap(scan);
		}
	}

	public void xuat() {
		for (SinhVien sv : this.listSV) {
			sv.xuat();
		}
	}

	public void themSinhVien(SinhVien sv) {
		this.listSV.add(sv);
	}

	// Business methods
	public void tinhDTB() {
		for (SinhVien sv : this.listSV) {
			sv.tinhDTB();
		}
	}

	public void xepLoai() {
		for (SinhVien sv : this.listSV) {
			sv.xepLoai();
		}
	}
}