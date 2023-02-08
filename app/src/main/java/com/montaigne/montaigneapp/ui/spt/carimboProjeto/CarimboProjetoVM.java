package com.montaigne.montaigneapp.ui.spt.carimboProjeto;

import android.app.Activity;

import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.montaigne.montaigneapp.model.Coordenada;
import com.montaigne.montaigneapp.model.Projeto;
import com.montaigne.montaigneapp.model.spt.ProjetoSpt;
import com.montaigne.montaigneapp.utils.Geolocation;

import java.io.IOException;
import java.util.Map;


public class CarimboProjetoVM extends ViewModel {
    private ProjetoSpt projetoSpt;
    private CarimboProjetoAdapter adapter;

    protected void setProjeto(ProjetoSpt projetoSpt) { this.projetoSpt = projetoSpt; }

    protected Projeto getProjeto() {
        Map<String, String> values = adapter.getValues();
        projetoSpt.setNome(values.get("nome"));
        projetoSpt.setCliente(values.get("cliente"));
        projetoSpt.setEmpresa(values.get("empresa"));
        projetoSpt.setTecnico(values.get("tecnico"));
        projetoSpt.setContato(values.get("numeroDeTelefone"));
        projetoSpt.setDataInicio(values.get("dataInicio"));
        return projetoSpt;
    }

    protected void setLocal(Activity activity, Coordenada coordenada) {
        try {
            projetoSpt.setLocalDaObra(Geolocation.geocoder(activity, coordenada));
        } catch (IOException e) {
            e.printStackTrace();
        }  // todo: handle exception
    }

    protected void initializeRecycler(RecyclerView recycler) {
        this.adapter = new CarimboProjetoAdapter(projetoSpt);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(recycler.getContext()));
    }
}
