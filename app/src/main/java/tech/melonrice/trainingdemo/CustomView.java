package tech.melonrice.trainingdemo;

import android.content.Context;
import android.view.View;

public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
