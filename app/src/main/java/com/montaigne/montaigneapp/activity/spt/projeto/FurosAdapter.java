package com.montaigne.montaigneapp.activity.spt.projeto;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FurosAdapter extends RecyclerView.Adapter<FurosAdapter.ViewHolder> {
    protected ArrayList<String> furos;
    protected final Context context;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_projeto_categoria, parent, false);
        //return new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(furos.get(position));
        // todo: passar o intent com listners por aqui. Pode passar com uma lista de intents
    }

    @Override
    public int getItemCount() {
        return furos.size();
    }

    public FurosAdapter(Context context) {
        this.context = context;
    }

    public void setFuros(ArrayList<String> furos) {
        this.furos = furos;
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{
        protected final CheckBox checkBox;
        protected final TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = null;
            checkBox = null;
        }
    }
}
