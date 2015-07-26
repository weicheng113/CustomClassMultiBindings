package com.example.customclassmultibindings;

import org.robobinding.annotation.ViewBinding;
import org.robobinding.customviewbinding.CustomViewBinding;

/**
 * Created by cheng on 2015/7/26.
 */
@ViewBinding(simpleOneWayProperties = {"customClass"})
public class ViewBindingForCustomView extends CustomViewBinding<CustomView> {
}
