
package com.example.day6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<DataClass> dataList;
    MyAdapter2 adapter;
    DataClass androidData;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();
        androidData = new DataClass("Johnwick 1", R.string.JudulFilm_Johnwick1, R.string.TglRilis_Johnwick1, R.string.Genre_Johnwick1, R.string.Sutradara_Johnwick1, R.string.Bintang_Film_Johnwick1, R.string.DescJohn1, R.drawable.johnwick1);
        dataList.add(androidData);
        androidData = new DataClass("Johnwick 2", R.string.JudulFilm_Johnwick2, R.string.TglRilis_Johnwick2, R.string.Genre_Johnwick2, R.string.Sutradara_Johnwick2, R.string.Bintang_Film_Johnwick2, R.string.DescJohn2, R.drawable.johnwick2);
        dataList.add(androidData);
        androidData = new DataClass("Johnwick 3", R.string.JudulFilm_Johnwick3, R.string.TglRilis_Johnwick3, R.string.Genre_Johnwick3, R.string.Sutradara_Johnwick3, R.string.Bintang_Film_Johnwick3, R.string.DescJohn3, R.drawable.johnwick3);
        dataList.add(androidData);
        androidData = new DataClass("Johnwick 4", R.string.JudulFilm_Johnwick4, R.string.TglRilis_Johnwick4, R.string.Genre_Johnwick4, R.string.Sutradara_Johnwick4, R.string.Bintang_Film_Johnwick4, R.string.DescJohn4, R.drawable.johnwick4);
        dataList.add(androidData);
        androidData = new DataClass("Avengers Civil War", R.string.JudulFilm_CivilWar, R.string.TglRilis_CivilWar, R.string.Genre_CivilWar, R.string.Sutradara_CivilWar, R.string.Bintang_Film_CivilWar, R.string.DescCivilWar, R.drawable.avengers_civilwar);
        dataList.add(androidData);
        androidData = new DataClass("Avengers Infinity War", R.string.JudulFilm_Infinity, R.string.TglRilis_Infinity, R.string.Genre_Infinity, R.string.Sutradara_Infinity, R.string.Bintang_Film_Infinity, R.string.DescInfinity, R.drawable.avengers_infinitywar);
        dataList.add(androidData);
        androidData = new DataClass("Avengers End Game", R.string.JudulFilm_End, R.string.TglRilis_End, R.string.Genre_End, R.string.Sutradara_End, R.string.Bintang_Film_End, R.string.DescEnd, R.drawable.avengers_endgame);
        dataList.add(androidData);
        androidData = new DataClass("Guardian of The Galaxy Vol 1", R.string.JudulFilm_gotg1, R.string.TglRilis_gotg1, R.string.Genre_gotg1, R.string.Sutradara_gotg1, R.string.Bintang_Film_gotg1, R.string.Descgotg1, R.drawable.gotg_vol1);
        dataList.add(androidData);
        androidData = new DataClass("Guardian of The Galaxy Vol 2", R.string.JudulFilm_gotg2, R.string.TglRilis_gotg2, R.string.Genre_gotg2, R.string.Sutradara_gotg2, R.string.Bintang_Film_gotg2, R.string.Descgotg2, R.drawable.gotg_vol2);
        dataList.add(androidData);
        androidData = new DataClass("Guardian of The Galaxy Vol 3", R.string.JudulFilm_gotg3, R.string.TglRilis_gotg3, R.string.Genre_gotg3, R.string.Sutradara_gotg3, R.string.Bintang_Film_gotg3, R.string.Descgotg3, R.drawable.gotg_vol3);
        dataList.add(androidData);
        androidData = new DataClass("Thor: Courage Is Immortal", R.string.JudulFilm_Immortal, R.string.TglRilis_Immortal, R.string.Genre_Immortal, R.string.Sutradara_Immortal, R.string.Bintang_Film_Immortal, R.string.DescImmortal, R.drawable.thor_courage_is_immortal);
        dataList.add(androidData);
        androidData = new DataClass("Thor: The Dark World", R.string.JudulFilm_Dark, R.string.TglRilis_Dark, R.string.Genre_Dark, R.string.Sutradara_Dark, R.string.Bintang_Film_Dark, R.string.DescDark, R.drawable.thor_the_dark_world_poster);
        dataList.add(androidData);
        androidData = new DataClass("Thor: Ragnarok", R.string.JudulFilm_Ragnarok, R.string.TglRilis_Ragnarok, R.string.Genre_Ragnarok, R.string.Sutradara_Ragnarok, R.string.Bintang_Film_Ragnarok, R.string.DescRagnarok, R.drawable.thor_ragnarok);
        dataList.add(androidData);
        androidData = new DataClass("Thor: Love And Thunder", R.string.JudulFilm_Love, R.string.TglRilis_Love, R.string.Genre_Love, R.string.Sutradara_Love, R.string.Bintang_Film_Love, R.string.DescLove, R.drawable.thor_love_and_thunder);
        dataList.add(androidData);
        androidData = new DataClass("Fast & Furious: Hobs And Shaw", R.string.JudulFilm_HobsShaw, R.string.TglRilis_HobsShaw, R.string.Genre_HobsShaw, R.string.Sutradara_HobsShaw, R.string.Bintang_Film_HobsShaw, R.string.DescHobsShaw, R.drawable.fast_furious_hobs_and_shaw);
        dataList.add(androidData);
        adapter = new MyAdapter2(MainActivity.this, dataList);
        recyclerView.setAdapter(adapter);
    }
}