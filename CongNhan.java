package SieuBo;

public class CongNhan extends SieuBo {
    private double CapBac;

    public CongNhan(double CapBac) {
        this.CapBac = CapBac ;
    }

    public CongNhan(String name, String age, String sex, String address, double CapBac) {
        super(name, age, sex, address);
        this.CapBac = CapBac;
    }

    public double getCapBac() {
        return CapBac;
    }

    public void setCapBac(double CapBac) {
        this.CapBac = CapBac;
    }

    @Override
    public String toString() {
        return super.toString() + "CapBac='" + CapBac;
    }
}
