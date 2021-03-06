package com.example.customclassmultibindings.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.customclassmultibindings.view.CustomView;
import com.example.customclassmultibindings.viewmodel.MainPresentationModel;
import com.example.customclassmultibindings.R;
import com.example.customclassmultibindings.binding.ViewBindingForCustomView;

import org.robobinding.binder.BinderFactoryBuilder;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainPresentationModel presentationModel = new MainPresentationModel();
        View rootView = new BinderFactoryBuilder()
                .add(new ViewBindingForCustomView().forView(CustomView.class))
                .build()
                .createViewBinder(this)
                .inflateAndBind(R.layout.activity_main, presentationModel);
        setContentView(rootView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
