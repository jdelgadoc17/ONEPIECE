package com.example.onepiece;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onepiece.databinding.FragmentFragmentoLauncherBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FragmentoLauncher extends Fragment {
    // Variable para el binding del fragmento
    private FragmentFragmentoLauncherBinding binding;

    public FragmentoLauncher() {
        // Constructor vacío requerido
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFragmentoLauncherBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.viewpager.setAdapter(new FragmentStateAdapter(this) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                switch (position) {
                    case 0:
                        return new FragmentoPiratas();
                    case 1:
                        return new FragmentoMarines();
                    case 2:
                        return new FragmentoRevolucionarios();
                    default:
                        return new FragmentoPiratas();
                }
            }

            @Override
            public int getItemCount() {
                return 3;
            }
        });



        new TabLayoutMediator(binding.tab, binding.viewpager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Piratas");
                        break;
                    case 1:
                        tab.setText("Marines");
                        break;
                    case 2:
                        tab.setText("Revolucionarios");
                        break;
                }
            }
        }).attach();

    }//ONVIEWCREATED END


}