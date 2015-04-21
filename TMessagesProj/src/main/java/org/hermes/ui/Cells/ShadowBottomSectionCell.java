/*
 * This is the source code of Hermes for Android v. 1.7.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Umang Raghuvanshi, 2015.
 */

package org.hermes.ui.Cells;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import org.hermes.android.AndroidUtilities;
import org.hermes.messenger.R;

public class ShadowBottomSectionCell extends View {

    private void init() {
        setBackgroundResource(R.drawable.greydivider_bottom);
    }

    public ShadowBottomSectionCell(Context context) {
        super(context);
        init();
    }

    public ShadowBottomSectionCell(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ShadowBottomSectionCell(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public ShadowBottomSectionCell(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(6), MeasureSpec.EXACTLY));
    }
}
