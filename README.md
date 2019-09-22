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

This android view animations library supports number of animations. Go to the java version of this library to see the gallery of animations. Click here https://github.com/gayankuruppu/android-view-animations-java#animations

## Develop the library


## Thanks
This library is based on https://github.com/daimajia/AndroidViewAnimations and the Kotlin version of this library is available in  https://github.com/gayankuruppu/android-view-animations-kotlin
