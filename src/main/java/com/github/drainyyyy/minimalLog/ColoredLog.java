/*
 * Copyright (c) 2018 - 2019. Drainyyy
 * This project is covered by MIT License
 * https://opensource.org/licenses/MIT
 */

package com.github.drainyyyy.minimalLog;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Drainyyy
 * https://github.com/Drainyyyy
 */
public class ColoredLog {
    private String resetColor = "\u001b[0m";

    private Colors information;
    private Colors notification;
    private Colors warning;
    private Colors error;
    private Colors exceptionHandlerText;
    private Colors exceptionHandlerKeywords;

    private String typeDiv;
    private String formattedTimestamp;
    private String timestampDiv;

    /** An object of ColoredLog with default settings (without timestamp)
     * <br>
     * The default settings look like this:
     * information-color: blue
     * notification-color: green
     * warning-color: magenta
     * error-color: red
     * exceptionHandlerText: red
     * exceptionHandlerKeywords: magenta
     *
     * @param typeDiv Separator for the type of the logged text and the text (e.g. 'INFO | text' : '|' = separator)
     *
     * @since 1.0
     */
    public ColoredLog(String typeDiv) {
        this.typeDiv = " " + typeDiv + " ";

        this.information = Colors.blue;
        this.notification = Colors.green;
        this.warning = Colors.magenta;
        this.error = Colors.red;
        this.exceptionHandlerText = Colors.red;
        this.exceptionHandlerKeywords = Colors.magenta;
    }

    /** An object of ColoredLog with default settings (with timestamp)
     * <br>
     * The default settings look like this:
     * information-color: blue
     * notification-color: green
     * warning-color: magenta
     * error-color: red
     * exceptionHandlerText: red
     * exceptionHandlerKeywords: magenta
     *
     * @param typeDiv Separator for the type of the logged text and the text (e.g. 'INFO | text' : '|' = separator)
     * @param timestamp The format the timestamp will be shown
     * @param timestampDiv A String that separates the timestamp and the logged text
     *
     * @see SimpleDateFormat
     *
     * @since 1.0
     */
    public ColoredLog(String typeDiv, SimpleDateFormat timestamp, String timestampDiv) {
        this.typeDiv = " " + typeDiv + " ";
        this.timestampDiv = " " + timestampDiv + " ";

        this.formattedTimestamp = timestamp.format(new Date());

        this.information = Colors.blue;
        this.notification = Colors.green;
        this.warning = Colors.magenta;
        this.error = Colors.red;
        this.exceptionHandlerText = Colors.red;
        this.exceptionHandlerKeywords = Colors.magenta;
    }

    /** An object of ColoredLog where the user chooses the colors from the {@link Colors} class (without timestamp)
     *
     * @param typeDiv Separator for the type of the logged text and the text (e.g. 'INFO | text': '|' = separator)
     * @param information The color for infos
     * @param notification The color for notifications
     * @param warning The color for warnings
     * @param error The color for errors
     * @param exceptionHandlerText The color for the text of the exception handler (e.g. stacktrace, exception)
     * @param exceptionHandlerKeywords The color for the keywords (e.g. 'Stacktrace:' stacktrace)
     *
     * @see Colors
     *
     * @since 1.0
     */
    public ColoredLog(String typeDiv, Colors information, Colors notification, Colors warning, Colors error,
                      Colors exceptionHandlerText, Colors exceptionHandlerKeywords) {
        this.typeDiv = " " + typeDiv + " ";

        this.information = information;
        this.notification = notification;
        this.warning = warning;
        this.error = error;
        this.exceptionHandlerText = exceptionHandlerText;
        this.exceptionHandlerKeywords = exceptionHandlerKeywords;
    }

