package com.k53ca.lotterylive.data;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table KET_QUA_XO_SO.
 */
public class KetQuaXoSo {

    private Long id;
    private Long serviceId;
    private Integer vung;
    private String date;
    private String giaiDacBiet;
    private String giaiNhat;
    private String giaiNhi;
    private String giaiBa;
    private String giaiTu;
    private String giaiNam;
    private String giaiSau;
    private String giaiBay;
    private String giaiTam;

    public KetQuaXoSo() {
    }

    public KetQuaXoSo(Long id) {
        this.id = id;
    }

    public KetQuaXoSo(Long id, Long serviceId, Integer vung, String date, String giaiDacBiet, String giaiNhat, String giaiNhi, String giaiBa, String giaiTu, String giaiNam, String giaiSau, String giaiBay, String giaiTam) {
        this.id = id;
        this.serviceId = serviceId;
        this.vung = vung;
        this.date = date;
        this.giaiDacBiet = giaiDacBiet;
        this.giaiNhat = giaiNhat;
        this.giaiNhi = giaiNhi;
        this.giaiBa = giaiBa;
        this.giaiTu = giaiTu;
        this.giaiNam = giaiNam;
        this.giaiSau = giaiSau;
        this.giaiBay = giaiBay;
        this.giaiTam = giaiTam;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getVung() {
        return vung;
    }

    public void setVung(Integer vung) {
        this.vung = vung;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGiaiDacBiet() {
        return giaiDacBiet;
    }

    public void setGiaiDacBiet(String giaiDacBiet) {
        this.giaiDacBiet = giaiDacBiet;
    }

    public String getGiaiNhat() {
        return giaiNhat;
    }

    public void setGiaiNhat(String giaiNhat) {
        this.giaiNhat = giaiNhat;
    }

    public String getGiaiNhi() {
        return giaiNhi;
    }

    public void setGiaiNhi(String giaiNhi) {
        this.giaiNhi = giaiNhi;
    }

    public String getGiaiBa() {
        return giaiBa;
    }

    public void setGiaiBa(String giaiBa) {
        this.giaiBa = giaiBa;
    }

    public String getGiaiTu() {
        return giaiTu;
    }

    public void setGiaiTu(String giaiTu) {
        this.giaiTu = giaiTu;
    }

    public String getGiaiNam() {
        return giaiNam;
    }

    public void setGiaiNam(String giaiNam) {
        this.giaiNam = giaiNam;
    }

    public String getGiaiSau() {
        return giaiSau;
    }

    public void setGiaiSau(String giaiSau) {
        this.giaiSau = giaiSau;
    }

    public String getGiaiBay() {
        return giaiBay;
    }

    public void setGiaiBay(String giaiBay) {
        this.giaiBay = giaiBay;
    }

    public String getGiaiTam() {
        return giaiTam;
    }

    public void setGiaiTam(String giaiTam) {
        this.giaiTam = giaiTam;
    }

}
