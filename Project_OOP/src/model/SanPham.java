/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tungb_000
 */
public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String loaiSanPham;
    private int giaMua;
    private int giaBan;
    private String thuongHieu;
    private String donVi;
    private int soLuong;
    
    //nhap hang

    public SanPham(String maSanPham, String tenSanPham, String loaiSanPham, int giaMua, int giaBan, String thuongHieu, String donVi, int soLuong) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.loaiSanPham = loaiSanPham;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.thuongHieu = thuongHieu;
        this.donVi = donVi;
        this.soLuong = soLuong;
    }

    public SanPham(String maSanPham, String tenSanPham, String loaiSanPham, int giaBan, String thuongHieu, String donVi, int soLuong) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.loaiSanPham = loaiSanPham;
        this.giaBan = giaBan;
        this.thuongHieu = thuongHieu;
        this.donVi = donVi;
        this.soLuong = soLuong;
    }

    public SanPham(String maSanPham, String tenSanPham,String donVi, int giaBan , int soLuong) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donVi=donVi;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public SanPham(String maSanPham, String tenSanPham, String loaiSanPham,String donVi,int soLuong, int giaBan) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.loaiSanPham = loaiSanPham;
        this.giaBan = giaBan;
        this.donVi = donVi;
        this.soLuong = soLuong;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public String getDonVi() {
        return donVi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
   
}
