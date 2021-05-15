package com.rtechnotest.maytinhbotui28042021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;

public class MainActivity extends AppCompatActivity {

    EditText mSoThu1, mSoThu2;
    TextView mKetqua;
    Button mButtonCong, mButtonTru, mButtonNhan, mButtonChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Anh xa

        mSoThu1 = findViewById(R.id.editTextSoThu1);
        mSoThu2 = findViewById(R.id.editTextSoThu2);
        mKetqua = findViewById(R.id.viewKetQua);
        mButtonCong = findViewById(R.id.buttonCong);
        mButtonTru = findViewById(R.id.buttonTru);
        mButtonNhan = findViewById(R.id.buttonNhan);
        mButtonChia = findViewById(R.id.buttonChia);

            // Su kien Click
            mButtonCong.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String textSoThu1 = mSoThu1.getText().toString();
                    String textSoThu2 = mSoThu2.getText().toString();

                    if (textSoThu1.isEmpty() || textSoThu1.length() == 0 || textSoThu1.equals("") || textSoThu1 == null) {
                        Toast.makeText(MainActivity.this, "Hãy nhập số đầu tiên!", Toast.LENGTH_LONG).show();

                    } else if (textSoThu2.isEmpty() || textSoThu2.length() == 0 || textSoThu2.equals("") || textSoThu2 == null) {
                        Toast.makeText(MainActivity.this, "Hãy nhập số thứ hai!", Toast.LENGTH_LONG).show();

                    } else {
                        int valueSothu1 = Integer.parseInt(textSoThu1);
                        int valueSothu2 = Integer.parseInt(textSoThu2);
                        int ketQua = valueSothu1 + valueSothu2;
                        mKetqua.setText("Kết quả = " + ketQua);
                    }
                }
            });
            mButtonTru.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String textSoThu1 = mSoThu1.getText().toString();
                    String textSoThu2 = mSoThu2.getText().toString();
                    if (textSoThu1.isEmpty() || textSoThu1.length() == 0 || textSoThu1.equals("") || textSoThu1 == null) {
                        Toast.makeText(MainActivity.this, "Hãy nhập số đầu tiên!", Toast.LENGTH_LONG).show();

                    } else if (textSoThu2.isEmpty() || textSoThu2.length() == 0 || textSoThu2.equals("") || textSoThu2 == null) {
                        Toast.makeText(MainActivity.this, "Hãy nhập số thứ hai!", Toast.LENGTH_LONG).show();

                    } else {
                        int valueSothu1 = Integer.parseInt(textSoThu1);
                        int valueSothu2 = Integer.parseInt(textSoThu2);
                        int ketQua = valueSothu1 - valueSothu2;
                        mKetqua.setText("Kết quả = " + ketQua);
                    }
                }
            });
            mButtonNhan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String textSoThu1 = mSoThu1.getText().toString();
                    String textSoThu2 = mSoThu2.getText().toString();
                    if (textSoThu1.isEmpty() || textSoThu1.length() == 0 || textSoThu1.equals("") || textSoThu1 == null) {
                        Toast.makeText(MainActivity.this, "Hãy nhập số đầu tiên!", Toast.LENGTH_LONG).show();

                    } else if (textSoThu2.isEmpty() || textSoThu2.length() == 0 || textSoThu2.equals("") || textSoThu2 == null) {
                        Toast.makeText(MainActivity.this, "Hãy nhập số thứ hai!", Toast.LENGTH_LONG).show();

                    } else {
                        int valueSothu1 = Integer.parseInt(textSoThu1);
                        int valueSothu2 = Integer.parseInt(textSoThu2);
                        int ketQua = valueSothu1 * valueSothu2;
                        mKetqua.setText("Kết quả = " + ketQua);
                    }
                }
            });
            mButtonChia.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String textSoThu1 = mSoThu1.getText().toString();
                    String textSoThu2 = mSoThu2.getText().toString();
                    if (textSoThu1.isEmpty() || textSoThu1.length() == 0 || textSoThu1.equals("") || textSoThu1 == null) {
                        Toast.makeText(MainActivity.this, "Hãy nhập số đầu tiên!", Toast.LENGTH_LONG).show();

                    } else if (textSoThu2.isEmpty() || textSoThu2.length() == 0 || textSoThu2.equals("") || textSoThu2 == null) {
                        Toast.makeText(MainActivity.this, "Hãy nhập số thứ hai!", Toast.LENGTH_LONG).show();

                    } else {
                        int valueSothu1 = Integer.parseInt(textSoThu1);
                        int valueSothu2 = Integer.parseInt(textSoThu2);
                        if (valueSothu2 != 0) {
                            int ketQua = valueSothu1 / valueSothu2;
                            mKetqua.setText("Kết quả = " + ketQua);
                        } else {
                            Toast.makeText(MainActivity.this, "Khong the chia cho 0", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

            });
        }
    }


//                Toast.makeText(MainActivity.this, "Da Click Nut Cong", Toast.LENGTH_SHORT).show();
//            }
//        });
//        mButtonTru.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Da Click nut Tru", Toast.LENGTH_SHORT).show();
//            }
//        });
//        mButtonNhan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Da click nut Nhan", Toast.LENGTH_SHORT).show();
//            }
//        });
//        mButtonChia.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Da nhan nut chia", Toast.LENGTH_SHORT).show();
//            }
//        });
