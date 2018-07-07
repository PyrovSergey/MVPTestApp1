package com.example.pyrov.mvptestapp1.Model;

import com.example.pyrov.mvptestapp1.Presenter.Contract;

public class Model implements Contract.Model {

    @Override
    public String getResultSaveDB(String data) {
        // code
        return "Data saved";
    }
}
