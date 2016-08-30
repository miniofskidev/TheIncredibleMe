package rubix.com.theincredibleme.model;

import java.util.ArrayList;

import rubix.com.theincredibleme.R;

public class FlowerModel {

    String Title;
    int ImageId;
    int uCantHideBitch;

    public int getuCantHideBitch() {
        return uCantHideBitch;
    }

    public void setuCantHideBitch(int uCantHideBitch) {
        this.uCantHideBitch = uCantHideBitch;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public static ArrayList<FlowerModel> getData() {
        ArrayList<FlowerModel> premiumContent = new ArrayList<>();
        int[] images = getImages();
        String[] titles = getTitles();

        for (int i = 0; i < images.length; i++) {
            FlowerModel mainModel = new FlowerModel();
            mainModel.setImageId(images[i]);
            mainModel.setTitle(titles[i]);
            mainModel.setuCantHideBitch(i);
            premiumContent.add(mainModel);
        }
        return premiumContent;
    }

    public static int[] getImages() {
        int[] getImages = new int[]{
                R.drawable.narges, R.drawable.sonbol,
                R.drawable.rose, R.drawable.banafsha,
                R.drawable.estikani, R.drawable.orkide,
                R.drawable.shabboo,
                R.drawable.shaqayeq, R.drawable.pamchal
        };

        return getImages;
    }

    public static String[] getTitles() {
        String[] getTitles = new String[]{
                "گل نرگس","سنبل","رز",
                "بنفشه","استکانی آبی","ارکیده",
                "شب بو","شقایق","پامچال"
        };

        return getTitles;
    }

}
