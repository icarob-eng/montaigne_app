package com.montaigne.montaigneapp.ui.spt.furo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.montaigne.montaigneapp.R;
import com.montaigne.montaigneapp.databinding.FragmentCarimboProjetoBinding;
import com.montaigne.montaigneapp.databinding.FragmentFuroBinding;
import com.montaigne.montaigneapp.model.Projeto;
import com.montaigne.montaigneapp.ui.AbstractActivity;
import com.montaigne.montaigneapp.model.spt.FuroSpt;
import com.montaigne.montaigneapp.model.spt.ProjetoSpt;
import com.montaigne.montaigneapp.ui.carimboProjeto.CarimboProjetoVM;
import com.montaigne.montaigneapp.ui.spt.SptVM;

public class FuroFragment extends Fragment {
    private FuroVM viewModel;
    private SptVM projectViewModel;
    private FragmentFuroBinding binding;
    private int idFuro;

    public FuroFragment() {}

    public FuroFragment(int idFuro) {
        this.idFuro = idFuro;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel = new ViewModelProvider(this).get(FuroVM.class);
        projectViewModel = new ViewModelProvider(requireActivity()).get(SptVM.class);

        ProjetoSpt projeto = projectViewModel.getProjeto();
        viewModel.setFuro(projeto, idFuro);

    }

    @Nullable
    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        binding = FragmentFuroBinding.inflate(inflater, container, false);

        ProjetoSpt projeto = projectViewModel.getProjeto();
        viewModel.setFuro(projeto, idFuro);
        viewModel.updateFurosAdapter(binding.recyclerAmostra);

        return binding.getRoot();
    }

    @Override
    public void onPause() {
        super.onPause();
        projectViewModel.updateProjeto(viewModel.getProjetoSpt());
    }
}