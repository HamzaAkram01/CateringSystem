package com.example.cateringsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class EstimationActivity extends AppCompatActivity {
    Spinner spinner;
    public static TextView val1,val2,val3 ,val4;

    String[] events ={"Mehndii(100 Person)","Mehndii(200 Person)","Mehndii(300 Person)","Mehndii(400 Person)","Mehndii(500 Person)",
            "Mayoo(100 Person)","Mayoo(200 Person)","Mayoo(300 Person)","Mayoo(400 Person)","Mayoo(500 Person)",
            "Nikkah(100 Person)","Nikkah(200 Person)","Nikkah(300 Person)","Nikkah(400 Person)","Nikkah(500 Person)"};

    RecyclerView recyclerView;
    tableAdapter adapter;
    ArrayList<tableModel> tablelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimation);

        recyclerView = findViewById(R.id.tablerecycle);
        tablelist = new ArrayList<>();
        val1 = (TextView) findViewById(R.id.discount);
        val2 = (TextView) findViewById(R.id.amount);
        val3 = (TextView) findViewById(R.id.afterdis);
        val4 = (TextView) findViewById(R.id.listview);


        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(EstimationActivity.this,android.R.layout.simple_spinner_item,events);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @java.lang.SuppressWarnings("ResourceType")
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value = parent.getItemAtPosition(position).toString();
                Toast.makeText(EstimationActivity.this,events[position],Toast.LENGTH_SHORT).show();

                if(position == 0){
                    tablelist.clear();
                    val4.setText("Mehndi(100 Person)");
                    tablelist.add(new tableModel("1", "750", "110 kg", "Malai Boti","25600"));
                    tablelist.add(new tableModel("2", "850", "90 kg", "Mutton Korma","86920"));
                    tablelist.add(new tableModel("3", "40", "1500", "Naan","6000"));
                    tablelist.add(new tableModel("4", "180", "150", "7up","22500"));
                    tablelist.add(new tableModel("5", "150", "50 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "50 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50 kg", "Lmaoo","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("10500");
                    val2.setText("400150");
                    val3.setText("396150");


                }
                if(position == 1){
                    tablelist.clear();
                    val4.setText("Mehndi(200 Person)");
                    tablelist.add(new tableModel("1", "850", "100 kg", "Tikka Boti","22500"));
                    tablelist.add(new tableModel("2", "950", "90 kg", "Beef Korma","76920"));
                    tablelist.add(new tableModel("3", "30", "1500", "Chapati","2500"));
                    tablelist.add(new tableModel("4", "180", "150", "coca cola","22500"));
                    tablelist.add(new tableModel("5", "150", "70 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "150 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50", "Limka","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("66534");
                    val2.setText("504860");
                    val3.setText("498150");


                }
                if(position == 2){
                    tablelist.clear();
                    val4.setText("Mehndi(300 Person)");
                    tablelist.add(new tableModel("1", "150", "110 kg", "Salad Bar","25600"));
                    tablelist.add(new tableModel("2", "150", "90 kg", "Coffee","86920"));
                    tablelist.add(new tableModel("3", "140", "1500", "lamp karahi","6000"));
                    tablelist.add(new tableModel("4", "180", "150", "7up","22500"));
                    tablelist.add(new tableModel("5", "150", "50 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "50 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50 kg", "Lmaoo","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("15412");
                    val2.setText("600500");
                    val3.setText("2115458");


                }
                if(position == 3){
                    tablelist.clear();
                    val4.setText("Mehndi(400 Person)");
                    tablelist.add(new tableModel("1", "750", "110 kg", "Malai Boti","25600"));
                    tablelist.add(new tableModel("2", "850", "90 kg", "Mutton Korma","86920"));
                    tablelist.add(new tableModel("3", "40", "1500", "Naan","6000"));
                    tablelist.add(new tableModel("4", "180", "150", "7up","22500"));
                    tablelist.add(new tableModel("5", "150", "50 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "50 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50 kg", "Lmaoo","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("10500");
                    val2.setText("400150");
                    val3.setText("396150");


                }
                if(position == 4){
                    tablelist.clear();
                    val4.setText("Mehndi(500 Person)");
                    tablelist.add(new tableModel("1", "850", "100 kg", "Tikka Boti","22500"));
                    tablelist.add(new tableModel("2", "950", "90 kg", "Beef Korma","76920"));
                    tablelist.add(new tableModel("3", "30", "1500", "Chapati","2500"));
                    tablelist.add(new tableModel("4", "180", "150", "coca cola","22500"));
                    tablelist.add(new tableModel("5", "150", "70 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "150 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50", "Limka","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("50000");
                    val2.setText("501150");
                    val3.setText("498150");


                }
                if(position == 5){
                    tablelist.clear();
                    val4.setText("Mayoo(100 Person)");
                    tablelist.add(new tableModel("1", "150", "110 kg", "Salad Bar","25600"));
                    tablelist.add(new tableModel("2", "150", "90 kg", "Coffee","86920"));
                    tablelist.add(new tableModel("3", "140", "1500", "lamp karahi","6000"));
                    tablelist.add(new tableModel("4", "180", "150", "7up","22500"));
                    tablelist.add(new tableModel("5", "150", "50 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "50 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50 kg", "Lmaoo","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("35450");
                    val2.setText("600500");
                    val3.setText("560050");


                }
                if(position == 6){
                    tablelist.clear();
                    val4.setText("Mayoo(200 Person)");
                    tablelist.add(new tableModel("1", "850", "100 kg", "Tikka Boti","22500"));
                    tablelist.add(new tableModel("2", "950", "90 kg", "Beef Korma","76920"));
                    tablelist.add(new tableModel("3", "30", "1500", "Chapati","2500"));
                    tablelist.add(new tableModel("4", "180", "150", "coca cola","22500"));
                    tablelist.add(new tableModel("5", "150", "70 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "150 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50", "Limka","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("50000");
                    val2.setText("501150");
                    val3.setText("498150");

                }
                if(position == 7){
                    tablelist.clear();
                    val4.setText("Mayoo(300 Person)");
                    tablelist.add(new tableModel("1", "150", "110 kg", "Salad Bar","25600"));
                    tablelist.add(new tableModel("2", "150", "90 kg", "Coffee","86920"));
                    tablelist.add(new tableModel("3", "140", "1500", "lamp karahi","6000"));
                    tablelist.add(new tableModel("4", "180", "150", "7up","22500"));
                    tablelist.add(new tableModel("5", "150", "50 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "50 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50 kg", "Lmaoo","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("30000");
                    val2.setText("600500");
                    val3.setText("560050");

                }
                if(position == 8){
                    tablelist.clear();
                    val4.setText("Mayoo(400 Person)");
                    tablelist.add(new tableModel("1", "750", "110 kg", "Malai Boti","25600"));
                    tablelist.add(new tableModel("2", "850", "90 kg", "Mutton Korma","86920"));
                    tablelist.add(new tableModel("3", "40", "1500", "Naan","6000"));
                    tablelist.add(new tableModel("4", "180", "150", "7up","22500"));
                    tablelist.add(new tableModel("5", "150", "50 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "50 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50 kg", "Lmaoo","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("155540");
                    val2.setText("400150");
                    val3.setText("1548578");

                }
                if(position == 9){
                    tablelist.clear();
                    val4.setText("Mayoo(500 Person)");
                    tablelist.add(new tableModel("1", "750", "110 kg", "Malai Boti","25600"));
                    tablelist.add(new tableModel("2", "850", "90 kg", "Mutton Korma","86920"));
                    tablelist.add(new tableModel("3", "40", "1500", "Naan","6000"));
                    tablelist.add(new tableModel("4", "180", "150", "7up","22500"));
                    tablelist.add(new tableModel("5", "150", "50 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "50 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50 kg", "Lmaoo","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("10500");
                    val2.setText("400150");
                    val3.setText("396150");


                }
                if(position == 10){
                    tablelist.clear();
                    val4.setText("Nikkah(100 Person)");
                    tablelist.add(new tableModel("1", "850", "100 kg", "Tikka Boti","22500"));
                    tablelist.add(new tableModel("2", "950", "90 kg", "Beef Korma","76920"));
                    tablelist.add(new tableModel("3", "30", "1500", "Chapati","2500"));
                    tablelist.add(new tableModel("4", "180", "150", "coca cola","22500"));
                    tablelist.add(new tableModel("5", "150", "70 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "150 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50", "Limka","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("50000");
                    val2.setText("501150");
                    val3.setText("498150");


                }
                if(position == 11){
                    tablelist.clear();
                    val4.setText("Nikkah(200 Person)");
                    tablelist.add(new tableModel("1", "150", "110 kg", "Salad Bar","25600"));
                    tablelist.add(new tableModel("2", "150", "90 kg", "Coffee","86920"));
                    tablelist.add(new tableModel("3", "140", "1500", "lamp karahi","6000"));
                    tablelist.add(new tableModel("4", "180", "150", "7up","22500"));
                    tablelist.add(new tableModel("5", "150", "50 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "50 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50 kg", "Lmaoo","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("30000");
                    val2.setText("600500");
                    val3.setText("560050");


                }
                if(position == 12){
                    tablelist.clear();
                    val4.setText("Nikkah(300 Person)");
                    tablelist.add(new tableModel("1", "850", "100 kg", "Tikka Boti","22500"));
                    tablelist.add(new tableModel("2", "950", "90 kg", "Beef Korma","76920"));
                    tablelist.add(new tableModel("3", "30", "1500", "Chapati","2500"));
                    tablelist.add(new tableModel("4", "180", "150", "coca cola","22500"));
                    tablelist.add(new tableModel("5", "150", "70 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "150 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50", "Limka","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("50000");
                    val2.setText("501150");
                    val3.setText("498150");

                }
                if(position == 13){
                    tablelist.clear();
                    val4.setText("Nikkah (400 Person)");
                    tablelist.add(new tableModel("1", "150", "110 kg", "Salad Bar","25600"));
                    tablelist.add(new tableModel("2", "150", "90 kg", "Coffee","86920"));
                    tablelist.add(new tableModel("3", "140", "1500", "lamp karahi","6000"));
                    tablelist.add(new tableModel("4", "180", "150", "7up","22500"));
                    tablelist.add(new tableModel("5", "150", "50 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "50 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50 kg", "Lmaoo","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("30000");
                    val2.setText("600500");
                    val3.setText("560050");

                }
                if(position == 14){
                    tablelist.clear();
                    val4.setText("Nikkah (500 Person)");
                    tablelist.add(new tableModel("1", "750", "110 kg", "Malai Boti","25600"));
                    tablelist.add(new tableModel("2", "850", "90 kg", "Mutton Korma","86920"));
                    tablelist.add(new tableModel("3", "40", "1500", "Naan","6000"));
                    tablelist.add(new tableModel("4", "180", "150", "7up","22500"));
                    tablelist.add(new tableModel("5", "150", "50 kg", "Kheer","7500"));
                    tablelist.add(new tableModel("6", "150", "50 kg", "Biryani","15000"));
                    tablelist.add(new tableModel("7", "40", "1500", "Zarkar Boti","6000"));
                    tablelist.add(new tableModel("8", "180", "150", "Coffee","22500"));
                    tablelist.add(new tableModel("9", "150", "50 kg", "Lmaoo","7500"));

                    adapter = new tableAdapter(getApplication(), tablelist);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
                    recyclerView.setHasFixedSize(true);

                    val1.setText("10500");
                    val2.setText("400150");
                    val3.setText("396150");

                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
    public void back_button(View view){
        Intent intent = new Intent(EstimationActivity.this, MainDashboardActivity.class);
        startActivity(intent);

    }
}