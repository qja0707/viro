/*
 * Copyright © 2018 Viro Media. All rights reserved.
 */
package com.viromedia.bridge.component.node;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class VRTARImageMarkerManager extends VRTNodeManager<VRTARImageMarker> {

    public VRTARImageMarkerManager(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "VRTARImageMarker";
    }

    @Override
    protected VRTARImageMarker createViewInstance(ThemedReactContext reactContext) {
        return new VRTARImageMarker(getContext());
    }

    @ReactProp(name="pauseUpdates", defaultBoolean = false)
    public void setPauseUdpates(VRTARImageMarker arImageMarker, boolean pauseUpdates) {
        // no-op
    }

    @ReactProp(name="target")
    public void setTarget(VRTARImageMarker arImageMarker, String targetName) {
        // no-op
    }

}