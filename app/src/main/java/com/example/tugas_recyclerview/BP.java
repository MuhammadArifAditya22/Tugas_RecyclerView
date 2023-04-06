package com.example.tugas_recyclerview;

public class BP {
    String  name, S;
    int logo;

    public BP(String name,String S, int logo) {
        this.name = name;
        this.S =S;
        this.logo=logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getS() {
        return S;
    }

    public void setS(String s) {
        S = s;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
