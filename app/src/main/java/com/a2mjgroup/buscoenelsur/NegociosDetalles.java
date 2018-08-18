package com.a2mjgroup.buscoenelsur;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.a2mjgroup.buscoenelsur.Model.Negocios;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class NegociosDetalles extends AppCompatActivity {

    //We have to add phones and Google Maps

    TextView negocio_name, negocio_direccion, negocio_horarios, negocio_description;
    ImageView img_negocios;
    CollapsingToolbarLayout collapsingToolbarLayout;

    String negociosID;

    FirebaseDatabase database;
    DatabaseReference negocios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negocios_detalles);

        //Calling Firebase
        database = FirebaseDatabase.getInstance();
        negocios = database.getReference("Negocios");

        //Starting view
        negocio_description = (TextView)findViewById(R.id.negocio_description);
        negocio_name = (TextView) findViewById(R.id.negocio_name);
        negocio_direccion=(TextView) findViewById(R.id.negocio_direccion);
        negocio_horarios=(TextView)findViewById(R.id.negocio_horarios);
        img_negocios = (ImageView)findViewById(R.id.img_negocios);

        collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.collapsing);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapseAppBar);

        //Query business data from ID

        if(getIntent() !=null)
            negociosID=getIntent().getStringExtra("NegociosID");
        if(!negociosID.isEmpty()){
            getDetailNegocios(negociosID);
        }

    }

    private void getDetailNegocios(String negociosID){
        negocios.child(negociosID).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Negocios negocios = dataSnapshot.getValue(Negocios.class);

                //Load Image
                Picasso.get().load(negocios.getImage()).into(img_negocios);
                collapsingToolbarLayout.setTitle(negocios.getName());
                negocio_direccion.setText(negocios.getDireccion());
                negocio_name.setText(negocios.getName());
                negocio_horarios.setText(negocios.getHorarios());
                negocio_description.setText(negocios.getDescription());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
