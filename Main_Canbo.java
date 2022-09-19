package SieuBo;

import java.util.Scanner;

public class Main_Canbo {
    static Manage manage = new Manage();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----quản lí cán bộ-----");
        System.out.println("1.thông tin: ");
        System.out.println("2.tạo nhân viên: ");
        System.out.println("3.in danh sách: ");
        System.out.println("4.tìm kiếm: ");
        System.out.println("5.Thoát: ");
        while (true){
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                  manage.Them();
                    break;
                case 2:
                    manage.taonhanvien();
                    break;
                case 3:
                    manage.show();
                    break;
                case 4:
                    manage.timkiem();
                    break;
                case 5:
                    return;
            }
        }
    }
}