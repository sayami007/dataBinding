package np.com.manandharbibesh.finalapp.handler;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingBuildInfo;

/**
 * Created by Bibesh on 7/20/17.
 */

public class ModelBinding extends BaseObservable {
    private String name;

    @Bindable
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
