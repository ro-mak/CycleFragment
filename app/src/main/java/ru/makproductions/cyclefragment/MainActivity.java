package ru.makproductions.cyclefragment;

import android.content.Context;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Timber.plant(new Timber.DebugTree());
        Timber.e("Activity first OnCreate protected");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Timber.e("Activity second OnCreate public");
    }

    @Override
    public void onActionModeStarted(ActionMode mode) {
        super.onActionModeStarted(mode);
        Timber.e("Activity OnActionModeStarted");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Timber.e("Activity OnSaveInstanceState");
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Timber.e("Activity OnPostCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Timber.e("Activity OnRestart");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Timber.e("Activity first OnRestoreInstanceState public");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Timber.e("Activity second OnRestoreInstanceState protected");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Timber.e("Activity onAttachFragment");
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        Timber.e("Activity first onCreateView");
        return super.onCreateView(name, context, attrs);

    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        Timber.e("Activity second onCreateView");
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Timber.e("Activity onSaveInstanceState protected");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onResumeFragments() {
        Timber.e("Activity OnResumeFragments");
        super.onResumeFragments();
    }

    @Override
    protected void onResume() {
        Timber.e("Activity onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Timber.e("Activity protected onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Timber.e("Activity protected onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Timber.e("Activity protected onStop");
        super.onStop();
    }

    @Override
    protected void onStart() {
        Timber.e("Activity protected onStart");
        super.onStart();
    }

    @Override
    protected void onPostResume() {
        Timber.e("Activity protected onPostResume");
        super.onPostResume();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        Timber.e("Activity protected onPostCreate");
        super.onPostCreate(savedInstanceState);
    }
}
