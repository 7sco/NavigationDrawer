package com.example.franciscoandrade.navigationdrawer;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FormularioFragment extends Fragment {

    TextView title;
    private Typeface script;
    EditText edTxt;
    Button btnForm;



    View view;


    public FormularioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_formulario, container, false);

        title =(TextView)view.findViewById(R.id.title);
        edTxt=(EditText)view.findViewById(R.id.edText);
        btnForm= (Button)view.findViewById(R.id.btnForm);


        String fuente="Roboto-Black.ttf";

        this.script= Typeface.createFromAsset(getActivity().getAssets(),fuente );
        title.setTypeface(script);

        btnForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(!edTxt.getText().toString().isEmpty()){
                    title.setText(edTxt.getText().toString().toUpperCase());
                    edTxt.setText("");
                }
                else {
                    title.setText("FORMULARIO");
                }

            }
        });


        // Inflate the layout for this fragment
        return view;
    }

}
