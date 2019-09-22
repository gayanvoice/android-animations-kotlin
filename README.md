# Android View Animations in Kotlin
[![Build Status](https://travis-ci.org/gayankuruppu/android-view-animations-kotlin.svg?branch=master)](https://travis-ci.org/gayankuruppu/android-view-animations-kotlin)
[![](https://jitpack.io/v/gayankuruppu/android-view-animations-kotlin.svg)](https://jitpack.io/#gayankuruppu/android-view-animations-kotlin)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/gayankuruppu/android-view-animations-kotlin)

<img width="360" alt="Android View Animations in Java" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/2-android-view-animations-java.1fe3487e.gif"> <img width="360" alt="Android View Animations in Java" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/0-android-view-animations-java.57f29c80.gif">

## Get

### Gradle

1. Add this to `build.gradle` of project gradle dependency

```groovy
allprojects {
	repositories {
		...
 		maven { url 'https://jitpack.io' }
	}
}
```

2. Add this to `build.gradle` of app gradle dependency

```groovy
dependencies {
	implementation 'com.github.gayankuruppu:android-view-animations-kotlin:1.0.0'
}
```

### Or

### Maven

1. Add this to `build.gradle` of project gradle dependency

```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
	    	<url>https://jitpack.io</url>
	</repository>
</repositories>
```

2. Add this to `build.gradle` of module gradle dependency

```xml
<dependency>
	<groupId>com.github.gayankuruppu</groupId>
	<artifactId>android-view-animations-kotlin</artifactId>
	<version>1.0.0</version>
</dependency>
```
## Usage
### Import render animations

```java
import render.animations.*;
```

### Start animation

```java
// Declare TextView
val textView: TextView = findViewById(R.id.TextView)

// Create Render Class
 val render = Render(this)

// Set Animation
render.setAnimation(Bounce().InDown(textView))
render.start()
```

## Animations

To animate the view, add the class name and specific animation method name`setAnimation` to an view. You can include the method `setDuration` to specify duration of animation. Default value for `duration` is `1000 Milliseconds`. Finally you need to add one of the following classes to the view:

| Class Name  |             |             |             |             |             |		  |
| ----------- | ----------- | ----------- | ----------- | ----------- | ----------- | ----------- |
| `Attention` | `Bounce`    | `Fade`      | `Flip   `   | `Rotate`    | `Slide`     | `Zoom`      |


<table><tbody>
<tr><td>`Bounce`</td><td><img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/1-attention-bounce.c6335f3d.gif"></td><td>`Flash`</td><td><img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/2-attention-flash.27fb56e5.gif"></td></tr>
<tr><td>`Pulse`</td><td><img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/3-attention-pulse.ee6d1fae.gif"></td><td>`Ruberband`</td><td><img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/4-attention-ruberband.a701fa5b.gif"></td></tr>
<tr><td>`Shake`</td><td><img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/5-attention-shake.62d9243a.gif"></td><td>`Standup`</td><td><img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/6-attention-standup.553e1945.gif"></td></tr>
<tr><td>`Swing`</td><td><img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/7-attention-swing.602dd7aa.gif"></td><td>`Tada`</td><td><img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/8-attention-tada.faa9f3c1.gif"></td></tr>
<tr><td>`Wave`</td><td><img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/9-attention-wave.9a37979d.gif"></td><td>`Wobble`</td><td><img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/10-attention-wobble.42ac8c56.gif"></td></tr>
</tbody></table>

This android view animations library supports number of animations. Go to the java version of this library to see the gallery of animations. Click here https://github.com/gayankuruppu/android-view-animations-java#animations

## Develop the library

1. Select `Git` from `Check out project from Version Control` in your Android Studio
2. Paste the repository url and click `Clone` button
3. Click `Yes` to open the repository
4. `Build` using the latest `Gradle` version

Go to https://github.com/gayankuruppu/android-vpn-client-ics-openvpn#develop see the steps

## Thanks
This library is based on https://github.com/daimajia/AndroidViewAnimations and the Java version of this library is available in  https://github.com/gayankuruppu/android-view-animations-java
