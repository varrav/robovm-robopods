# Google Mobile Ads Consent SDK


## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party framework manually:

1. Put the `PersonalizedAdConsent.framework` folder in your iOS project's `libs/` folder
2. Add the following to your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>PersonalizedAdConsent</framework>
    </frameworks>
</config>
```

3. Put `PersonalizedAdConsent.bundle` into app resouce folder (see your `robovm.xml` `<resources>` tag)
4. Add java sources to your project
5. Read the official Google Mobile Ads Consent SDK iOS documentation: [Link](https://developers.google.com/admob/ios/eu-consent)
