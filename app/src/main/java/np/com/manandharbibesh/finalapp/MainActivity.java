package np.com.manandharbibesh.finalapp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import np.com.manandharbibesh.finalapp.databinding.ActivityMainBinding;
import np.com.manandharbibesh.finalapp.handler.ClickPresenter;
import np.com.manandharbibesh.finalapp.handler.ModelBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ClickPresenter presenter = new ClickPresenter();
        ModelBinding modelBinding = new ModelBinding();

        ActivityMainBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewDataBinding.setModel(modelBinding);
        viewDataBinding.setButton(presenter);

    }
}
