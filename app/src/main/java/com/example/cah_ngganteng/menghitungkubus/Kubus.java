package com.example.cah_ngganteng.menghitungkubus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Kubus extends AppCompatActivity {
    private EditText edtPanjang;
    private EditText edtLebar;
    private EditText edtLuas;
    private Button btnHitungLuas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
        initUI();
        initEvent();
    }
    private void initUI(){
        edtPanjang = (EditText) findViewById(R.id.editTextPanjang);
        edtLebar = (EditText) findViewById(R.id.editTextLebar);
        edtLuas = (EditText) findViewById(R.id.editTextLuas);
        btnHitungLuas = (Button) findViewById(R.id.buttonHitungLuas);
    }

    private void initEvent(){
        btnHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
    }

    private void hitungLuas(){
        int panjang = Integer.parseInt(edtPanjang.getText().toString());
        int lebar = Integer.parseInt(edtLebar.getText().toString());
        int luas = panjang*lebar;
        edtLuas.setText(luas+"");
    }
}
