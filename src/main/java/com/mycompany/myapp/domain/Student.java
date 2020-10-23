package com.mycompany.myapp.domain;


import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Student")
public class Student  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ho_ten", nullable = false)
    String hoTen;

    @ApiModelProperty(notes = "Mã giới tính người học")
    @Column(name = "ma_gioi_tinh", nullable = false)
    String maGioiTinh;

    @ApiModelProperty(notes = " Ngày sinh người học")
    @Column(name = "ngay_sinh", nullable = false)
    String ngaySinh;
    @ApiModelProperty(notes = "Mã quốc tịch người học")
    @Column(name = "quoc_tich", nullable = false)
    String quocTich;
    @ApiModelProperty(notes = "Mã người học")
    @Column(name = "ma_sinh_vien", nullable = false)
    String maSinhVien;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaGioiTinh() {
        return maGioiTinh;
    }

    public void setMaGioiTinh(String maGioiTinh) {
        this.maGioiTinh = maGioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
