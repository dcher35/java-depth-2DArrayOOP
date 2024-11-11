package com.edu.chmnu.ki_123.c3;

public class Record {
    private String result;

    public Record(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return result;
    }
}