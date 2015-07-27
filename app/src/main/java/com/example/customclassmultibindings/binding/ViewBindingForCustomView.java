package com.example.customclassmultibindings.binding;

import com.example.customclassmultibindings.view.CustomView;

import org.robobinding.annotation.ViewBinding;
import org.robobinding.customviewbinding.CustomViewBinding;

/**
 * Created by cheng on 2015/7/26.
 */
@ViewBinding(simpleOneWayProperties = {"customClass"})
public class ViewBindingForCustomView extends CustomViewBinding<CustomView> {
}
