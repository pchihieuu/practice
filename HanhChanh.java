package Buoi6_ThayHuy;

import java.io.IOException;

import Entertainmat.Solution;

public class HanhChanh extends Person{
    private long phuCap;
	private long thuong;
	
	public long getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(long phuCap) {
		this.phuCap = phuCap;
	}

	public long getThuong() {
		return thuong;
	}

	public void setThuong(long thuong) {
		this.thuong = thuong;
	}

	public HanhChanh() {
		super();
		this.phuCap=0;
		this.thuong=0;
	}

	@Override
	public long thucLanh() {
		// TODO Auto-generated method stub
		return this.getLuongCB()+this.phuCap+this.thuong;
	}

	@Override
	public long thueThuNhap() {
		long thuecn=0;
		return (long)(this.thucLanh()<10000000?0 :(this.thucLanh()<20000000?(double)thucLanh()*0.1 :(this.thucLanh()<40000000?(double)thucLanh()*0.15: (double)thucLanh()*0.25)));
		
	}
	/**
	 * Phuong thuc dung cho viec nhap du lieu doi voi nhan vien phong hanh chinh
	 */
	public void nhapDl() throws IOException {
		super.nhapDl();
		this.phuCap=(long) Solution.inputLong("Nhap phu cap: ");
		this.thuong=(long) Solution.inputLong("Nhap thuong: ");
	}
	public String thongTin() {
		return super.thongTin() + String.format(" %11d | %11d | %12d |", this.phuCap,this.thuong,this.thucLanh());
		
	}

    
}
