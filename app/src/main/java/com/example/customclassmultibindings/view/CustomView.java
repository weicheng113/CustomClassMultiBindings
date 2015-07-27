package com.example.customclassmultibindings.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.customclassmultibindings.R;
import com.example.customclassmultibindings.binding.CustomClass;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
public class CustomView extends LinearLayout {
    private TextView prop1;
    private TextView prop2;

    public CustomView(Context context, AttributeSet attrs) {
		this(context, attrs, R.layout.custom_view);
    }

    protected CustomView(Context context, AttributeSet attrs, int layoutId) {
		super(context, attrs);

		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(layoutId, this);
		prop1 = (TextView) findViewById(R.id.prop1);
		prop2 = (TextView) findViewById(R.id.prop2);
    }

    public void setCustomClass(CustomClass customClass) {
		if(customClass != null) {
			prop1.setText(customClass.property1);
			prop2.setText(customClass.property2);
		}
    }
}
