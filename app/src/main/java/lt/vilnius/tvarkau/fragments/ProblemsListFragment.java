package lt.vilnius.tvarkau.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import lt.vilnius.tvarkau.R;
import lt.vilnius.tvarkau.factory.DummyProblems;
import lt.vilnius.tvarkau.views.adapters.ProblemsListAdapter;

/**
 * Created by Karolis Vycius on 2016-01-13.
 */
public class ProblemsListFragment extends Fragment {

    public static ProblemsListFragment getInstance() {
        return new ProblemsListFragment();
    }

    @Bind(R.id.problem_list) RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.problem_list, container, false);

        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerView.setAdapter(new ProblemsListAdapter(getContext(), DummyProblems.getProblems()));

    }
}
