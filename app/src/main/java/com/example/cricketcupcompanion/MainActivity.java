package com.example.cricketcupcompanion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Team> teams;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);



        teams = new ArrayList<>();
        addToTeams(teams);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        Adapter teamAdapter = new Adapter(teams );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(teamAdapter);



    }

    public void addToTeams(ArrayList<Team> teams){
        teams.add(new Team(R.drawable.india_flag, "INDIA"));
        teams.add(new Team(R.drawable.england_flag, "ENGLAND"));
        teams.add(new Team(R.drawable.new_zealand_flag, "NEW ZEALAND"));
        teams.add(new Team(R.drawable.pakistan_flag, "PAKISTAN"));
        teams.add(new Team(R.drawable.australia_flag, "AUSTRALIA"));
        teams.add(new Team(R.drawable.bangladesh_flag, "BANGLADESH"));
        teams.add(new Team(R.drawable.afghanistan_flag, "AFGHANISTAN"));
        teams.add(new Team(R.drawable.south_africa_flag, "SOUTH AFRICA"));
    }

}