package br.com.sabrina.serique.challenge.adapter;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

import br.com.sabrina.serique.challenge.R;
import br.com.sabrina.serique.challenge.model.Fundo;

public class CustomListAdapter extends BaseAdapter {
    Context context;
    List<Fundo> fundos;

    public CustomListAdapter(Context context, List<Fundo> fundos) {
        this.context = context;
        this.fundos = fundos;
    }

    @Override
    public int getCount() {
        return fundos.size();
    }

    @Override
    public Fundo getItem(int i) {
        return this.fundos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            view= LayoutInflater.from(context).inflate(R.layout.fundos_data_list,viewGroup,false);
        }

        TextView fundoFullName = (TextView) view.findViewById(R.id.tvFullName);


        Fundo funds = this.fundos.get(i);
        String fullName = funds.getSimpleName();

        fundoFullName.setText(fullName);

        return view;
    }
}
