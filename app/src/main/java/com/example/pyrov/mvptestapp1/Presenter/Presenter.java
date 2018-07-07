package com.example.pyrov.mvptestapp1.Presenter;

import com.example.pyrov.mvptestapp1.Model.Model;

public class Presenter implements Contract.Presenter {

    Contract.View view;
    Contract.Model model;

    public Presenter(Contract.View view) {
        this.view = view;
        model = new Model();
    }

    @Override
    public void firstButtonClicked() {
        String text = view.getFirstField();
        view.showToast(model.getResultSaveDB(text));
        view.showFirstText(text);
    }

    @Override
    public void secondButtonClicked() {
        String text = view.getSecondField();
        view.showToast(model.getResultSaveDB(text));
        view.showSecondText(text);
    }
}
