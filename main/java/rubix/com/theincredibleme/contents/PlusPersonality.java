package rubix.com.theincredibleme.contents;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import it.gmariotti.recyclerview.adapter.AlphaAnimatorAdapter;
import it.gmariotti.recyclerview.itemanimator.SlideScaleInOutRightItemAnimator;
import rubix.com.theincredibleme.R;
import rubix.com.theincredibleme.adapters.PlusQuestionAdaptor;
import rubix.com.theincredibleme.adapters.PremiumAdapter;
import rubix.com.theincredibleme.model.MainModel;
import rubix.com.theincredibleme.model.PlusQuestionModel;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class PlusPersonality extends AppCompatActivity {

    public static PlusPersonality instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus_personality);

        setUpRecyclerView();
        setBackClick();

    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        PlusQuestionAdaptor adapter = new PlusQuestionAdaptor(this, PlusQuestionModel.getData());
        LinearLayoutManager gm = new LinearLayoutManager(this);
        gm.setOrientation(LinearLayoutManager.VERTICAL);
        AlphaAnimatorAdapter alphaAnimatorAdapter = new AlphaAnimatorAdapter(adapter, recyclerView);
        recyclerView.setAdapter(alphaAnimatorAdapter);
        recyclerView.setItemAnimator(new SlideScaleInOutRightItemAnimator(recyclerView));
        recyclerView.setLayoutManager(gm);
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

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

}
