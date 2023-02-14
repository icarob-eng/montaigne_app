package com.montaigne.montaigneapp.ui.spt.carimboProjeto;

import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.montaigne.montaigneapp.model.Coordenada;
import com.montaigne.montaigneapp.model.Projeto;
import com.montaigne.montaigneapp.model.spt.ProjetoSpt;

import java.util.Map;

public class CarimboProjetoVM extends ViewModel {
    private ProjetoSpt projetoSpt;
    private CarimboProjetoAdapter adapter;

    protected void setProjeto(ProjetoSpt projetoSpt) { this.projetoSpt = projetoSpt; }

    protected Projeto getProjeto() {
        return adapter.updateProjetoSpt(projetoSpt);
    }

    protected void setLocation(Coordenada coordenada) {
        projetoSpt.setEndereco(coordenada.toString());
        // todo: ao invés de usar o toString, deve-se usar a API geocode
    }

    protected void initializeRecycler(RecyclerView recycler) {
        adapter = new CarimboProjetoAdapter(projetoSpt);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(recycler.getContext()));
    }
}
