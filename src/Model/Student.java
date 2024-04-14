package Model;

import java.util.Date;


public class Student {
    private int maSV;
    private String tenSV;
    private String lopQL;
    private String queQuan;
    private String ngaySinh;
    private String gioiTinh;
    
    public Student()
    {
        
    }

    public Student(int maSV, String tenSV, String lopQL, String queQuan, String ngaySinh, String gioiTinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopQL = lopQL;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getLopQL() {
        return lopQL;
    }

    public void setLopQL(String lopQL) {
        this.lopQL = lopQL;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
}
