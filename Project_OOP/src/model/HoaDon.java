/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tungb_000
 */
public class HoaDon {
    private String maHoaDon;
    private String tenKhachHang;
    private String soDienThoai;
    private String ngay; 
    private ArrayList<SanPham> ds_SanPham;
    private long tongTien;

    public HoaDon(String maHoaDon, String tenKhachHang, String soDienThoai, String ngay, ArrayList<SanPham> ds_SanPham, long tongTien) {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.ngay = ngay;
        this.ds_SanPham = ds_SanPham;
        this.tongTien = tongTien;
    }

    public HoaDon(String maHoaDon, String ngay, ArrayList<SanPham> ds_SanPham, long tongTien) {
        this.maHoaDon = maHoaDon;
        this.ngay = ngay;
        this.ds_SanPham = ds_SanPham;
        this.tongTien = tongTien;
    }
    
    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }    
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public ArrayList<SanPham> getDs_SanPham() {
        return ds_SanPham;
    }

    public void setDs_SanPham(ArrayList<SanPham> ds_SanPham) {
        this.ds_SanPham = ds_SanPham;
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }
}
