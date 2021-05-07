package com.tinytinybites.android.quiz.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import com.tinytinybites.android.quiz.R;
import com.tinytinybites.android.quiz.event.StartNewGameEvent;
import com.tinytinybites.android.quiz.session.GameSession;

public class DashboardActivity extends AppCompatActivity{
    //Tag
    private static final String TAG = DashboardActivity.class.getName();

    //Variables
    private EventBus mEventBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mEventBus = EventBus.getDefault();
        mEventBus.register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mEventBus.unregister(this);
    }

    @Subscribe
    public void OnStartNewGameClicked(StartNewGameEvent event) {
        GameSession.getInstance().resetSession();
        startActivity(new Intent(this, QuizActivity.class));
    }
}
