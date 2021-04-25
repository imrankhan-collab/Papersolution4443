package com.mids.paper_solution4443.Question9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

import com.mids.paper_solution4443.R;

public class Question_9 extends AppCompatActivity {
    private RecyclerView recyclerHouses;
    private List<House> houseList;
    private HouseAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerHouses = findViewById(R.id.recyclerHouses);
        loadHouses();
    }
    private void loadHouses() {
        houseList = new ArrayList<>();
        houseList.add(new House("PKR 17 Lac - 8.1 Crore", "River Courtyard", "Bahria Town Rawalpindi, Islamabad",
                "Houses", "1211.00 - 317.00 Sq.Ft"));
        houseList.add(new House("PKR 12 Lac - 2.1 Crore", "River Courtyard", "Bahria Town Rawalpindi, Islamabad",
                "Houses", "3281.00 - 317.00 Sq.Ft"));
        houseList.add(new House("PKR 52 Lac - 1.6 Crore", "River Courtyard", "Bahria Town Rawalpindi, Multan", "Houses",
                "1201.00 - 317.00 Sq.Ft"));
        houseList.add(new House("PKR 89 Lac - 5.1 Crore", "River Courtyard", "Bahria Town Rawalpindi, Karachi", "Houses",
                "2231.00 - 317.00 Sq.Ft"));
        adapter = new HouseAdapter(Question_9.this, houseList);
        recyclerHouses.setAdapter(adapter);
    }
}