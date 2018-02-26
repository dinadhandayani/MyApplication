package com.example.lenovo.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

/**
 * Created by Lenovo on 2/19/2018.
 */

public class ProfilePage extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        Intent intentExtras = getIntent();
        Bundle bundle = intentExtras.getExtras();

        String anggota = bundle.getString("nama");
        Integer pic = bundle.getInt("pic");
        String nimmhs = bundle.getString("nim");
        String ttlmhs = bundle.getString("ttl");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);

        TextView nama = (TextView) findViewById(R.id.name);
        nama.setText(anggota);

        ImageView foto = (ImageView) findViewById(R.id.profile);
        foto.setImageResource(pic);

        TextView nim = (TextView) findViewById(R.id.nim);
        nim.setText(nimmhs);

        TextView ttl = (TextView) findViewById(R.id.ttl);
        ttl.setText(ttlmhs);
    }
}
