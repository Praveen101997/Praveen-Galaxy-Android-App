# CainCamera Introduction
CainCamera is a comprehensive open source APP that integrates beauty camera, photo editing, short video editing and other functions. At present, it mainly introduces the realization of beauty camera and short video editing functions. The picture editing function has not yet had time to deal with.
I wrote this project mainly to learn how to realize the real-time beauty of the camera, dynamic filters, dynamic stickers, make-up, taking pictures, short video segment recording and deletion, picture editing, short-time frequency editing and synthesis.
As of now, the completed functions include:
1. Beauty camera part
* Real-time beauty and whitening
* Dynamic filters
* Dynamic stickers
* Taking pictures, short video segment recording, back deletion, etc.
* Facial treatment such as thin face, big eyes, bright eyes and beautiful teeth
## Remarks:
Due to the lack of various materials in the makeup function, I only wrote a rough process. The main purpose of makeup is the difference between the material and the material. If you are interested, you can refer to it.

2. Short video editing part
* Modeled after the vibrato editing function. At present, the short video editing page is implemented in accordance with the vibrato page.
* Self-developed video player based on FFmpeg. At present, the player has been packaged into a MediaPlayer-like way, which supports fast seek, double-speed playback, and real-time preview of added special effects. The purpose of writing this video player is also used for real-time preview processing of short video editing pages, there are still many BUGs, it is recommended to use it carefully in commercial
* Simple realization of editing function. At present, it is based on remuxing, but it has not been processed for double speed, and it will be processed later.
* Real-time special effects. At present, filter effects such as flashing white, illusion, zoom, jitter, and soul out of vibrato and all split-screen effects have been implemented on the player. Because the time special effect needs to modify the player, there is no time to realize it temporarily.
## Remarks:
At present, there is no time to realize the short video synthesis function. At present, due to the change of cities and jobs, there is currently no time. I will realize the synthesis function when I am busy. Thank you for your cooperation.

## Update
Update January 1, 2020:
At present, in order to facilitate access to the CameraX library, the original shooting page rendering process and access to the double-speed recording function have been rewritten. At present, there are still some bugs in the callback data of the CameraX library, which leads to confusion in face SDK detection. This is a known problem. Time to fix again.
Next, during the Spring Festival, it will take time to realize the synthesis function of the editing page, so stay tuned.

