package com.geno.cstimerpack;

import android.os.Bundle;
import org.apache.cordova.*;

public class cordovaExample extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl(Config.getStartUrl());
    }
}

