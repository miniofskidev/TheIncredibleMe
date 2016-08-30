package rubix.com.theincredibleme.adapters;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import rubix.com.theincredibleme.MainActivity;
import rubix.com.theincredibleme.R;
import rubix.com.theincredibleme.contents.FlowerTest;
import rubix.com.theincredibleme.model.MainModel;
import rubix.com.theincredibleme.contents.PlusPersonality;

public class PremiumAdapter extends RecyclerView.Adapter<PremiumAdapter.PremiumHolder> {

    LayoutInflater inflater;
    Context context;
    ArrayList<MainModel> mainModels;
    public static MainActivity mainActivity = new MainActivity();

    public PremiumAdapter(Context context, ArrayList<MainModel> mainModels) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.mainModels = mainModels;
    }

    @Override
    public PremiumHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.main_model_row, parent, false);
        PremiumHolder premiumHolder = new PremiumHolder(view);
        return premiumHolder;
    }

    @Override
    public void onBindViewHolder(PremiumHolder holder, final int position) {
        MainModel current = mainModels.get(position);
        holder.setData(current, position);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch (position){
                    case 0 :
                        intent = new Intent(context,FlowerTest.class);
                        context.startActivity(intent);
                        break;
                    case 6 :
                        intent = new Intent(context, PlusPersonality.class);
                        context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mainModels.size();
    }

    class PremiumHolder extends RecyclerView.ViewHolder {

        TextView Title;
        CardView cardView;
        ImageView imageView;
        MainModel current;
        int position;
        Context context;

        public PremiumHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.premium_cardView);
            Title = (TextView) itemView.findViewById(R.id.MainModelTitle);
            imageView = (ImageView) itemView.findViewById(R.id.MainModelImage);
            context = itemView.getContext();
        }

        public void setData(MainModel current, int position) {
            this.current = current;
            this.position = position;
            this.imageView.setImageResource(current.getImageId());
            this.Title.setText(current.getTitle());
        }

    }
}
