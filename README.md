# IntentHelper - easy manage intents
Library for managing camera and file intents easily

[![Build Status](https://travis-ci.org/jacek-marchwicki/intent-helper.svg?branch=master)](https://travis-ci.org/jacek-marchwicki/intent-helper)


# Usage
Add library to project dependencies.

```groovy
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {

    // snapshot version
    compile 'com.github.jacek-marchwicki.intent-helper:master-SNAPSHOT'

    // or use specific version
    compile 'com.github.jacek-marchwicki.intent-helper:0.0.1'
}
```
# Usage examples

## Simple usage

```java
final IntentHelper intentHelper = new IntentHelper();

findViewById(R.id.activity_main_button)
        .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String text = "Return: " + intentHelper.isItWorking();
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });

```

# Build instructions

```bash
./gradlew build
```

# License

    Copyright [2016] [Jacek Marchwicki <jacek.marchwicki@gmail.com>]
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
    	http://www.apache.org/licenses/LICENSE-2.0
        
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
