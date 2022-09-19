package SieuBo;

import java.util.Arrays;
import java.util.Scanner;

public class Manage {
    SieuBo[] nhanvien = {};
    Scanner scanner = new Scanner(System.in);
    public void show() {
        for (int i = 0; i < nhanvien.length; i++) {
            System.out.println(nhanvien[i].toString());
        }
    }
    public void Them(){
     SieuBo[] themNV = new SieuBo[nhanvien.length+1];
     SieuBo nhanviens = taonhanvien();
     for (int i = 0; i < nhanvien.length; i++) {
        themNV[i] = nhanvien[i];
    }
    themNV[themNV.length -1] = nhanviens;
    nhanvien = themNV;
}
public SieuBo taonhanvien() {
        System.out.println("nhập name: ");
        String name = scanner.nextLine();
        System.out.println("nhập age: ");
        String age = scanner.nextLine();
        System.out.println("nhập sex: ");
        String sex = scanner.nextLine();
        System.out.println("nhập address: ");
        String address = scanner.nextLine();
        System.out.println("nhập loại cán bộ   1.công nhân   2.kĩ sư    3.nhân viên");
        int loai = Integer.parseInt(scanner.nextLine());
        SieuBo Nhanvienmoi;
        if (loai == 1) {
            System.out.println("nhập cấp bậc: ");
            double CapBac = Integer.parseInt(scanner.nextLine());
            Nhanvienmoi = new CongNhan(name, age, sex, address, CapBac);
        } else if (loai == 2) {
            System.out.println("nhập ngành đào tạo: ");
            String NDT = scanner.nextLine();
            Nhanvienmoi = new KiSu(name, age, sex, address, NDT);
        } else {
            System.out.println("nhập công việc: ");
            String Nhanvien = scanner.nextLine();
            Nhanvienmoi = new NhanVien(name, age, sex, address, Nhanvien);
        }
        return Nhanvienmoi;
    }

    public void timkiem(){
        System.out.println("nhập name cần tìm: ");
        String name = scanner.nextLine();
        for (int i = 0; i < nhanvien.length; i++) {
            if (nhanvien[i].getName().equals(name)){
                System.out.println(nhanvien[i].toString());
                break;
            }
        }
    }
}
