# Time Range Picker

Eartho License
<br /><br />
<a href='https://one.eartho.world/connect?access_id=DIH1cmqSEXZTtZGd8Xpb' target='_blank'>
 <img src="https://github.com/dvird/timerangepicker/blob/master/images/Button.png?raw=true" alt="Eartho" width="300px">
</a>
<br />
<br /><br />
DateTime Picker tries to offer you the date and time pickers as shown in IOS, with an easy themable API. 
Support for Android 4.1 and up. (Android 4.0 was supported until 3.6.4)
Feel free to fork or issue pull requests on github. Issues can be reported on the github issue tracker.

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
		implementation 'https://github.com/dvird:timerangepicker:master-SNAPSHOT'
	}
  
That's it! 





Its fully customized

	  <com.timesliderrangepicker.library.TimeSliderRangePicker
		android:layout_width="300dp"
		android:layout_height="300dp"
		android:layout_margin="40dp"
		android:layout_marginBottom="8dp"
		android:padding="15dp"
		app:arc_color_am="@color/dark_tangerine"
		app:arc_color_pm="@color/medium_turquoise"
		app:arc_dash_size="20dp"
		app:border_color="#3F484F"
		app:border_thickness="25dp"
		app:thumb_size="28dp"
		app:layout_constraintBottom_toBottomOf="parent"
		app:layout_constraintLeft_toLeftOf="parent"
		app:layout_constraintRight_toRightOf="parent"
		app:layout_constraintTop_toTopOf="parent" />

