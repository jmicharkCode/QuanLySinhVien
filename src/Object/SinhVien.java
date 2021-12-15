package Object;

import java.util.Scanner;

public class SinhVien {
	private String tenSV;
	private int maSV;
	private float diemToan;
	private float diemHoa;
	private float diemLy;
	private float diemTB;
	private String xepLoai;

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public SinhVien() {

	}

	/**
	 * @param tenSV
	 * @param maSV
	 * @param diemToan
	 * @param diemHoa
	 * @param diemLy
	 */
	public SinhVien(String tenSV, int maSV, float diemToan, float diemHoa, float diemLy) {
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemHoa = diemHoa;
		this.diemLy = diemLy;
	}

	// input, output methods
	public void nhap(Scanner scan) {
		System.out.print("Enter name: ");
		this.tenSV = scan.nextLine();
		System.out.print("Enter code: ");
		this.maSV = Integer.parseInt(scan.nextLine());
		System.out.print("Enter toan: ");
		this.diemToan = Float.parseFloat(scan.nextLine());
		System.out.print("Enter hoa: ");
		this.diemHoa = Float.parseFloat(scan.nextLine());
		System.out.print("Enter ly: ");
		this.diemLy = Float.parseFloat(scan.nextLine());

	}

	public void xuat() {
		System.out.println("Sinh vien - Code: " + this.maSV + "\t Name: " + this.tenSV + "\t Toan: " + this.diemToan
				+ "\t Ly : " + this.diemLy + "\t Hoa: " + this.diemHoa + "\t DTB: " + this.diemTB + "\t Xep loai: "
				+ this.xepLoai);
	}

	// business method
	public void tinhDTB() {
		this.diemTB = (this.diemHoa + this.diemLy + this.diemToan) / 3;
	}

	public void xepLoai() {
		if(this.diemTB >= 9) this.xepLoai = "Xuat xac";
		else if(this.diemTB >= 8) this.xepLoai = "Gioi";
		else if(this.diemTB >= 7) this.xepLoai = "Kha";
		else if(this.diemTB >= 6) this.xepLoai = "TB - Kha";
		else if(this.diemTB >= 5) this.xepLoai = "TB";
		else this.xepLoai = "Yeu";
	}
}
