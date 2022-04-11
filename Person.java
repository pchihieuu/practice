package Buoi6_ThayHuy;
import java.io.IOException;
import Entertainmat.Solution;
public abstract class Person {
	/**
	 * Bài Thu Hoạch 8 bài số 4
	 * Pre: Phan Chí Hiếu
	 * G-mail:hieup3611@gmail.com
	 */
	private int maNV;
	private String hoTen;
	private boolean gioiTinh;
	private String soDT;
	private long luongCB;
	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public long getLuongCB() {
		return luongCB;
	}
	public void setLuongCB(long luongCB) {
		this.luongCB = luongCB;
	}
	/**
	 * Default constructor
	 */
	public Person() {
		this.maNV=0;
		this.hoTen=" ";
		this.gioiTinh=true;
		this.soDT=" ";
		this.luongCB=0;
	}
	/**
	 * Phuong thuc dung cho nhap du lieu co ban cho nguoi lao dong
	 * @throws IOException
	 */
	public void nhapDl() throws IOException {
		this.maNV=Solution.toInt("Nhap ma nhan vien: ");
		this.hoTen=Solution.inputString("Nhap ho ten: ");
		this.gioiTinh=Solution.inputString("Gioi tinh [Nam-Nu]").equalsIgnoreCase("Nam");
		this.soDT=Solution.inputString("Nhap so dien thoai: ");
		this.luongCB=(long) Solution.inputLong("Luong ci ban: ");
	}
	/**
	 * Ham tra ve thong tin co ban cua nguoi lao dong
	 * @return
	 */
	public String thongTin() {
		return String.format("| %5d | %19s | %9s | %12s | %10d |",this.maNV,this.hoTen,(this.gioiTinh?"Nam":"Nu"),this.soDT,this.luongCB);
	}
	public abstract long thucLanh();
	public abstract long thueThuNhap();

}

    

