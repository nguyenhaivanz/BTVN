package SieuBo;

public class NhanVien extends SieuBo{
    private String CongViec;

    public NhanVien(String CongViec) {
        this.CongViec = CongViec;
    }

    public NhanVien(String name, String age, String sex, String address, String CongViec) {
        super(name, age, sex, address);
        this.CongViec = CongViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String CongViec) {
        this.CongViec = CongViec;
    }

    @Override
    public String toString() {
        return super.toString() +"CongViec='" + CongViec;
    }
}
