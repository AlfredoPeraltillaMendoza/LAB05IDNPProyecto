package com.example.trabajofinalteoidnp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PinturasAdapter extends RecyclerView.Adapter<PinturasAdapter.PinturaViewHolder> {

    private Context context;

    public PinturasAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public PinturaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pintura, parent, false);
        return new PinturaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PinturaViewHolder holder, int position) {
        holder.bindData(position);
    }

    @Override
    public int getItemCount() {
        // Retorna la cantidad de pinturas
        return context.getResources().getStringArray(R.array.pinturas).length;
    }

    static class PinturaViewHolder extends RecyclerView.ViewHolder {
        TextView nombreTextView;
        TextView descripcionTextView;

        PinturaViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreTextView = itemView.findViewById(R.id.nombreTextView);
            descripcionTextView = itemView.findViewById(R.id.descripcionTextView);
        }

        void bindData(int position) {
            // Establece el nombre y la descripción de la pintura en los TextView
            String[] pinturas = itemView.getContext().getResources().getStringArray(R.array.pinturas);
            String[] descripciones = itemView.getContext().getResources().getStringArray(R.array.descripciones);
            nombreTextView.setText(pinturas[position]);
            descripcionTextView.setText(descripciones[position]);
        }
    }
}