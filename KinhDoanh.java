package Buoi6_ThayHuy;
import java.io.IOException;

import Entertainmat.Solution;
public class KinhDoanh extends Person{
    private long doanhSo;

	
	public long getDoanhSo() {
		return doanhSo;
	}
	public void setDoanhSo(long doanhSo) {
		this.doanhSo = doanhSo;
	}
	public KinhDoanh() {
		super();
		this.doanhSo=0;
		
	}
	public long thuongDoanhSo() {
		return (long)((double) this.doanhSo*0.3);
	}
	@Override
	public long thucLanh() {
		return this.thuongDoanhSo()+this.getLuongCB();
	}

	@Override
	public long thueThuNhap() {
		// TODO Auto-generated method stub
		return (long)(this.thucLanh()<10000000?0 :(this.thucLanh()<20000000?(double)thucLanh()*0.1 :(this.thucLanh()<40000000?(double)thucLanh()*0.15: (double)thucLanh()*0.25)));
		
	}
	public void nhapDl() throws IOException {
		super.nhapDl();
		this.doanhSo=(long) Solution.inputLong("Nhap doanh so: ");
		
	}
	public String thongTin() {
		return super.thongTin() + String.format(" %12d | %12d |", this.doanhSo,this.thucLanh());
	}

    
}
