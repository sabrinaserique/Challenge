package br.com.sabrina.serique.challenge.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import br.com.sabrina.serique.challenge.R;
import br.com.sabrina.serique.challenge.constants.Constantes;
import br.com.sabrina.serique.challenge.model.Fundo;

public class DetailActivity extends AppCompatActivity implements Constantes {
    TextView initial_date, full_name, risk, fundy_type, tax, invest, objetivo;
    Button video;
    private Fundo fundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        fundo = (Fundo) ((Bundle) this.getIntent().getParcelableExtra(PARAM_BUNDLE))
                .getSerializable(PARAM_OBJ_FUNDO);

        final String url = fundo.getStrategyVideo().getUrl();

        initial_date = (TextView) findViewById(R.id.tvDI);
        full_name = (TextView) findViewById(R.id.tvFN);
        risk = (TextView) findViewById(R.id.tvR);
        fundy_type = (TextView) findViewById(R.id.tvFT);
        tax = (TextView) findViewById(R.id.tvTAX);
        invest = (TextView) findViewById(R.id.tvInv);
        objetivo = (TextView) findViewById(R.id.tvO);
        video = (Button) findViewById(R.id.button);

        initial_date.setText(fundo.getInitialDate());
        full_name.setText(fundo.getFullName());
        risk.setText(fundo.getSpecification().getFundSuitabilityProfile().getName());
        fundy_type.setText(fundo.getSpecification().getFundType());
        tax.setText(fundo.getTaxClassification());
        invest.setText(fundo.getOperability().getMinimumInitialApplicationAmount());
        objetivo.setText(fundo.getDescription().getObjective());

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

    }
}
