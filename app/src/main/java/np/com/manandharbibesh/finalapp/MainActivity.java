package np.com.manandharbibesh.finalapp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import np.com.manandharbibesh.finalapp.databinding.AddBinding;
import np.com.manandharbibesh.finalapp.model.AddModel;
import np.com.manandharbibesh.finalapp.viewModel.AddPresenter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AddBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        AddPresenter presenter = new AddPresenter();
        AddModel model = new AddModel();
        binding.setModel(model);
        binding.setPresenter(presenter);
    }
}
