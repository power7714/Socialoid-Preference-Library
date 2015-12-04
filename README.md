[![Build Status](https://travis-ci.org/power7714/Socialoid-Preference-Library.svg?branch=master)](https://travis-ci.org/power7714/Socialoid-Preference-Library)

[![Download](https://api.bintray.com/packages/power7714/maven/Socialoid/images/download.svg)](https://bintray.com/power7714/maven/Socialoid/_latestVersion)

[![Flattr this git repo](http://api.flattr.com/button/flattr-badge-large.png)](https://flattr.com/submit/auto?user_id=power7714&url=https://github.com/power7714/Socialoid-Preference-Library&title=Socialoid-Preference-Library&language=&tags=github&category=software)


# Socialoid-Preference-Library

Custom preference view for preference screens on Android. Each social icon is selectable in the normal view. If the user clicks on the title, the
dialog appears which is also clickable. Each social icon is programmed to open in the corresponding app or in the browser if the app isn't present.
Including this library into your preference screen layout is very easy. See screenshots below.

**Min api level = 15**

# Add to dependencies
- Add this to your projects build.gradle(module:YOUR_APP)
```xml
    compile 'com.curtrostudios.socialoidlibrary:socialoidlibrary:1.0.3'
```

# Usage
- Add this to the top of your preference screen:
```xml
		xmlns:app="http://schemas.android.com/apk/res-auto"
```
- Then add this to your settings:
```xml
        <com.curtrostudios.socialoidlibrary.SocialoidPref
        android:enabled="true"
        app:gplus="https://plus.google.com/YOUR_GOOGLE_PLUS_PAGE_ID_NUMBER"
        app:ytube="http://www.youtube.com/user/YOUR_YOUTUBE_USERNAME"
        app:twit="twitter://user?screen_name=YOUR_TWITTER_USERNAME_HERE"
        app:twit2="https://twitter.com/intent/user?screen_name=YOUR_TWITTER_USERNAME_HERE"
        app:fb="fb://profile/FACEBOOK_USERNAME_HERE"
        app:fb2="https://facebook.com/FACEBOOK_USERNAME_HERE"
        app:titleDef="YOUR_CUSTOM_TITLE_HERE"
        app:dialogTitle="YOUR_TITLE_FOR_THE_DIALOG" />
```

        
Screenshots
------------
![main](https://raw.github.com/power7714/Socialoid-Preference-Library/master/screenshot1.png)![other](https://raw.github.com/power7714/Socialoid-Preference-Library/master/screenshot2.png)
