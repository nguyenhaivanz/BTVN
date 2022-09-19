package SieuBo;

public class KiSu extends SieuBo {
    private String NganhDaoTao;

    public KiSu(String NganhDaoTao) {
        this.NganhDaoTao = NganhDaoTao;
    }
    public KiSu(String name, String age, String sex, String address, String NganhDaoTao){
        super(name,age,sex,address);
        this.NganhDaoTao = NganhDaoTao;
 }

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String NganhDaoTao) {
        this.NganhDaoTao = NganhDaoTao;
    }

    @Override
    public String toString() {
        return super.toString() +"NganhDaoTao =  " + NganhDaoTao;
    }
}
