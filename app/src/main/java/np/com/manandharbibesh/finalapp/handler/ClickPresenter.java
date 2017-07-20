package np.com.manandharbibesh.finalapp.handler;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Bibesh on 7/20/17.
 */

public class ClickPresenter {

    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Hello", Toast.LENGTH_SHORT).show();
    }
}
