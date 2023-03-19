/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Pavilion 15
 */
public class DeadForm {

    private Fullname TenNguoiMat;
    private String GioiTinh;
    private String CCCD;
    private Date NgayMat;
    private Date NgaySinh;
    private Address DiaChiMat;
    private String LyDoMat;
    private String QuanHe;
    private Fullname TenNguoiDangKy;

    public DeadForm() {
    }

    public DeadForm(Fullname TenNguoiMat, String GioiTinh, String CCCD, Date NgayMat,
             Date NgaySinh, Address DiaChiMat, String LyDoMat, String QuanHe, Fullname TenNguoiDangKy) {
        this.TenNguoiMat = TenNguoiMat;
        this.GioiTinh = GioiTinh;
        this.CCCD = CCCD;
        this.NgayMat = NgayMat;
        this.NgaySinh = NgaySinh;
        this.DiaChiMat = DiaChiMat;
        this.LyDoMat = LyDoMat;
        this.QuanHe = QuanHe;
        this.TenNguoiDangKy = TenNguoiDangKy;
    }

    public String getTenNguoiMat() {
        return TenNguoiMat.last + " " + TenNguoiMat.mid + " " + TenNguoiMat.first;
    }

    public String getFirstNameNguoiMat() {
        return TenNguoiMat.first;
    }

    public void setTenNguoiMat(String TenNguoiMat) {
        //Truyền vào những từ bị phân cách bơ
        var words = TenNguoiMat.split("\\s+");
        //Tên ở vị trí cuối trong mảng
        this.TenNguoiMat.first = words[words.length - 1];
        //Họ ở vị trí đầu tiên trong mảng
        this.TenNguoiMat.last = words[0];
        //Tên đệm ở các vị trí còn lại
        var mid = "";
        for (int i = 1; i < words.length - 1; i++) {
            mid += words[i] + " ";
        }
        this.TenNguoiMat.mid = mid;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Date getNgayMat() {
        return NgayMat;
    }

    public void setNgayMat(Date NgayMat) {
        this.NgayMat = NgayMat;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChiMat() {
        return DiaChiMat.To+" "+DiaChiMat.KhuPho+" "+DiaChiMat.Phuong+" "+DiaChiMat.Quan;
    }

    public void setDiaChiMat(Address DiaChiMat) {
        this.DiaChiMat.To = DiaChiMat.To;
        this.DiaChiMat.KhuPho = DiaChiMat.KhuPho;
        this.DiaChiMat.Phuong = DiaChiMat.Phuong;
        this.DiaChiMat.Quan = DiaChiMat.Quan;
    }

    public String getLyDoMat() {
        return LyDoMat;
    }

    public void setLyDoMat(String LyDoMat) {
        this.LyDoMat = LyDoMat;
    }

    public String getQuanHe() {
        return QuanHe;
    }

    public void setQuanHe(String QuanHe) {
        this.QuanHe = QuanHe;
    }

    public String getTenNguoiDangKy() {
        return TenNguoiDangKy.last + " " + TenNguoiDangKy.mid + " " + TenNguoiDangKy.first;
    }

    public String getFirstNameNguoiDangKy() {
        return TenNguoiDangKy.first;
    }

    public void setTenNguoiDangKy(String TenNguoiDangKy) {
        //Truyền vào những từ bị phân cách bơ
        var words = TenNguoiDangKy.split("\\s+");
        //Tên ở vị trí cuối trong mảng
        this.TenNguoiDangKy.first = words[words.length - 1];
        //Họ ở vị trí đầu tiên trong mảng
        this.TenNguoiDangKy.last = words[0];
        //Tên đệm ở các vị trí còn lại
        var mid = "";
        for (int i = 1; i < words.length - 1; i++) {
            mid += words[i] + " ";
        }
        this.TenNguoiMat.mid = mid;
    }

    class Address {

        private String To;
        private String KhuPho;
        private String Phuong;
        private String Quan;

        public Address() {
            this.To = "";
            this.KhuPho = "";
            this.Phuong = "";
            this.Quan = "";
        }

        public Address(String To, String KhuPho, String Phuong, String Quan) {
            this.To = To;
            this.KhuPho = KhuPho;
            this.Phuong = Phuong;
            this.Quan = Quan;
        }

        public String getTo() {
            return To;
        }

        public void setTo(String To) {
            this.To = To;
        }

        public String getKhuPho() {
            return KhuPho;
        }

        public void setKhuPho(String KhuPho) {
            this.KhuPho = KhuPho;
        }

        public String getPhuong() {
            return Phuong;
        }

        public void setPhuong(String Phuong) {
            this.Phuong = Phuong;
        }

        public String getQuan() {
            return Quan;
        }

        public void setQuan(String Quan) {
            this.Quan = Quan;
        }

    }

    //Lớp Fullname chứa các thành phần của một cái tên
    class Fullname {

        private String first;
        private String mid;
        private String last;

        public Fullname() {
            first = "";
            mid = "";
            last = "";
        }

        public Fullname(String first, String mid, String last) {
            this.first = first;
            this.mid = mid;
            this.last = last;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

    }
}
