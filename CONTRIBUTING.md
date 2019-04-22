# Contributing
Contributing to this project is wanted.
If you think there is a feature that could be added or made better, feel free to fork and edit it how you want.

But there are some rules to keep in mind.

## Issues
If you got any issues with minimalLog (e.g. it's not working/there is a bug) you can post this issue on the [issues page](https://github.com/Drainyyyy/minimalLog/issues).
But please describe your problem properly and (if given) give enough steps to reproduce so I can understand where the problem is.
Also helpful is to add what is supposed to happen, because it could be that I don't even understand what the problem is.
If your problem is already listed in the issues please don't report too.

The following checklist is also a schema you can use for issue:

 - [ ] Is the bug already listed? (If yes don't report it)
 - [ ] Detailed and clear description of the problem
 - [ ] Ordered and detailed steps to reproduce (if given)
 - [ ] What is supposed to happen
 - [ ] What does actually happen (abridged version)
 - [ ] If necessary your device and os

## Feature Requests
Sometimes you wish additional features that could be helpful. Just send them in here, but keep in mind this log library is made to be simple.
minimalLog is not supposed to have thousands of features which are made for special purposes.
It's made for having some features that can be useful for every purpose. 
So don't ask for something that is only useful for you because it's exactly made for your application. 

But if your feature request is useful for everyone and you wish it was in minimalLog then send it!

Like in [Issues](CONTRIBUTING.md#issues) there is a little checklist (which also works as schema to structure your feature request) 
to complete before sending your request:

 - [ ] Is your idea already requested? (if yes don't send it)
 - [ ] Is your feature related to a problem? (if yes describe it clearly and detailed or create an [issue](CONTRIBUTING.md#issues))
 - [ ] Clear and detailed description of your idea
 
## Development
If you want to contribute to this project by adding new features or fixing bugs by yourself, you are very welcome.
That makes things a lot easier for me because I got a long list of things I could work on.
But also here are some things you should keep in mind before submitting the code you have written.

### Documentation

---
Every function in this code is documented and this should stay that way.
My documentation is built the same every time.

Above the class I use the '@author' tag with my GitHub name and under this I add the link to my GitHub account.
The documentation of each method is built like this:
1. A short description of what the function does
2. A longer description if necessary
3. The params & return with description for what they are used for
4. '@see' to important things that were used in this method
5. '@since' with the current version

Here is an example:

```java
package com.github.drainyyyy.minimalLog;

import com.github.drainyyyy.minimalLog.ColoredLog;

/**
* @author Drainyyy
* https://github.com/Drainyyyy
*/
public class Documentation {
    
    /** A short example description
    * The longer description
    * Some more longer description
    * 
    * @param typeDiv description of param1
    * @param timestampDiv description of param2
    * @return an instance of ColoredLog with the params as dividers for the log
    * 
    * @see ColoredLog
    * 
    * @since 2.3.27
    */
    public static ColoredLog example(String typeDiv, String timestampDiv) {
     
        return new ColoredLog(typeDiv, new SimpleDateFormat("dd.MM.yyyy ~ HH:mm:ss"), timestampDiv);
    }
}
```

**Versions** are structured like this in my projects:

The first number is changed when big changes come up.
The second number is for smaller changes and additions and the third is for bug fixes.

### Code style

---
One of the goals of my open-source projects is human readability. 
When writing code for this project try to stick to the rules of java naming conventions and don't make a mess in it.
Also test your code before you submit it, because I won't accept it when it's not working.

### Rejecting Pull Requests

---
When your pull request got rejected or you just want to make sure it won't read through this.

When a pull request is rejected this could have many different reasons. The main reasons are the following:
- Your code is a mess
- You haven't documented your code
- Your feature does not fit in the project

If you think your code was not rejected for one of that reasons you can join [my discord server](https://www.drainyyy.me/s/discord) and ask for help.