# About face SDK verification
Regarding the verification of the face key point SDK, because the trial version of Face ++ is used as a test, the number of daily use is limited
Therefore, it is recommended that you register on the Face ++ official website (https://www.faceplusplus.com/) to use a Key. You need to register the Key first, and then bind the Bundle (package name) to use it.
Domestic users need to register at https://www.faceplusplus.com.cn/. The registration process is as follows:
[Face ++ SDK registration process] (https://github.com/CainKernel/CainCamera/blob/master/document/introduction/facepp_registration.md)

For more questions about Face ++ SDK, you can go to Face ++ official github to ask:
[MegviiFacepp-Android-SDK] (https://github.com/FacePlusPlus/MegviiFacepp-Android-SDK)

# libraryIntroduction:
* cameralibrary: camera library, including processes such as rendering thread, rendering engine

* facedetectlibrary: Face ++ SDK library for key points of face. Combined with landmarklibrary library to do face key point processing.

* filterlibrary: filter library. The inventory holds various filters and resource processing tools.

* imagelibrary: Image editing library. For the time being, the library has only the filter processing and saving functions. Currently, the library is currently not perfect due to the short video editing function being written.

* landmarklibrary: key point processing library. This library is used for normalized key point processing, and it is used in filterlibrary to process filters and stickers.

* medialibrary: short video editing library. A full set of C ++ code for short video editing real-time preview player, audio clipper, video synthesizer, etc.
Audio and video clippers and video synthesizers are still under development, so stay tuned.

* pickerlibrary: media selection library. Used to select images and videos in the media library.

* utilslibrary: common tool library. Encapsulation tools for bitmap processing, file processing, and string processing.

* videolibrary: video editing library. At present, the library is in the planned implementation state. Since tools such as short video players and short video synthesizers have not been implemented, the library has not yet been implemented, so stay tuned.

## Android Studio version issue
2019-01-19 Update:
It has been updated to Android Studio 3.2.1.
Regarding the problem that Cmake cannot be compiled and passed after Android Studio 3.2.1, here is a sentence:
1. After updating Android Studio 3.2.1, you need to update NDK, cmake, lldb to the latest version

2. After updating, you need to change the project's dependencies to 'com.android.tools.build:gradle:3.2.1'

3. You need to change the version of gradle-wrapper.properies to 4.6, ie gradle-4.6-all.zip

Cause: The NDK and SDK Gradle versions are out of sync.
After the default upgrade, it will be automatically updated to 'com.android.tools.build:gradle:3.3.0' and gradle-4.10.1-all.zip
If you use the above configuration and compile the NDK file with Cmake, there will be errors such as Error Config, Cmake 3.6.0 and SDK Cmake3.10.2.xxx conflict
At present, Windows, Linux and MacOS have been verified. For those who cannot compile, please check their configuration.

# CainCamera screenshot
## Dynamic stickers and dynamic filters
! [Stickers and filters] (https://github.com/CainKernel/CainCamera/blob/master/screenshot/sticker_and_filter.jpg)

! [Dynamic Filter] (https://github.com/CainKernel/CainCamera/blob/master/screenshot/dynamic_filter.jpg)

## Face beautification and beauty treatment
! [Human Face Beautification] (https://github.com/CainKernel/CainCamera/blob/master/screenshot/beauty_face.jpg)

! [Beauty Processing] (https://github.com/CainKernel/CainCamera/blob/master/screenshot/face_reshape.jpg)

## Makeup function
* Remarks: Due to lack of material, only the makeup function is shown here through the mask.

! [Dynamic Makeup] (https://github.com/CainKernel/CainCamera/blob/master/screenshot/makeup.jpg)

## Media library traversal
! [Media Library Traversal] (https://github.com/CainKernel/CainCamera/blob/master/screenshot/media_scan.jpg)

## Picture editing page
* Remarks: The picture editing function has no time to realize all the functions

! [Image editing page] (https://github.com/CainKernel/CainCamera/blob/master/screenshot/image_edit.jpg)

# CainCamera Reference items:
[grafika] (https://github.com/google/grafika)

[GPUImage] (https://github.com/CyberAgent/android-gpuimage)

[MagicCamera] (https://github.com/wuhaoyu1990/MagicCamera)

[AudioVideoRecordingSample] (https://github.com/saki4510t/AudioVideoRecordingSample)

# "Android Beauty Camera Development Summary"
[Chapter One Android OpenGLES Camera Preview] (https://www.jianshu.com/p/dabc6be45d2e)

[Chapter 2 Android OpenGLES Recorded Video] (https://www.jianshu.com/p/d5fe577170cd)

[Chapter 3 Android OpenGLES Add filters to the camera] (https://www.jianshu.com/p/f7629254f7f0)

[Chapter 4 Android OpenGLES Dynamic Sticker Implementation] (https://www.jianshu.com/p/122bedf3a17e)

[Chapter 5 Android OpenGLES Beauty Customization] (https://www.jianshu.com/p/3334a3af331f)

[Chapter 6 Android OpenGLES Beauty Customization Implementation] (https://www.jianshu.com/p/bc0d0db2893b)

# "Android FFmpeg player development card"
[Chapter 0 Encapsulation of Basic Public Classes] (https://www.jianshu.com/p/9003caa6683f)

[Chapter One Player Initialization and Demultiplexing Process] (https://www.jianshu.com/p/95dc19217847)

[Chapter 2 Realization of Audiovisual Decoder and Video Decoder] (https://www.jianshu.com/p/8de0fc796ef9)

[Chapter 3 Audio Output-OpenSLES] (https://www.jianshu.com/p/9b41212c71a5)

[Chapter 4 Audio Resampling and Variable-speed Modulation Processing] (https://www.jianshu.com/p/4af5d16ac017)

[Chapter 5 Video Synchronous Rendering Output] (https://www.jianshu.com/p/f8ba3ceac687)

# personal contact information

email: <cain.huang@outlook.com>

blog: [cain_huang] (http://www.jianshu.com/u/fd6f2b25d0f4)

# License
`` `
Copyright 2018 cain.huang@outlook.com
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
`` `
