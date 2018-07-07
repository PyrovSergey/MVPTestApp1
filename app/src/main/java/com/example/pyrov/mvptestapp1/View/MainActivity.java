package com.example.pyrov.mvptestapp1.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pyrov.mvptestapp1.Presenter.Contract;
import com.example.pyrov.mvptestapp1.Presenter.Presenter;
import com.example.pyrov.mvptestapp1.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements Contract.View {
    @BindView(R.id.et_first)
    EditText etFirst;
    @BindView(R.id.et_second)
    EditText etSecond;
    @BindView(R.id.btn_save_first)
    Button btnSaveFirst;
    @BindView(R.id.btn_save_second)
    Button btnSaveSecond;
    @BindView(R.id.tv_first)
    TextView tvFirst;
    @BindView(R.id.tv_second)
    TextView tvSecond;

    private Contract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new Presenter(this);
    }

    @OnClick(R.id.btn_save_first)
    public void onBtnSaveFirstClicked() {
        presenter.firstButtonClicked();
    }

    @OnClick(R.id.btn_save_second)
    public void onBtnSaveSecondClicked() {
        presenter.secondButtonClicked();
    }

    @Override
    public String getFirstField() {
        return etFirst.getText().toString();
    }

    @Override
    public String getSecondField() {
        return etSecond.getText().toString();
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFirstText(String text) {
        tvFirst.setText(text);
    }

    @Override
    public void showSecondText(String text) {
        tvSecond.setText(text);
    }
}
