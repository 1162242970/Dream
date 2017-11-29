package com.tinno.myphoto.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.tinno.myphoto.R;

/**
 * Created by android on 17-11-24.
 */

public class MainFragememnt extends Fragment{

    RecyclerView recyclerView;
    private SliderLayout sliderShow;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);


        sliderShow = (SliderLayout) view.findViewById(R.id.slider);

        imageSlider();

        return view;
    }

    /**
     * AndroidImageslider
     */
    private void imageSlider() {

        TextSliderView textSliderView1 = new TextSliderView(getContext());
        textSliderView1
                .description("银河护卫队2")
                .image("http://i5qiniu.mtime.cn/mg/2016/12/04/143436.93575096.jpg");

        TextSliderView textSliderView2 = new TextSliderView(getContext());
        textSliderView2
                .description("记忆大师")
                .image("http://img5.mtime.cn/mg/2016/11/21/144656.57866103.jpg");

        TextSliderView textSliderView3 = new TextSliderView(getContext());
        textSliderView3
                .description("星际特工")
                .image("http://img5.mtime.cn/mg/2016/11/11/143347.84705153.jpg");

        TextSliderView textSliderView4 = new TextSliderView(getContext());
        textSliderView4
                .description("《长城》全新预告片")
                .image("http://img5.mtime.cn/mg/2016/10/09/112424.73820873.jpg");



        sliderShow.addSlider(textSliderView1);
        sliderShow.addSlider(textSliderView2);
        sliderShow.addSlider(textSliderView3);
        sliderShow.addSlider(textSliderView4);

        //图片点击监听
        textSliderView1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(getActivity(),"电影：银河护卫队2",Toast.LENGTH_SHORT).show();
            }
        });

        textSliderView2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(getActivity(),"电影：记忆大师",Toast.LENGTH_SHORT).show();
            }
        });

        textSliderView3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(getActivity(),"电影：星际特工",Toast.LENGTH_SHORT).show();
            }
        });

        textSliderView4.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(getActivity(),"电影：长城",Toast.LENGTH_SHORT).show();
            }
        });



        //其他设置
        sliderShow.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);//使用默认指示器，在底部显示
        sliderShow.setDuration(2000);//停留时间

        //设置AndroidImageslider监听
        sliderShow.addOnPageChangeListener(new ViewPagerEx.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}






