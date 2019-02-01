# Time Range Picker


DateTime Picker tries to offer you the date and time pickers as shown in IOS, with an easy themable API. 
Support for Android 4.1 and up. (Android 4.0 was supported until 3.6.4)
Feel free to fork or issue pull requests on github. Issues can be reported on the github issue tracker.

<b>Please contribute  your improvements!</b>

![Time Picker](https://github.com/dvird/timerangepicker/blob/master/example-image/ios12-iphone-x-clock-bedtime-social-card.jpg?raw=true)






Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
		implementation 'com.github.User:Repo:Tag'
	}
  
That's it! The first time you request a project JitPack checks out the code, builds it and serves the build artifacts (jar, aar).

If the project doesn't have any GitHub Releases you can use the short commit hash or 'master-SNAPSHOT' as the version.
