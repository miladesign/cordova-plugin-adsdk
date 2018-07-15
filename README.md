Ad-Sdk Cordova plugin
====================
Ad-Sdk plugin for Cordova and Phonegap.<br/>

- Ad-Sdk android SDK 2.0<br/>
- Cordova version >3.0<br/>

## Install plugin ##

### Cordova cli ###
https://cordova.apache.org/docs/en/edge/guide_cli_index.md.html#The%20Command-Line%20Interface - npm install -g cordova@6.0.0
```c
cordova plugin add cordova-plugin-adsdk
(when build error, use github url: cordova plugin add cordova plugin add https://github.com/miladesign/cordova-plugin-adsdk)
```

### Xdk ###
https://software.intel.com/en-us/intel-xdk - Download XDK - XDK PORJECTS - [specific project] - CORDOVA HYBRID MOBILE APP SETTINGS - Plugin Management - Add Plugins to this Project - Third Party Plugins -
```c
Plugin Source: Cordova plugin registry
Plugin ID: cordova-plugin-adsdk
```

### Cocoon ###
https://cocoon.io - Create project - [specific project] - Setting - Plugins - Custom - Git Url: https://github.com/miladesign/cordova-plugin-adsdk.git - INSTALL - Save<br>

### Phonegap build service (config.xml) ###
https://build.phonegap.com/ - Apps - [specific project] - Update code - Zip file including config.xml
```c
<gap:plugin name="cordova-plugin-adsdk" source="npm" />
```

### Construct2 ###
Download construct2 plugin<br>
http://miladesign.ir/construct/adsdk


## Use Plugin ##

### 1.Initialize adsdk cordova plugin
init plugin after deviceready event <br />

    window.adsdk.init(developerId, testMode, enableAds);
    
## Examples ##
<a href="https://github.com/miladesign/cordova-plugin-adsdk/blob/master/example/index.html">Click to see!</a><br>

## Test ##
You can run following test apk:<br>
http://s2.picofile.com/file/8264956568/adad_cordova.apk.html

## Useful links ##
Cordova Plugins<br>
http://miladesign.ir/cordova

# Credite and donate #
Created by: Milad Mohammadi<br>
Email: Rezagah.Milad@Gmail.com<br>
Web: http://miladesign.ir<br>
Telegram ID: @MilaDesign<br>
donate: http://miladesign.ir/donate