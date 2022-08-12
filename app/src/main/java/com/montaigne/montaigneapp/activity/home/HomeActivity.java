package com.montaigne.montaigneapp.activity.home;

import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.montaigne.montaigneapp.R;
import com.montaigne.montaigneapp.activity.AbstractActivity;

public class HomeActivity extends AbstractActivity {
    protected FloatingActionButton newProjectFab;
    protected RecyclerView recyclerProjetoCategorias, recyclerProjetosSalvos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carimbo_unico);

//        HomeVM viewModel = new HomeVM(this);
    }

    @Override
    protected void initializeViews() {

    }
}