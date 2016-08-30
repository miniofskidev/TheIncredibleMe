package rubix.com.theincredibleme.contents;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SlidingDrawer;
import android.widget.TextView;

import rubix.com.theincredibleme.R;
import rubix.com.theincredibleme.adapters.FlowerAdapter;
import rubix.com.theincredibleme.model.FlowerModel;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class FlowerTest extends AppCompatActivity {

    TextView toolbar;
    TextView flowerHeader, tvHeader, tv;
    RadioGroup rg;
    ImageButton shareBtn;
    Button slideToggle, flowerBtn, dBtn;

    public static FlowerTest flowerTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_test);

        setRecycler();
        setBackClick();


//        rg = (RadioGroup) findViewById(R.id.rgMain);
//        flowerHeader = (TextView) findViewById(R.id.flower_header);
//        slide = (SlidingDrawer) findViewById(R.id.slide);
//        slideToggle = (Button) findViewById(R.id.up);
//        flowerBtn = (Button) findViewById(R.id.flower_btn);
//
//        slide.setOnDrawerCloseListener(this);
//        slide.setOnDrawerOpenListener(this);
//        slide.setOnDrawerScrollListener(this);
//
//        final Dialog dialog = new Dialog(FlowerTest.this);
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        dialog.setContentView(R.layout.flower_answer_layout);
//
//        shareBtn = (ImageButton) dialog.findViewById(R.id.shareBtn);
//
//        flowerBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                tvHeader = (TextView) dialog.findViewById(R.id.flower_ans_hd);
//                tv = (TextView) dialog.findViewById(R.id.flower_ans_tv);
//                dBtn = (Button) dialog.findViewById(R.id.flower_dBtn);
//
//                int getRg = rg.getCheckedRadioButtonId();
//                if (getRg == R.id.rbOne) {
//                    tvHeader.setText("گل پامچال");
//                    tv.setText(getResources().getString(R.string.pamchal));
//                } else if (getRg == R.id.rbTwo) {
//                    tvHeader.setText("گل نرگس");
//                    tv.setText(getResources().getString(R.string.narges));
//                } else if (getRg == R.id.rbThree) {
//                    tvHeader.setText("گل سنبل");
//                    tv.setText(getResources().getString(R.string.sonbol));
//                } else if (getRg == R.id.rbFour) {
//                    tvHeader.setText("گل رز");
//                    tv.setText(getResources().getString(R.string.rose));
//                } else if (getRg == R.id.rbFive) {
//                    tvHeader.setText("ارکیده");
//                    tv.setText(getResources().getString(R.string.orchid));
//                } else if (getRg == R.id.rbSix) {
//                    tvHeader.setText("استکانی آبی");
//                    tv.setText(getResources().getString(R.string.bluebell));
//                } else if (getRg == R.id.rbSeven) {
//                    tvHeader.setText("شب بو");
//                    tv.setText(getResources().getString(R.string.stock));
//                } else if (getRg == R.id.rbEight) {
//                    tvHeader.setText("بنفشه");
//                    tv.setText(getResources().getString(R.string.banafshe));
//                } else if (getRg == R.id.rbNine) {
//                    tvHeader.setText("شقایق");
//                    tv.setText(getResources().getString(R.string.shaqayeq));
//                }
//
//                dialog.show();
//                shareBtn.setVisibility(View.INVISIBLE);
//                dBtn.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        dialog.dismiss();
//                    }
//                });
//
//            }
//        });

    }

    private void setBackClick() {

        ImageView imageView;
        TextView textView;

        textView = (TextView) findViewById(R.id.toolbarText);
        imageView = (ImageView) findViewById(R.id.toolbar_back_iv);

        textView.setText("روانشناسی گل");

        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }

    private void setRecycler() {
        FlowerAdapter flowerAdapter = new FlowerAdapter(this, FlowerModel.getData());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setAdapter(flowerAdapter);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

}
