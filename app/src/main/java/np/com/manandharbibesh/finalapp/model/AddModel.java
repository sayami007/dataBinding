package np.com.manandharbibesh.finalapp.model;

import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.TextView;

/**
 * Created by Bibesh on 7/20/17.
 */

public class AddModel {

    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
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
            return 0;
        }
    }
}
