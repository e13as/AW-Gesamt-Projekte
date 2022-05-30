package com.example.restdemo;

import java.util.ArrayList;
import java.util.List;

public class TestResult {

    private String msg;

    public TestResult(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }

    public int getStatus(){
        return 13;
    }


}
