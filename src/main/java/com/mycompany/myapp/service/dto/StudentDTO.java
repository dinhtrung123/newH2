package com.mycompany.myapp.service.dto;


import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;


public class StudentDTO {

    private Long id;
    String hoTen;

    String maGioiTinh;

    String ngaySinh;

    String quocTich;

    String maSinhVien;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
