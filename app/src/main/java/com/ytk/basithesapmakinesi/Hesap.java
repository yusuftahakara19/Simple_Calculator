package com.ytk.basithesapmakinesi;

public class Hesap {
    private  int sayi1,sayi2;

    public Hesap(int sayi1, int sayi2) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
    }

    public int topla(){
        return sayi1+sayi2;
    }
    public int cikar(){
        return sayi1-sayi2;
    }
    public int bol(){
        return sayi1/sayi2;
    }
    public int carp(){
        return sayi1*sayi2;
    }

}
