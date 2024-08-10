package com.applicationname.studentcourseguide;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;



public class Listviewnumcs extends AppCompatActivity {
    ListView l;
    ArrayAdapter adapter;
    SearchView searchView;
    String lectures[] = { "Bisector Method","Newton_Rahpson Method","Secant Method","Guass Elimination method","Forward Interpolation","Backward Interpolation","Langrange Interpolation","Newton Divider Difference","Jacobi Method","Seidal Method","ForwardDifferentiation","BackwardDifferentiation","Trapozeidal Method","Simpson's 1/3","Eular Method","Modified Eular Method","Improved Eular Method","RK4"  };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewnumcs);
        l = findViewById(R.id.list);
        searchView=findViewById(R.id.search);
        adapter= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, lectures);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent =new Intent( Listviewnumcs.this, show_numcs_images.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent =new Intent( Listviewnumcs.this, Newton_Raphson.class);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent =new Intent( Listviewnumcs.this,Secantmethod.class);
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent =new Intent( Listviewnumcs.this,Guassemilmnation.class);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent =new Intent( Listviewnumcs.this,Forwardinterpolation.class);
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent =new Intent(Listviewnumcs.this,Backwardinterpolation.class);
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent =new Intent( Listviewnumcs.this,LangrangeInterpolation.class);
                    startActivity(intent);
                }
                if(i==7){
                    Intent intent =new Intent( Listviewnumcs.this,newton_Divider_difference.class);
                    startActivity(intent);
                }
                if(i==8){
                    Intent intent =new Intent(Listviewnumcs.this,Jacobi.class);
                    startActivity(intent);
                }
                if(i==9){
                    Intent intent =new Intent( Listviewnumcs.this,Seidal.class);
                    startActivity(intent);
                }
                if(i==10){
                    Intent intent =new Intent(Listviewnumcs.this,forwardint.class);
                    startActivity(intent);
                }
                if(i==11){
                    Intent intent =new Intent( Listviewnumcs.this,backwarddifferentiation.class);
                    startActivity(intent);
                }
                if(i==12){
                    Intent intent =new Intent( Listviewnumcs.this,Trapozeidal.class);
                    startActivity(intent);
                }
                if(i==13){
                    Intent intent =new Intent( Listviewnumcs.this,Simpson.class);
                    startActivity(intent);
                }
                if(i==14){
                    Intent intent =new Intent( Listviewnumcs.this,Eular.class);
                    startActivity(intent);
                }
                if(i==15){
                    Intent intent =new Intent( Listviewnumcs.this,ModifiedEular.class);
                    startActivity(intent);
                }
                if(i==16){
                    Intent intent =new Intent( Listviewnumcs.this,ImprovedEular.class);
                    startActivity(intent);
                }
                if(i==17){
                    Intent intent =new Intent(Listviewnumcs.this,rk4.class);
                    startActivity(intent);
                }
            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Listviewnumcs.this.adapter.getFilter().filter(s);
                return false;
            }
            @Override
            public boolean onQueryTextChange(String s) {
                Listviewnumcs.this.adapter.getFilter().filter(s);
                return false;
            }
        });
    }
}