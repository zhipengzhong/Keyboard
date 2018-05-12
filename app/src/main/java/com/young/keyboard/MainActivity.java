package com.young.keyboard;

import android.inputmethodservice.KeyboardView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.widget.EditText;

import com.young.keyboard.util.KeyboardUtil;

public class MainActivity extends AppCompatActivity {

    private EditText mEt;
    private KeyboardView mKeyboardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mEt = findViewById(R.id.et);
        mKeyboardView = findViewById(R.id.keyboard_view);
        mEt.setInputType(InputType.TYPE_NULL);
        KeyboardUtil keyboardUtil = new KeyboardUtil(this, mEt);
        keyboardUtil.showKeyboard();
    }


}
