package co.iyubinest.beerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainView {

    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this, new BeerApp());
    }

    public void order(View view) {
        mainPresenter.order();
    }

    @Override
    public void onPriceUpdated(double totalPrice) {
        ((TextView) findViewById(R.id.total)).setText(String.valueOf(totalPrice));
    }
}
