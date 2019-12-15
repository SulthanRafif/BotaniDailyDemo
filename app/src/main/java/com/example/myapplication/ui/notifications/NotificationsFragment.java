package com.example.myapplication.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;
import com.example.myapplication.ui.notifications.TanamahHiasBatang.TanamanHiasBatangActivity;
import com.example.myapplication.ui.notifications.TanamanHiasAkar.TanamanHiasAkarActivity;
import com.example.myapplication.ui.notifications.TanamanHiasBuah.TanamanHiasBuahActivity;
import com.example.myapplication.ui.notifications.TanamanHiasBunga.TanamanHiasBungaActivity;
import com.example.myapplication.ui.notifications.TanamanHiasDaun.TanamanHiasDaunActivity;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        notificationsViewModel =
//                ViewModelProviders.of(this).get(NotificationsViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
//        final TextView textView = root.findViewById(R.id.text_notifications);
//        notificationsViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;

        View view = inflater.inflate(R.layout.fragment_notifications,
                container, false);


        ImageView button = (ImageView) view.findViewById(R.id.bunga_kategori);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), TanamanHiasBungaActivity.class);
                startActivity(intent);
            }
        });

        TextView text = (TextView) view.findViewById(R.id.tanaman_hias_bunga);
        text.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), TanamanHiasBungaActivity.class);
                startActivity(intent);
            }
        });



        ImageView button2 = (ImageView) view.findViewById(R.id.daun_kategori);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), TanamanHiasDaunActivity.class);
                startActivity(intent);
            }
        });

        TextView text2 = (TextView) view.findViewById(R.id.tanaman_hias_daun);
        text2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), TanamanHiasDaunActivity.class);
                startActivity(intent);
            }
        });



        ImageView button3 = (ImageView) view.findViewById(R.id.batang_kategori);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), TanamanHiasBatangActivity.class);
                startActivity(intent);
            }
        });

        TextView text3 = (TextView) view.findViewById(R.id.tanaman_hias_batang);
        text3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), TanamanHiasBatangActivity.class);
                startActivity(intent);
            }
        });



        ImageView button4 = (ImageView) view.findViewById(R.id.buah_kategori);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), TanamanHiasBuahActivity.class);
                startActivity(intent);
            }
        });

        TextView text4 = (TextView) view.findViewById(R.id.tanaman_hias_buah);
        text4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), TanamanHiasBuahActivity.class);
                startActivity(intent);
            }
        });


        ImageView button5 = (ImageView) view.findViewById(R.id.akar_kategori);
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), TanamanHiasAkarActivity.class);
                startActivity(intent);
            }
        });

        TextView text5 = (TextView) view.findViewById(R.id.tanaman_hias_akar);
        text5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), TanamanHiasAkarActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}