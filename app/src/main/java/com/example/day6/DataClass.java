package com.example.day6;

public class DataClass {

    private String dataTitle;
    private int dataDesc;
    private int dataJudul;
    private int dataTgl;
    private int dataGenre;
    private int dataSutradara;
    private int dataBintang;
    private int dataImage;

    public String getDataTitle() {
        return dataTitle;
    }

    public int getDataDesc() {
        return dataDesc;
    }

    public int getDataJudul() {
        return dataJudul;
    }

    public int getDataTgl() {
        return dataTgl;
    }

    public int getDataGenre() {
        return dataGenre;
    }

    public int getDataSutradara() {
        return dataSutradara;
    }

    public int getDataBintang() {
        return dataBintang;
    }

    public int getDataImage() {
        return dataImage;
    }

    public DataClass(String dataTitle, int dataJudul, int dataTgl, int dataGenre, int dataSutradara, int dataBintang, int dataDesc, int dataImage) {
        this.dataTitle = dataTitle;
        this.dataJudul = dataJudul;
        this.dataTgl = dataTgl;
        this.dataGenre = dataGenre;
        this.dataSutradara = dataSutradara;
        this.dataBintang = dataBintang;
        this.dataDesc = dataDesc;
        this.dataImage = dataImage;
    }
}
