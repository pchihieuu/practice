package Buoi6_ThayHuy;
import java.util.ArrayList;

import Entertainmat.Solution;
public class NhanSuProgram {
    public static void main(String[] args) {
        try {
            /**
             * Safely code
             * Tạo 2 ArrayList phục vụ truy xuất và Clas Hành Chánh và Kinh Doanh
             */
            int chon=0;
            ArrayList<HanhChanh> hanhchanhList = new ArrayList<HanhChanh>();
            ArrayList<KinhDoanh> kinhdoanhList = new ArrayList<KinhDoanh>();
            do {
                
                System.out.println("***************************************************************************");
                System.out.println("***                         QUAN LY NHAN VIEN                           ***");
                System.out.println("***      1.Danh sach nhan vien phong hanh chanh                         ***");
                System.out.println("***      2.Danh sach nhan vien phong kinh doanh                         ***");
                System.out.println("***      3.Tong so tien luong phong hanh chanh                          ***");
                System.out.println("***      4.Tong so tien thuong theo doanh so cua phong KD               ***");
                System.out.println("***      5.Them mot nhan vien moi vao                                   ***");
                System.out.println("***      6.Ket thuc chuong trinh                                        ***");
                System.out.println("***************************************************************************");
                chon=Solution.toInt("Hay chon chuc nang sau...[1-6]");
                switch(chon) {
                case 1://Danh sách sih viên phòng hành chính (foreach)
                    if(hanhchanhList.isEmpty()) 
                    System.out.println("Chua co nhan vien nao phong hanh chanh.");
                    
                else {
                    System.out.println("Danh sach sinh vien phong hanh chanh");
                    System.out.println("------------------------------------------------------------------------------------------------------------------");				
                    System.out.println("| Ma NV |  Ho Ten             | Gioi tinh | So Dt        |  Luong CB  |  Phu cap    |  Thuong     |  Thuc lanh   |");
                    System.out.println("|-------|---------------------|-----------|--------------|------------|-------------|-------------|--------------|");
                    for(HanhChanh i : hanhchanhList)
                        System.out.println(i.thongTin());
                }
                    
                break;
                case 2://Danh sách nhân viên phòng kinh doanh(foreach)
                    if(kinhdoanhList.isEmpty())
                        System.out.println("Chua co sinh vien phong kinh doanh");
                    else {
                        System.out.println("Danh sach sinh vien phong kinh doanh");
                        System.out.println("------------------------------------------|----------------------------------------------------------");				
                        System.out.println("| Ma NV |  Ho Ten             | Gioi tinh | So Dt        |  Luong CB  |  Doanh So    |  Thuc lanh   |");
                        System.out.println("|-------|---------------------|-----------|--------------|------------|--------------|--------------|");
                        for(KinhDoanh i : kinhdoanhList)
                            System.out.println(i.thongTin());
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                    }
                    break;
                case 3://Tổng số tiền lương phòng hành chánh (foreach)
                    System.out.println("Tong so tien luong phai tra cho phong Hanh Chanh");
                    long tienLuong=0;
                    for(HanhChanh i : hanhchanhList)
                        tienLuong+= i.thucLanh();
                    System.out.println(tienLuong);
                    break;
                case 4://Tổng số tiền thưởng phòng kinh doanh(foreach)
                    System.out.println("Tong so tien thuong theo doanh so cua phong kinh doanh");
                    long thuong=0;
                    for(KinhDoanh i :kinhdoanhList)
                        thuong+= i.thuongDoanhSo();
                    System.out.println(thuong);
                    break;
                case 5://Thêm sinh viên vào danh sách
                    int luachon=0;
                    do {
                        System.out.println("***********************************************");
                        System.out.println("***    NHAP THONG TIN CHO NHAN VIEN MOI     ***");
                        System.out.println("***      1. Phong Hanh Chanh                ***");
                        System.out.println("***      2. Phong Kinh Doanh                ***");
                        System.out.println("***      3. Back to the main program        ***");
                        luachon=Solution.toInt("Chon cac lua chon...[1-3]");
                        switch(luachon) {
                        case 1:
                            HanhChanh a = new HanhChanh();
                            a.nhapDl();
                            hanhchanhList.add(a);
                            break;
                        case 2:
                            KinhDoanh b = new KinhDoanh();
                            b.nhapDl();
                            kinhdoanhList.add(b);
                        case 3:
                            break;
                        default:
                            System.out.println("Khong co lua chon!!!");
                        }
                    }while(luachon!=3);
                
                case 6:
                    System.out.println("Bye Bye!!!!!!!");
                    break;
                default:
                    System.out.println("Nhap sai chuc nang .Nhap lai!!!!");
                        
                }
                
            }while(chon!=6);
            System.out.println("Xin Chao Va Hen Gap Lai");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
