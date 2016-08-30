package rubix.com.theincredibleme.model;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

import rubix.com.theincredibleme.MainActivity;
import rubix.com.theincredibleme.R;
import rubix.com.theincredibleme.contents.PlusPersonality;

public class PlusQuestionModel {

    String Title, qOne, qTwo, qThree, qFour, qFive;
    int ImageId;

    public String getqOne() {
        return qOne;
    }

    public void setqOne(String qOne) {
        this.qOne = qOne;
    }

    public String getqTwo() {
        return qTwo;
    }

    public void setqTwo(String qTwo) {
        this.qTwo = qTwo;
    }

    public String getqThree() {
        return qThree;
    }

    public void setqThree(String qThree) {
        this.qThree = qThree;
    }

    public String getqFour() {
        return qFour;
    }

    public void setqFour(String qFour) {
        this.qFour = qFour;
    }

    public String getqFive() {
        return qFive;
    }

    public void setqFive(String qFive) {
        this.qFive = qFive;
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

    public static ArrayList<PlusQuestionModel> getData() {
        ArrayList<PlusQuestionModel> premiumContent = new ArrayList<>();
        Context context = PlusPersonality.instance;
        int[] images = getImages();
        String[] titles = getTitles();
        String[] qOnes = getQOne();
        String[] qTwos = getQTwo();
        String[] qThrees = getQThree();
        String[] qFours = getQFour();
        String[] qFives = getQFive();

        for (int i = 0; i < qOnes.length; i++) {
            PlusQuestionModel mainModel = new PlusQuestionModel();
            mainModel.setTitle(titles[i]);
            mainModel.setqOne(qOnes[i]);
            mainModel.setqTwo(qTwos[i]);
            mainModel.setqThree(qThrees[i]);
            mainModel.setqFour(qFours[i]);
            mainModel.setqFive(qFives[i]);
            premiumContent.add(mainModel);
        }
        return premiumContent;
    }

    public static int[] getImages() {
        int[] getImages = new int[]{
        };

        return getImages;
    }

    public static String[] getTitles() {
        String[] getTitles = new String[]{
                "فرض کنید شما مشخصه صورت کسی هستید,کدام قسمت ازصورت او هستید؟",
                "دوست دارید چه نوع پرنده ای باشید؟",
                "کدام یک ازآلات موسیقی را دوست دارید؟",
                " کدام یک ازبرنامه های تلویزیونی برای شما جالب تراست؟ ",
                "کدام یک ازبازی های شهربازی را بیشتردوست دارید؟ ",
                "آیا شما به اشتباهات خودتان می\u200Cخندید؟",
                " اگردوست شما سربه سرتان گذاشت چه عکس العملی نشان می دهید؟ ",
                "اولین چیزی که صبح موقع بیدارشدن به فکرتان خطورمی\u200Cکند چیست؟ ",
                "درزندگیتان چه شعاری دارید؟ ",
                "آیا به همه حیوانات علاقه مندید؟ ",
                "شما لبخند می\u200Cزنید؟ ",
                " نظردیگران راجع به شما اغلب کدام مورد است؟ ",
                "شما احساس عشق وقدردانی خود را نشان می\u200Cدهید؟ ",
                "شما اعتقاد دارید که برای شاداب بودن باید ساعاتی ازروز را منحصرا صرف خودتان کنید؟ ",
                "آیا زندگی شما بابرنامه ریزی پیش می\u200Cرود؟"
        };

        return getTitles;
    }

    public static String[] getQOne() {
        String getQOne[] = new String[]{
                "چین وچروک", "شباهنگ", "پیانو", "اخباروبرنامه های مستند",
                "هیچ کدام , من ازشهربازی متنفرم", "هرگز", "عصبانی می\u200Cشوید",
                "کارویا تحصیل", "وقت طلاست", "اصلا", "هرگز", " بی رحم", "هرگز", "اصلا", "من حتی درتعطیلات هم برنامه ریزی می\u200Cکنم"
        };

        return getQOne;
    }

    private static String[] getQTwo() {
        String[] getQTwo = new String[]{
            "لکه","جغد","ویلون","فیلم های درام وزندگی نامه"," قطاریا قایق","به ندرت","ناراحت می\u200Cشوید","مشکلات زندگی"
                ,"سحرخیزباش تا کامروا باشی","تعداد کمی ازحیوانات","به ندرت","سرد وبی احساس","به ندرت","احتمالا نه","همیشه برنامه ریزی می\u200Cکنم"
        };

        return getQTwo;
    }

    private static String[] getQThree(){
        String[] getQThree = new String[]{
                "خال زیبایی","عقاب","سازدهنی"," هیجانی وپلیسی","نمایش واجرای کمدی","برخی مواقع"," برایتان جالب است"," صبحانه","آنچه برای خود می پسندی برای دیگران هم بپسند","برخی ازحیوانات",
                "گاهی اوقات","زیبا","گاهی","گاهی","بستگی به روزهفته دارد"
        };
        return getQThree;
    }

    private static String[] getQFour(){
        String[] getQFour = new String[]{
                "کک ومک","فلامینگو","گیتار","عشقی وماجرایی"," چرخ وفلک ووسایلی که سریع می چرخند","معمولا",
                "تلافی می\u200Cکنید"," روزی که درپیش دارید","زندگی کن وبه دیگران هم اجازه زندگی کردن بده","بیشترحیوانات","اغلب"," دوست داشتنی",
                "اغلب","بله","درصورت امکان اجازه می\u200Cدهم که خودش پیش آید"
        };
        return getQFour;
    }

    private static String[] getQFive() {
        String[] getQFive = new String[]{
                "لبخند","پنگوئن","دف","کمدی وکارتون","ترن های هوایی سریع السیر","همیشه",
                "چندین برابرتلافی می\u200Cکنید","کاری که تا شب انجام خواهید داد"," بی خیال باش , هرچه بادا باد","تمام حیوانات",
                "آنقدرزیاد که برخی فکرمی کنند دیوانه هستم","خوشگذران",
                "حداکثرتا جایی که امکان دارد","البته ,تا جایی که امکان دارد به خودتان می\u200Cرسید","همیشه بدون برنامه ریزی روزها را طی می\u200Cکنم"
        };
        return getQFive;
    }

}
