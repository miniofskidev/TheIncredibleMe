package rubix.com.theincredibleme.model;

import java.util.ArrayList;

import rubix.com.theincredibleme.R;

public class MainModel {

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

    public static ArrayList<MainModel> getData() {
        ArrayList<MainModel> premiumContent = new ArrayList<>();
        int[] images = getImages();
        String[] titles = getTitles();

        for (int i = 0; i < images.length; i++) {
            MainModel mainModel = new MainModel();
            mainModel.setImageId(images[i]);
            mainModel.setTitle(titles[i]);
            mainModel.setuCantHideBitch(i);
            premiumContent.add(mainModel);
        }
        return premiumContent;
    }

    public static int[] getImages() {
        int[] getImages = new int[]{
                R.drawable.flower, R.drawable.color,
                R.drawable.person, R.drawable.date,
                R.drawable.curious, R.drawable.courage,
                R.drawable.mind, R.drawable.intro,
                R.drawable.marriage,
                R.drawable.dep, R.drawable.stress
        };

        return getImages;
    }

    public static  int[] getUCantHideBitch(){
        int[] getUCantHideBitch = new int[]{
                0,1,2,3,4,5,6,7,8,9,10,11
        };
        return getUCantHideBitch;
    }

    public static String[] getTitles() {
        String[] getTitles = new String[]{
                "روانشناسی گل" , "تست رنگ",
                "شخصیت شناسی","تست تاریخ تولد",
                "تست فضولی" ,"شجاعت اجتماعی",
                "شخصیت شناسی پلاس","درونگرایی ",
                "ازدواج","افسردگی",
                "الان مضطربی؟"
        };

        return getTitles;
    }

}
