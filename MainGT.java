package Buoi6_ThayHuy;
import java.util.ArrayList;

public class MainGT {
    /**
     * Bài  thu hoạch tuần 8 , bài 3
     * pre:Phan Chí Hiếu
     * G-mail:hieup3611@gmail.com
     * @param args
     */
    public static void main(String[] args) {
        try {

			String chon =" ";
			ArrayList<PhuongTienGiaoThong> index = new ArrayList<PhuongTienGiaoThong>();
			do {
				System.out.println("********************************************************");
				System.out.println("*     CHƯƠNG TRÌNH QUẢN LÍ PHƯƠNG TIỆN GIAO THÔNG      *");
				System.out.println("*     A - Tìm Phương Tiện Dựa Vào Biển Số              *");
				System.out.println("*     B - In Danh Sách Các Phương Tiện Đã Đăng Ký      *");
				System.out.println("*     C - Cho Biết Tổng Số Tiền Phí Đăng Ký Thu Được   *");
				System.out.println("*     D - Tổng Số Tiền Đóng Bảo Hiểm Thu Được          *");
				System.out.println("*     E - Thêm Phương Tiện Giao Thông Vào Danh Sách    *");
				System.out.println("*     F - EXIT PROGRAM                                 *");
				System.out.println("********************************************************");
				chon = Brand.inputString("Chọn Các Tính Năng Trên MENU [A - F] : ");
				switch(chon) {
				case "A":
					if (index.size() > 0) {
                        System.out.println("Nhập mã sinh viên cần tìm: ");
                        String id = Brand.inputString(" ");
                        PhuongTienGiaoThong st = checkPhuongTienGiaoThong(id, index);
                        if (st != null) {
                            System.out.println(st.thongTin());
                            
                        } else {
                            System.out.println("Không tìm thấy mã sinh viên tương ứng");
                        }
                    
                    }
                    break;
				case "B":
					if(index.isEmpty()) 
	                     System.out.println("Chưa có phương tiện nào !!.");
	                       
	                 else {
	                     System.out.println("Danh sách các phương tiện đã được nhập");
	                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");				
	                     System.out.println("|  Biển Số   |    Họ Tên           |   Trị Giá           | Hãng SX      |   Ngày DK       |  Nơi DK         | Mức Bảo Hiểm    |   Phí DK        |");
	                     System.out.println("|------------|---------------------|---------------------|--------------|-----------------|-----------------|-----------------|-----------------|");
	                     for(PhuongTienGiaoThong i : index)
	                         System.out.println(i.thongTin());
	                 }
	                  break;
				case "C":
					System.out.println("Tổng Số Tiền Phí Đăng Kí Thu Được ");
                    double tienDK=0;
                    for(PhuongTienGiaoThong i : index)
                        tienDK+= i.phiDangKy();
                    System.out.println(tienDK);
                    break;
				case "D":
					System.out.println("Tổng Số Tiền Đóng Bảo Hiểm ");
                    double tienBH=0;
                    for(PhuongTienGiaoThong i : index)
                        tienBH+= i.mucBaoHiem();
                    System.out.println(tienBH);
                    break;
				case "E":
					int luachon=0;
                    do {
                        System.out.println("*************************************************");
                        System.out.println("***    NHẬP THÔNG TIN CHO PHƯƠNG TIỆN MỚI     ***");
                        System.out.println("***      1. Thêm phương tiện vào danh sách    ***");
                        System.out.println("***      2. Back to the main program          ***");
                        System.out.println("*************************************************");
                        luachon=Brand.toInt("Chon cac lua chon sau...[1-2] : ");
                        switch(luachon) {
                        case 1:
                            PhuongTienGiaoThong a = new PhuongTienGiaoThong();
                            a.nhapDl();
                            index.add(a);
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Khong co lua chon!!!");
                        }
                    }while(luachon!=2);
				case "F":
					break;
			    default:
			    	System.out.println("Nhập sai chức năng trong MENU.Mời bạn nhập lại");
				}
				
			}while(!chon.equalsIgnoreCase("F"));
			System.out.println("Good Bye!!");
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static PhuongTienGiaoThong checkPhuongTienGiaoThong(String id,ArrayList<PhuongTienGiaoThong> index) {
		for(var s : index) {
			if(s.getBienSo().equalsIgnoreCase(id)) {
				return s;
			}
		}
		return null;

}
    }
    