    /** An object of ColoredLog where the user chooses the colors from the {@link Colors} class (with timestamp)
     *
     * @param typeDiv Separator for the type of the logged text and the text (e.g. 'INFO | text': '|' = separator)
     * @param timestamp The format the timestamp will be shown
     * @param timestampDiv A String that separates the timestamp and the logged text
     * @param information The color for infos
     * @param notification The color for notifications
     * @param warning The color for warnings
     * @param error The color for errors
     * @param exceptionHandlerText The color for the text of the exception handler (e.g. stacktrace, exception)
     * @param exceptionHandlerKeywords The color for the keywords (e.g. 'Stacktrace:' stacktrace)
     *
     * @see Colors
     *
     * @since 1.0
     */
    public ColoredLog(String typeDiv, SimpleDateFormat timestamp, String timestampDiv, Colors information, Colors notification, Colors warning,
                      Colors error, Colors exceptionHandlerText, Colors exceptionHandlerKeywords) {
        this.typeDiv = " " + typeDiv + " ";
        this.timestampDiv = " " + timestampDiv + " ";

        this.formattedTimestamp = timestamp.format(new Date());

        this.information = information;
        this.notification = notification;
        this.warning = warning;
        this.error = error;
        this.exceptionHandlerText = exceptionHandlerText;
        this.exceptionHandlerKeywords = exceptionHandlerKeywords;
    }

    /** Formats the text so that every logged text looks equal
     * <br>
     * The text will get edited so it will look like this "timestamp(if given) + timestampDiv(if given) + type + typeDiv + text"
     * Example: "22.03.2019 - 23.41.32 | INFO > Drainyyy writing documentation"
     * Also this text is colored. This means it will be shown colored in the consoles.
     * Note: On Windows the colors won't be shown in the default command prompt. For this you need to install console emulators like Cmder
     *
     * @param type The type of the logged text (e.g. 'INFO' for information, 'ERR' for error, etc.)
     * @param text The text the user wants to log
     * @param color The color the text will be shown in
     * @return The text with timestamp (if given), type and color code
     *
     * @see Colors
     *
     * @since 1.0
     */
    private String formatText(String type, String text, Colors color) {
        String formattedText = type + this.typeDiv + text;
        String coloredText = color.getColor() + formattedText + resetColor;
        formattedText = (formattedTimestamp != null) ? this.formattedTimestamp + this.timestampDiv + coloredText : coloredText;
        return formattedText;
    }

    /** Information log (type: 'INFO', default-color: blue)
     *
     * @param text The text that will get logged
     *
     * @see Colors
     *
     * @since 1.0
     */
    public void information(String text) {
        String info = formatText("INFO", text, this.information);
        System.out.println(info);
    }

    /** Notification log (type: 'NOTIF', default-color: green)
     *
     * @param text The text that will get logged
     *
     * @see Colors
     *
     * @since 1.0
     */
    public void notification(String text) {
        String notif = formatText("NOTIF", text, this.notification);
        System.out.println(notif);
    }

    /** Warning log (type: 'WARN', default-color: magenta)
     *
     * @param text The text that will get logged
     *
     * @see Colors
     *
     * @since 1.0
     */
    public void warning(String text) {
        String warn = formatText("WARN", text, this.warning);
        System.out.println(warn);
    }

    /** Error log (type: 'ERR', default-color: red)
     *
     * @param text The text that will get logged
     *
     * @see Colors
     *
     * @since 1.0
     */
    public void error(String text) {
        String err = formatText("ERR", text, this.error);
        System.out.println(err);
    }

    /** Prints the exception and the respective stacktrace.
     * The keywords ('EXCEPTION' and 'StackTrace') will get printed in {@link #exceptionHandlerKeywords}.
     * The stacktrace and the exception message itself will get pinted in {@link #exceptionHandlerText}.
     *
     * @param e The exception that got thrown
     *
     * @see Colors
     *
     * @since 1.1.0
     */
    public void exceptionHandler(Exception e) {
        String textColor = this.exceptionHandlerText.getColor();
        String keywordColor = this.exceptionHandlerKeywords.getColor();

        String exception = e.getMessage();

        StringBuilder formattedStackTrace = new StringBuilder();
        for (StackTraceElement stackTraceElement : e.getStackTrace()) {
            formattedStackTrace.append(keywordColor)
                .append("StackTrace")
                .append(resetColor)
                .append(typeDiv)
                .append(textColor)
                .append(stackTraceElement)
                .append(resetColor)
                .append("\n");
        }

        StringBuilder formattedException = new StringBuilder();
        formattedException.append(keywordColor);
        if (this.formattedTimestamp != null) {
            formattedException.append(this.formattedTimestamp)
                            .append(this.timestampDiv);
        }
        formattedException.append("EXCEPTION")
                        .append(resetColor)
                        .append(this.typeDiv)
                        .append(textColor)
                        .append(exception)
                        .append(resetColor);

        System.out.println(formattedException);
        System.out.println(formattedStackTrace);

    }
}
