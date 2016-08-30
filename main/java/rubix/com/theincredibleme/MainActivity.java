package rubix.com.theincredibleme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import it.gmariotti.recyclerview.adapter.AlphaAnimatorAdapter;
import it.gmariotti.recyclerview.itemanimator.SlideScaleInOutRightItemAnimator;
import rubix.com.theincredibleme.adapters.PremiumAdapter;
import rubix.com.theincredibleme.fragments.FragmentNavigation;
import rubix.com.theincredibleme.model.MainModel;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CardView cardView;
    PremiumAdapter adapter;
    FragmentNavigation fragmentNavigation;
    ImageView nav;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setUpRecyclerView();
        setUpItems();

        nav= (ImageView) findViewById(R.id.toolbar_drawer);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.RIGHT);
            }
        });

    }

    float lastX , currentX;

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//
//        switch (event.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                lastX = event.getX();
//                break;
//            case MotionEvent.ACTION_UP:
//                currentX = event.getX();
//
//                if (lastX < currentX){
//                    Toast.makeText(MainActivity.this, "tadaaaa", Toast.LENGTH_SHORT).show();
//
//                }else Toast.makeText(MainActivity.this, "tanadaaa", Toast.LENGTH_SHORT).show();
//        }
//
//
//
//        return false;
//    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.premium_recycler);
        PremiumAdapter adapter = new PremiumAdapter(this, MainModel.getData());
        GridLayoutManager gm = new GridLayoutManager(this, 3);
        gm.setOrientation(LinearLayoutManager.VERTICAL);
        AlphaAnimatorAdapter alphaAnimatorAdapter = new AlphaAnimatorAdapter(adapter, recyclerView);
        recyclerView.setAdapter(alphaAnimatorAdapter);
        recyclerView.setItemAnimator(new SlideScaleInOutRightItemAnimator(recyclerView));
        recyclerView.setLayoutManager(gm);

        recyclerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        lastX = event.getX();
                        break;
                    case MotionEvent.ACTION_UP:
                        currentX = event.getX();

                        if (lastX<currentX)
                            Toast.makeText(MainActivity.this, "ohom", Toast.LENGTH_SHORT).show();
                        else if (lastX>currentX)
                            Toast.makeText(MainActivity.this, "Fuck Yeah", Toast.LENGTH_SHORT).show();

                }

                return false;
            }
        });

    }

    private void setUpItems() {
        fragmentNavigation = new FragmentNavigation();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.navigation, fragmentNavigation);
        ft.commit();
    }
}

//    public void pager(Fragment fragment){
//
//        fragmentMain = new FragmentMain();
//        fragmentFlowerTest = new FragmentFlowerTest();
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.container, fragmentMain);
//        fragmentTransaction.replace(R.id.container,fragment);
//        fragmentTransaction.commit();
//    }
/*
    private void setUpItems() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, premiumContentFragment);
        ft.commit();
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


}
*/