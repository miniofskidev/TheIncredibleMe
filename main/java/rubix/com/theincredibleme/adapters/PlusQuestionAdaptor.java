package rubix.com.theincredibleme.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import rubix.com.theincredibleme.R;
import rubix.com.theincredibleme.model.FlowerModel;
import rubix.com.theincredibleme.model.PlusQuestionModel;

public class PlusQuestionAdaptor extends RecyclerView.Adapter<PlusQuestionAdaptor.PremiumHolder> {

    LayoutInflater inflater;
    Context context;
    ArrayList<PlusQuestionModel> plusQuestionModels;

    public PlusQuestionAdaptor(Context context, ArrayList<PlusQuestionModel> plusQuestionModels) {
        this.context = context;
        this.plusQuestionModels = plusQuestionModels;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public PremiumHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.layout_plus_question, parent, false);
        PremiumHolder premiumHolder = new PremiumHolder(view);
        return premiumHolder;
    }

    @Override
    public void onBindViewHolder(PremiumHolder holder, int position) {
        PlusQuestionModel current = plusQuestionModels.get(position);
        holder.setData(current, position);
    }

    @Override
    public int getItemCount() {
        return plusQuestionModels.size();
    }

    class PremiumHolder extends RecyclerView.ViewHolder {

        TextView Title , ansOne , ansTwo , ansThree , ansFour , ansFive;
        ImageView imageView;
        PlusQuestionModel current;
        int position;
        Context context;

        public PremiumHolder(View itemView) {
            super(itemView);
            Title = (TextView) itemView.findViewById(R.id.title);
            ansOne = (TextView) itemView.findViewById(R.id.qOne);
            ansTwo = (TextView) itemView.findViewById(R.id.qTwo);
            ansThree = (TextView) itemView.findViewById(R.id.qThree);
            ansFour = (TextView) itemView.findViewById(R.id.qFour);
            ansFive = (TextView) itemView.findViewById(R.id.qFive);
            imageView = (ImageView) itemView.findViewById(R.id.flower_row_img);
            context = itemView.getContext();
        }

        public void setData(PlusQuestionModel current, int position) {
            this.current = current;
            this.position = position;
            this.ansOne.setText(current.getqOne());
            this.ansTwo.setText(current.getqTwo());
            this.ansThree.setText(current.getqThree());
            this.ansFour.setText(current.getqFour());
            this.ansFive.setText(current.getqFive());
//            this.imageView.setImageResource(current.getImageId());
            this.Title.setText(current.getTitle());
        }

    }
}
