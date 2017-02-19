package com.andywong.arcgisdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.esri.android.map.Layer;
import com.esri.android.map.MapView;
import com.esri.android.toolkit.map.MapViewHelper;
import com.esri.android.toolkit.map.OnGraphicClickListener;
import com.esri.core.map.Graphic;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.map)
    MapView map;
    @InjectView(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        MapViewHelper mvhelper=new MapViewHelper(map);
        Layer layer;

        mvhelper.setOnGraphicClickListener(new OnGraphicClickListener() {
            @Override
            public void onGraphicClick(Graphic graphic) {

                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @OnClick({R.id.map, R.id.tv})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.map:
                break;
            case R.id.tv:
                break;
        }
    }
}
