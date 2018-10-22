/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.flurry.analytics;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FlurryConsent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FlurryConsentPtr extends Ptr<FlurryConsent, FlurryConsentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FlurryConsent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FlurryConsent() {}
    protected FlurryConsent(Handle h, long handle) { super(h, handle); }
    protected FlurryConsent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithGDPRScope:andConsentStrings:")
    public FlurryConsent(boolean isGDPRScope, NSDictionary<?, ?> consentStrings) { super((SkipInit) null); initObject(initWithGDPRScope$andConsentStrings$(isGDPRScope, consentStrings)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isGDPRScope")
    public native boolean isGDPRScope();
    @Property(selector = "consentStrings")
    public native NSDictionary<?, ?> getConsentStrings();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithGDPRScope:andConsentStrings:")
    protected native @Pointer long initWithGDPRScope$andConsentStrings$(boolean isGDPRScope, NSDictionary<?, ?> consentStrings);
    @Method(selector = "updateConsentInformation:")
    public static native boolean updateConsentInformation(FlurryConsent consent);
    @Method(selector = "getConsent")
    public static native FlurryConsent getConsent();
    /*</methods>*/
}
