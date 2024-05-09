package com.example.final_bottom_nav.ui.notifications;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.final_bottom_nav.R;
import com.example.final_bottom_nav.databinding.FragmentNotificationsBinding;

import java.util.ArrayList;
import java.util.HashSet;


public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;
    private ArrayList<String> wordList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        EditText editText = binding.editText;
        Button addButton = binding.addButton;
        ListView listView = binding.listView;
        Button deleteButton = binding.deleteButton;

        wordList = new ArrayList<>();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, wordList);
        listView.setAdapter(arrayAdapter);

        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        wordList.clear();
        wordList.addAll(sharedPref.getStringSet("wordList", new HashSet<String>()));
        arrayAdapter.notifyDataSetChanged();


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word = editText.getText().toString().trim();
                if (!word.isEmpty()) {
                    wordList.add(word);
                    editText.setText("");
                    arrayAdapter.notifyDataSetChanged();
                    editText.setText("");
                }
            }
        });


        deleteButton.setOnClickListener(new View.OnClickListener() {
          @Override
           public void onClick(View v) {
               String getname = editText.getText().toString();
                 for (int i = 0; i < wordList.size(); i++) {
                  if (wordList.get(i).equals(getname)) {
                     wordList.remove(i);
                     editText.setText("");
                     arrayAdapter.notifyDataSetChanged();
                       break;
                  }
             }
           }
       });

        //final TextView textView = binding.textNotifications;
        //notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
        HashSet<String> set = new HashSet<>(wordList);
        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putStringSet("wordList", set);
        editor.apply();
    }
}