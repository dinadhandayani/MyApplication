package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int[] images = {R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7};

    String[] name = {"Dela Adelia",
            "Dena Meilani J.",
            "Dina Dwi H.",
            "Muhammad Nugraha Z. A.",
            "Ani Mulyani",
            "Pernik Dessi Y.",
            "Raka Rahmat G."};

    String[] status = {"(Sok) Sibuk, eh available denk",
            "Sedang di Gerlong",
            "At the Gym",
            "It's funny",
            "Slow respon",
            "At the Moon",
            "Event hunter"};

    String[] nim = {
            "1703734",
            "1704734",
            "1703571",
            "1703168",
            "1703861",
            "1703471",
            "1703036"
    };

    String[] ttl = {
            "Sukabumi, 6 April 1999",
            "Bandung, 15 Mei 1999",
            "Bandung, 23 Agustus 1998",
            "Tanjungpinang, 21 Maret 1998",
            "Bandung, 22 Maret 1999",
            "Bandung, 19 September 1999",
            "Bandung, 29 Maret 1999"
    };

    ListView lView;

    ListAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lView = (ListView) findViewById(R.id.memberList);

        lAdapter = new ListAdapter(MainActivity.this, name, status, images);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // Toast.makeText(MainActivity.this, version[i]+" "+versionNumber[i], Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(MainActivity.this,
                        ProfilePage.class);
                Bundle bundle = new Bundle();
                bundle.putString("nama", name[i]);
                bundle.putInt("pic", images[i]);
                bundle.putString("nim", nim[i]);
                bundle.putString("ttl", ttl[i]);
                myIntent.putExtras(bundle);
                startActivity(myIntent);


            }
        });

    }
}