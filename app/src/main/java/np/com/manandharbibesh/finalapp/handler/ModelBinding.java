package np.com.manandharbibesh.finalapp.handler;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.BindingBuildInfo;
import android.databinding.InverseBindingAdapter;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Bibesh on 7/20/17.
 */

public class ModelBinding extends BaseObservable {
    private int name;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @BindingAdapter("android:text")
    public static void setText(TextView view, int value) {
        view.setText(Integer.toString(value));
    }

    @InverseBindingAdapter(attribute = "android:text")
    public static int getText(TextView view) {
        try {
            return Integer.parseInt(view.getText().toString());
        } catch (Exception err) {
            Log.v("ER", err.getMessage());
            return 0;
        }
    }
}