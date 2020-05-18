package com.vegabond.pkgalaxy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class LinksFragment extends Fragment {


    String title = "Title";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_links, container, false);
        MyListData[] myListData = new MyListData[] {
                new MyListData("mailto:dce.pks@gmail.com", R.drawable.gmail),
                new MyListData("https://www.facebook.com/pk101997", R.drawable.facebook),
                new MyListData("https://www.instagram.com/praveen101997", R.drawable.instagram),
                new MyListData("https://twitter.com/PRAVEEN89183724", R.drawable.twitter),
                new MyListData("https://linkedin.com/in/praveen-sharma-7a2143170/", R.drawable.linkedin),
                new MyListData("https://github.com/Praveen101997", R.drawable.github),
                new MyListData("https://www.kaggle.com/praveen101997", R.drawable.kaggle),
                new MyListData("https://www.codechef.com/users/praveen1097", R.drawable.codechef),
                new MyListData("https://codeforces.com/profile/pk1997", R.drawable.codeforce),
                new MyListData("https://www.interviewbit.com/profile/praveen-sharma_836", R.drawable.interviewbit)
        };

        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        getActivity().setTitle(title);
        return root;
    }


}
