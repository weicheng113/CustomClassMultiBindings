package com.example.customclassmultibindings.viewmodel;

import com.example.customclassmultibindings.binding.CustomClass;

import org.robobinding.annotation.PresentationModel;

/**
 * Created by cheng on 2015/7/26.
 */
@PresentationModel
public class MainPresentationModel {
    private CustomClass customClass1;
    private CustomClass customClass2;

    public MainPresentationModel() {
        customClass1 = new CustomClass();
        customClass1.property1 = "customClass1.property1";
        customClass1.property2 = "customClass1.property2";

        customClass2 = new CustomClass();
        customClass2.property1 = "customClass2.property1";
        customClass2.property2 = "customClass2.property2";
    }

    public CustomClass getCustomClass1() {
        return customClass1;
    }

    public CustomClass getCustomClass2() {
        return customClass2;
    }
}
