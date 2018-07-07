package com.example.pyrov.mvptestapp1.Presenter;

public interface Contract {
    interface View {
        String getFirstField();

        String getSecondField();

        void showToast(String message);

        void showFirstText(String text);

        void showSecondText(String text);
    }

    interface Presenter {
        void firstButtonClicked();

        void secondButtonClicked();
    }

    interface Model {
        String getResultSaveDB(String data);
    }
}
