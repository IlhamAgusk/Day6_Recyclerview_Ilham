package com.example.day6;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.ByteArrayOutputStream;

public class DetailActivity extends AppCompatActivity {
    TextView detailDesc, detailTitle, detailJudul, detailTanggal, detailGenre, detailSutradara, detailBintang;
    ImageView detailImage;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        String judulFilm = getIntent().getStringExtra("Judul");
        String tglRilis = getIntent().getStringExtra("Tanggal");
        String genre = getIntent().getStringExtra("Genre");
        String sutradara = getIntent().getStringExtra("Sutradara");
        String bintang = getIntent().getStringExtra("Bintang");
        String desc = getIntent().getStringExtra("Desc");
        int img = getIntent().getIntExtra("Image", R.drawable.ic_launcher_background);

        detailDesc = findViewById(R.id.detailDesc);
        detailTitle = findViewById(R.id.detailTitle);
        detailImage = findViewById(R.id.detailImage);
        detailJudul = findViewById(R.id.detailjudulfilm);
        detailTanggal = findViewById(R.id.detailtglrilis);
        detailGenre = findViewById(R.id.detailGenre);
        detailSutradara = findViewById(R.id.detailsutradara);
        detailBintang = findViewById(R.id.detailBintang);
        button = findViewById(R.id.btn_share);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            detailDesc.setText(bundle.getInt("Desc"));
            detailImage.setImageResource(bundle.getInt("Image"));
            detailTitle.setText(bundle.getString("Title"));
            detailJudul.setText(bundle.getInt("Judul"));
            detailTanggal.setText(bundle.getInt("Tanggal"));
            detailGenre.setText(bundle.getInt("Genre"));
            detailSutradara.setText(bundle.getInt("Sutradara"));
            detailBintang.setText(bundle.getInt("Bintang"));
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), img);
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, bytes);
                String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Film", null);
                Uri imageUri = Uri.parse(path);

                String shareText = "Judul Film: " + judulFilm + "\nTanggal Rilis: " + tglRilis + "\nGenre: " + genre + "\nSutradara: " + sutradara + "\nBintang Film: " + bintang + "Deskripsi: " + desc;
                Intent shareIntent = new Intent(Intent.ACTION_SEND);

                shareIntent.setType("image/*");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}