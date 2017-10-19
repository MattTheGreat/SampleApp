import android.graphics.Bitmap;

/**
 * Created by brielledavis on 10/19/17.
 */

public class RecentCameraPhoto implements IRecentCameraPhoto {

    private Bitmap mdispalyImage;
    private String mdisplayText;

    public RecentCameraPhoto(Bitmap image, String text){
        mdispalyImage = image;
        mdisplayText = text;

    }

    @Override
    public void SetImage(Bitmap image) {
        mdispalyImage = image;
    }

    @Override
    public void SetText(String text) {
        mdisplayText = text;
    }
}
