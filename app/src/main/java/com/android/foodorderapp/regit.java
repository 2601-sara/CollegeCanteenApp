package com.android.foodorderapp;


import android.text.Editable;

public class  regit{
        private String name, ma, pa;
        private int reg, no;

        public regit(String name, int reg, int no, String ma, String pa) {
            this.name = name;
            this.reg = reg;
            this.no = no;
            this.ma = ma;
            this.pa = pa;
        }
    public String getName() {

            return name;
    }

    public int getReg() {

            return reg;
    }

    public int getNo() {

            return no;
    }

    public String getMa() {

            return ma;
    }

    public String getPa() {

            return pa;
    }

    }
