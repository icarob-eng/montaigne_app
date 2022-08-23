package com.montaigne.montaigneapp.activity.spt.carimboUnico;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.montaigne.montaigneapp.R;
import com.montaigne.montaigneapp.activity.AbstractActivity;

public class CarimboUnicoActivity extends AbstractActivity {
    protected Button buttonPegarLocalizacao;
    protected Button buttonIniciarEnsaio;
    protected EditText editTextDataInicio;
    protected EditText editTextNivelFuro;
    protected ImageButton imageButtonHelpDataInicio;
    protected ImageButton imageButtonHelpNivelFuro;
    protected ImageButton imageButtonHelpCoordenadaFuro;
    protected ImageButton imageButtonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeViews();
        setContentView(R.layout.activity_carimbo_unico);

        CarimboUnicoVM viewModel = new CarimboUnicoVM(this);
    }

    @Override
    protected void initializeViews() {
        buttonPegarLocalizacao = findViewById(R.id.buttonPegarLocalizacao);
        buttonIniciarEnsaio = findViewById(R.id.buttonIniciarEnsaio);
        editTextDataInicio = findViewById(R.id.editTextDataInicio);
        editTextNivelFuro = findViewById(R.id.editTextNivelFuro);
        imageButtonHelpCoordenadaFuro = findViewById(R.id.imageButtonHelpCoordenadaFuro);
        imageButtonHelpDataInicio = findViewById(R.id.imageButtonHelpDataInicio);
        imageButtonHelpNivelFuro = findViewById(R.id.imageButtonHelpNivelFuro);
        imageButtonHome = findViewById(R.id.imageButtonHome);
    }
}