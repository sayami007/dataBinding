package np.com.manandharbibesh.finalapp.viewModel;

import android.databinding.BaseObservable;
import android.util.Log;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by Bibesh on 7/20/17.
 */

public class AddPresenter extends BaseObservable {

    private int finalValue;

    public int getFinalValue() {
        return finalValue;
    }

    public void setFinalValue(int finalValue) {
        this.finalValue = finalValue;
        notifyPropertyChanged(BR._all);
    }

    public int addition(int a, int b) {
        this.setFinalValue(a + b);
        return a + b;
    }
}
