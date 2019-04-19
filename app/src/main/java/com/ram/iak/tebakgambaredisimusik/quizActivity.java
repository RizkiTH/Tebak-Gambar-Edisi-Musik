package com.ram.iak.tebakgambaredisimusik;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


/**
 * Created by Rizki The Hedgeman on 11-05-2017.
 */

public class quizActivity extends AppCompatActivity {

    //Deklarasi Variabel----------------------------------------------------------------------------
    //S1
    EditText edtS1;
    //S2
    CheckBox cbTooth, cbBrush, cbWhite;
    //S3
    RadioButton rbS3;
    //S4
    RadioButton rbS4;
    //S5
    EditText edtS5;
    //S6
    CheckBox cbOur, cbSelf, cbLove;
    //S7
    EditText edtS7;
    //S8
    EditText edtS8;
    //S9
    RadioButton rbS9;
    //S10
    EditText edtS10;

    //Untuk Menampilkan Hasil ----------------------------------------------------------------------
    String cek1, cek2, cek3, cek4, cek5, cek6, cek7, cek8, cek9, cek10;
    int nilai = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().setTitle("Tebak Judul Lagu Barat 2016");
        getSupportActionBar().setSubtitle("Tebak Gambar Edisi Musik");

        //Menghubungkan Variabel dengan Komponen di Activity ---------------------------------------
        //S1
        edtS1 = (EditText) findViewById(R.id.s1);
        //S2
        cbTooth = (CheckBox) findViewById(R.id.s2_tooth);
        cbWhite = (CheckBox) findViewById(R.id.s2_white);
        cbBrush = (CheckBox) findViewById(R.id.s2_brush);
        //S3
        rbS3 = (RadioButton) findViewById(R.id.s3);
        //S4
        rbS4 = (RadioButton) findViewById(R.id.s4);
        //S5
        edtS5 = (EditText) findViewById(R.id.s5);
        //S6
        cbOur = (CheckBox) findViewById(R.id.s6_our);
        cbLove = (CheckBox) findViewById(R.id.s6_love);
        cbSelf = (CheckBox) findViewById(R.id.s6_self);
        //S7
        edtS7 = (EditText) findViewById(R.id.s7);
        //S8
        edtS8 = (EditText) findViewById(R.id.s8);
        //S9
        rbS9 = (RadioButton) findViewById(R.id.s9);
        //S10
        edtS10 = (EditText) findViewById(R.id.s10);
    }

    public void logika(View view) {
        //S1
        if (edtS1.getText().toString().equalsIgnoreCase("Dawin-Jumpshot")) {
            nilai = nilai + 1;
            cek1 = "BENAR";
        } else {
            cek1 = "SALAH";
        }
        //S2
        if (cbTooth.isChecked() && cbBrush.isChecked() && !cbWhite.isChecked()) {
            nilai = nilai + 1;
            cek2 = "BENAR";
        } else {
            cek2 = "SALAH";
        }
        //S3
        if (rbS3.isChecked()) {
            nilai = nilai + 1;
            cek3 = "BENAR";
        } else {
            cek3 = "SALAH";
        }
        //S4
        if (rbS4.isChecked()) {
            nilai = nilai + 1;
            cek4 = "BENAR";
        } else {
            cek4 = "SALAH";
        }
        //S5
        if (edtS5.getText().toString().equalsIgnoreCase("Charlie Puth-One Call Away")) {
            nilai = nilai + 1;
            cek5 = "BENAR";
        } else {
            cek5 = "SALAH";
        }
        //S6
        if (cbLove.isChecked() && cbSelf.isChecked() && !cbOur.isChecked()) {
            nilai = nilai + 1;
            cek6 = "BENAR";
        } else {
            cek6 = "SALAH";
        }
        //S7
        if (edtS7.getText().toString().equalsIgnoreCase("Selena Gomez-Hands To Myself")) {
            nilai = nilai + 1;
            cek7 = "BENAR";
        } else {
            cek7 = "SALAH";
        }
        //S8
        if (edtS8.getText().toString().equalsIgnoreCase("Cold Play-Hymn For The Weekend")) {
            nilai = nilai + 1;
            cek8 = "BENAR";
        } else {
            cek8 = "SALAH";
        }
        //S9
        if (rbS9.isChecked()) {
            nilai = nilai + 1;
            cek9 = "BENAR";
        } else {
            cek9 = "SALAH";
        }
        //S10
        if (edtS10.getText().toString().equalsIgnoreCase("Adele-Hello")) {
            nilai = nilai + 1;
            cek10 = "BENAR";
        } else {
            cek10 = "SALAH";
        }

        TextView tampilanNilai = (TextView) findViewById(R.id.nilaiku);
        tampilanNilai.setText(""+nilai);

        TextView tampilSoal = (TextView) findViewById(R.id.text_soal);
        String tampilanSoal = "Soal 1 => \nSoal 2 => \nSoal 3 => \nSoal 4 => \nSoal 5 => \nSoal 6 => \nSoal 7 => \nSoal 8 => \nSoal 9 => \nSoal 10 => ";
        tampilSoal.setText(tampilanSoal);

        String nilaiHasil = tampilanNilaiBS(cek1, cek2, cek3, cek4, cek5, cek6, cek7, cek8, cek9, cek10);
        TextView tampilanNilaiBS = (TextView) findViewById(R.id.text_BS);
        tampilanNilaiBS.setText(nilaiHasil);

        nilai=0;
    }

    private String tampilanNilaiBS(String cek1, String cek2, String cek3, String cek4, String cek5, String cek6, String cek7, String cek8, String cek9, String cek10) {
        String msg = "" + cek1;
        msg += "\n" + cek2;
        msg += "\n" + cek3;
        msg += "\n" + cek4;
        msg += "\n" + cek5;
        msg += "\n" + cek6;
        msg += "\n" + cek7;
        msg += "\n" + cek8;
        msg += "\n" + cek9;
        msg += "\n" + cek10;
        return msg;
    }

}
