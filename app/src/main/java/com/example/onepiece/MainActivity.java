package com.example.onepiece;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.onepiece.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //TOOLBAR
        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        toolbar.setTitle("ONE PIECE");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        toolbar.setBackground(new ColorDrawable(getResources().getColor(R.color.blueOnePiece)));
        //TOOLBAR END

        //BARRA INFERIOR
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(binding.navigationHost.getId());
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.menuInferior, navController);
        //BARRA INFERIOR END





    }//ONCREATE END



}//MAIN END