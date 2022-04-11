package Buoi6_ThayHuy;
import java.io.IOException;
public class PhuongTienGiaoThong {
    /**
     * Bài Thu Hoạch Số 8 bài 3
     */
    private String bienSo;
	private String tenChuxe;
	private double triGia;
	private String hangSX;
	private String ngayDK;
	private String noiDangKy;
	
	public String getBienSo() {
		return bienSo;
	}
	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}
	public String getTenChuxe() {
		return tenChuxe;
	}
	public void setTenChuxe(String tenChuxe) {
		this.tenChuxe = tenChuxe;
	}
	public double getTriGia() {
		return triGia;
	}
	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}
	public String getHangSX() {
		return hangSX;
	}
	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}
	public String getNgayDK() {
		return ngayDK;
	}
	public void setNgayDK(String ngayDK) {
		this.ngayDK = ngayDK;
	}
	public String getNoiDangKy() {
		return noiDangKy;
	}
	public void setNoiDangKy(String noiDangKy) {
		this.noiDangKy = noiDangKy;
	}
	public PhuongTienGiaoThong() {
		this.bienSo =" ";
		this.tenChuxe =" ";
		this.triGia = 0.0;
		this.hangSX =" ";
		this.ngayDK =" ";
		this.noiDangKy =" ";
	}
	public PhuongTienGiaoThong(PhuongTienGiaoThong b) {
		this.setBienSo(b.getBienSo());
		this.setTenChuxe(b.getTenChuxe());
		this.setTriGia(b.getTriGia());
		this.setHangSX(b.getHangSX());
		this.setNgayDK(b.getNgayDK());
		this.setNoiDangKy(b.getNoiDangKy());
	}
	public PhuongTienGiaoThong(String bienSo,String tenChuXe,double triGia,String hangSX,String ngayDK,String noiDangKy) {
		this.bienSo =bienSo;
		this.tenChuxe = tenChuXe;
		this.triGia = triGia;
		this.hangSX = hangSX;
		this.hangSX = hangSX;
		this.ngayDK = ngayDK;
		this.noiDangKy = noiDangKy;
	}
	public void nhapDl() throws IOException {
		this.bienSo = Brand.inputString("Nhập biển số : ");
		this.tenChuxe = Brand.inputString("Nhập tên chủ xe : ");
		this.triGia = Brand.inputDouble("Nhập Trị Gía : ");
		this.hangSX = Brand.inputString("Nhập hãng sản xuất : ");
		this.ngayDK = Brand.inputString("Nhập ngày đăng ký :");
		this.noiDangKy = Brand.inputString("Nhập nơi đăng ký (HN/HCM/DN): ");
		
	}
	public double  mucBaoHiem() {
		return triGia * 0.12;
	}
	public double phiDangKy() {
		return(noiDangKy.equalsIgnoreCase("HN")? triGia*0.05:(noiDangKy.equalsIgnoreCase("HCM")? triGia* 0.03 : triGia*0.02 ));
	}
	public String thongTin() {
		return String.format("| %10s | %19s | %19f | %12s | %15s | %15s | %15f | %15f |",
	            this.bienSo,this.tenChuxe,this.triGia,this.hangSX,this.ngayDK,this.noiDangKy,this.mucBaoHiem(),this.phiDangKy());
	}
	
    
}
