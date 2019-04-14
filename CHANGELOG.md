# Changelog
## 1.1.0
### Additions
Added exception handler.

It just takes the Exception e as input and outputs error message and StackTrace like this:
```
EXCEPTION | <errorMessage>
StackTrace | <stackTrace>
StackTrace | <stackTrace>
StackTrace | <stackTrace>
StackTrace | <stackTrace>
```

The keywords are 'EXCEPTION' and StackTrace which will be shown in another color as the rest.

The color for the keywords is exceptionHandlerKeywords, the one for the rest is exceptionHandlerText
## 1.0.01
### Bugfix
Colors are now shown when creating a ColoredLog without timestamp.
## 1.0.0
Release date