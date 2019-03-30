package ru.makproductions.cyclefragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import timber.log.Timber;

public class Fragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout,container);
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Timber.e("onDetach");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Timber.e("onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Timber.e("onDestroyView");
    }

    @Override
    public void onStop() {
        super.onStop();
        Timber.e("onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Timber.e("onPause");
    }

    @Override
    public void onResume() {
        super.onResume();
        Timber.e("onResume");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Timber.e("onSaveInstanceState");
    }

    @Override
    public void onStart() {
        super.onStart();
        Timber.e("onStart");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Timber.e("onViewStateRestored");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Timber.e("onActivityCreated");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Timber.e("onViewCreated");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.e("onCreate");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Timber.e("onAttach");
    }

    @Override
    public void onAttachFragment(android.support.v4.app.Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Timber.e("onAttachFragment");
    }

    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
        Timber.e("onInflate");
    }
}
