package com.lchli.utils.base;

import android.support.v7.app.AppCompatActivity;

import com.lchli.utils.tool.VF;


public class BaseCompatActivity extends AppCompatActivity {

    public <T> T f(int id) {
        return VF.f(this, id);
    }
}
