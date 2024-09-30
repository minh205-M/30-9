
public class Person {
    private String hoTen;
    private int namSinh;

    public Person(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "Ho ten: " + hoTen + ", Nam sinh: " + namSinh;
    }
}


public class GiangVien extends Person {
    public GiangVien(String hoTen, int namSinh) {
        super(hoTen, namSinh);
    }

    @Override
    public String toString() {
        return "Giang vien - " + super.toString();
    }
}


public class SinhVien extends Person {
    private String mssv;

    public SinhVien(String hoTen, int namSinh, String mssv) {
        super(hoTen, namSinh);
        this.mssv = mssv;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    @Override
    public String toString() {
        return "Sinh vien - " + super.toString() + ", MSSV: " + mssv;
    }
}


public class NhanSuKhac extends Person {
    public NhanSuKhac(String hoTen, int namSinh) {
        super(hoTen, namSinh);
    }

    @Override
    public String toString() {
        return "Nhan su khac - " + super.toString();
    }
}
