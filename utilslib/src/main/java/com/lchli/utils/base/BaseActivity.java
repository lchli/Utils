package com.lchli.utils.base;

import android.app.Activity;

import com.lchli.utils.tool.VF;


/**
 * Created by bbt-team on 2017/12/6.
 */

public class BaseActivity extends Activity {

    public <T> T f(int id) {
        return VF.f(this, id);
    }
}
