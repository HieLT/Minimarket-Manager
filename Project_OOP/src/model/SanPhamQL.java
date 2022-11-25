/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import FileDB.FileDB;
import java.util.ArrayList;

/**
 *
 * @author tungb_000
 */
public class SanPhamQL {
    private FileDB file;
    
    public SanPhamQL() {
        file = new FileDB();
    }
    public ArrayList<SanPham> getDS_SanPham(){
        return file.get_Ds_SanPham();
    }
    
    public void themSanPham(SanPham sp) {
        if (sp instanceof SanPham) FileDB.ds_SanPham.add(sp);
        long tongTien = sp.getGiaMua()*sp.getSoLuong();
        file.writeSanPhamToFile();
    }

    public void suaThongTin(SanPham sp, int i) {
        SanPham s = (SanPham) sp;
        FileDB.ds_SanPham.get(i).setMaSanPham(s.getMaSanPham());
        FileDB.ds_SanPham.get(i).setTenSanPham(s.getTenSanPham());
        FileDB.ds_SanPham.get(i).setLoaiSanPham(s.getLoaiSanPham());
        FileDB.ds_SanPham.get(i).setThuongHieu(s.getThuongHieu());
        FileDB.ds_SanPham.get(i).setDonVi(s.getDonVi());
        FileDB.ds_SanPham.get(i).setSoLuong(s.getSoLuong());
        FileDB.ds_SanPham.get(i).setGiaMua(s.getGiaMua());
        FileDB.ds_SanPham.get(i).setGiaBan(s.getGiaBan());
        file.writeSanPhamToFile();
    }

    public void xoaSanPham(int i) {
        int sz = getDS_SanPham().size();
        if (i < sz) { 
            FileDB.ds_SanPham.remove(i);
        } 
        file.writeSanPhamToFile();
    }

    public void writeSanPhamToFile() {
        file.writeSanPhamToFile();
    }

    public ArrayList thongKe() {
        ArrayList ds = new ArrayList<>();
        int tongSoSP = FileDB.ds_SanPham.size();
        ds.add(tongSoSP);
        int sanPhamSize = 0;
        long tongGiaTriSanPham = 0;
        for (SanPham sanpham : FileDB.ds_SanPham){
            sanPhamSize += sanpham.getSoLuong();
            tongGiaTriSanPham += sanpham.getGiaBan()*sanpham.getSoLuong();
        }
        ds.add(sanPhamSize);
        return ds;
    }
}
