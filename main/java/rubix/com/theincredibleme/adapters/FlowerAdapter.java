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

import rubix.com.theincredibleme.R;
import rubix.com.theincredibleme.contents.FlowerTest;
import rubix.com.theincredibleme.model.FlowerModel;
import rubix.com.theincredibleme.model.MainModel;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.PremiumHolder> {

    LayoutInflater inflater;
    Context context;
    ArrayList<FlowerModel> flowerModels;

    public FlowerAdapter(Context context, ArrayList<FlowerModel> flowerModels) {
        this.context = context;
        this.flowerModels = flowerModels;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public PremiumHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.flower_row, parent, false);
        PremiumHolder premiumHolder = new PremiumHolder(view);
        return premiumHolder;
    }

    @Override
    public void onBindViewHolder(PremiumHolder holder, int position) {
        FlowerModel current = flowerModels.get(position);
        holder.setData(current, position);
    }

    @Override
    public int getItemCount() {
        return flowerModels.size();
    }

    class PremiumHolder extends RecyclerView.ViewHolder {

        TextView Title;
        ImageView imageView;
        FlowerModel current;
        int position;
        Context context;

        public PremiumHolder(View itemView) {
            super(itemView);
            Title = (TextView) itemView.findViewById(R.id.flower_row_title);
            imageView = (ImageView) itemView.findViewById(R.id.flower_row_img);
            context = itemView.getContext();
        }

        public void setData(FlowerModel current, int position) {
            this.current = current;
            this.position = position;
            this.imageView.setImageResource(current.getImageId());
            this.Title.setText(current.getTitle());
        }

    }
}
