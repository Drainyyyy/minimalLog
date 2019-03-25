# minimalLog
minimalLog is a minimalistic log library that makes console logs more viewable.
Also the code is mostly documented so if you don't understand what parts of the library do just view it in the source.

**Version** 1.0

**[Changelog](CHANGELOG.md)**

## Features
- Printing your text in the console with
    - timestamp (optional)
        - You can choose the format with SimpleDateFormat
    - color (optional)
- The separator of the timestamp, the log type and the text can be changed

Example:

    23.03.2019 - 02:01:43 | INFO > Drainyyy writes the README

In this case above '|' and '>' are the seperators

So you can also do something like

    23.03.2019 - 02:03:52 ~ WARN ~ Drainyyy is tired
    
##Installation
1. Download the released jar files (source and javadoc only if needed).
3. - **IntelliJ**
        - Go to `File > Project Structure... > Libraries`
        - Click the little green `+` and navigate to the folder where all 3 jars (or only 1 or 2) are in.
        - Add it.
        
## Examples
```java
package me.drainyyy.minimalLog.Example;

import java.text.SimpleDateFormat;

/**
* @author Drainyyy
* https://github.com/Drainyyyy
*/
public class Example {
    
    public static void main(String[] args) {
     
        //Without timestamp
        UncoloredLog uLog = new UncoloredLog(">");
        
        //With timestamp
        UncoloredLog uLog2 = new UncoloredLog(">", new SimpleDateFormat("dd.MM.yyyy - HH:mm:ss"), "|");
        
        String yourText = "Drainyyy is still writing the README";
        
        uLog.information(yourText);
        uLog2.notification(yourText);
        
    }
}
```

Output:
```console
23.03.2019 - 02:22:22 | INFO > Drainyyy is still writing the README
23.03.2019 - 02:22:47 | NOTIF > Drainyyy is still writing the README
```

With colors it's nearly the same, except that if you want you can choose the colors for the different log types.

Otherwise the colors will be default (info: blue, notif: green, warn: magenta, err: red)

**Note:** On Windows the colors won't be shown in the default command prompt. 

To view the colors you'll need another Console like Cmder.
