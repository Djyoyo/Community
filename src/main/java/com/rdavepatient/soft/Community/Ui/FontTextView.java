package com.rdavepatient.soft.Community.Ui;

import android.content.Context;
import android.util.AttributeSet;

public class FontTextView extends android.support.v7.widget.AppCompatTextView {
    private Context context;

    public FontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.context = context;
        //init();
    }

    public FontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.context = context;
        //init();
    }

    public FontTextView(Context context) {
        super(context);
        this.context = context;
        //init();
    }

//    private void init() {
//        setTypeface(Typeface.createFromAsset(this.context.getAssets(), "RobotoCondensedRegular.ttf"));
//    }
}
