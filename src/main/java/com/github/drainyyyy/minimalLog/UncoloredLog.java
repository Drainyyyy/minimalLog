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
public class UncoloredLog {

    private String formattedTimestamp = null;
    private String timestampDiv;
    private String typeDiv;

    /** Create a log object that won't output text with color codes (without timestamp)
     *
     * @param typeDiv Separator for the type of the logged text and the text (e.g. 'INFO | text' : '|' = separator)
     *
     * @since 1.0
     */
    public UncoloredLog(String typeDiv) {
        this.typeDiv = typeDiv;
    }

    /** Create a log object that won't output text with color codes (with timestamp)
     *
     * @param typeDiv Separator for the type of the logged text and the text (e.g. 'INFO | text' : '|' = separator)
     * @param timestamp The format the timestamp will be shown
     * @param timestampDiv A String that separates the timestamp and the logged text
     *
     * @see SimpleDateFormat
     *
     * @since 1.0
     */
    public UncoloredLog(String typeDiv, SimpleDateFormat timestamp, String timestampDiv) {
        this.typeDiv = typeDiv;
        this.timestampDiv = timestampDiv;

        this.formattedTimestamp = timestamp.format(new Date());
    }

    /** Formats the text so that every logged text looks equal
     * <br>
     * The text will get edited so it will look like this "timestamp(if given) + timestampDiv(if given) + type + typeDiv + text"
     * Example: "22.03.2019 - 23.41.32 | INFO > Drainyyy writing documentation"
     *
     * @param type The type of the logged text (e.g. 'INFO' for information, 'ERR' for error, etc.)
     * @param text The text the user wants to log
     * @return The formatted text
     *
     * @since 1.0
     */
    private String formatText(String type, String text) {
        String formattedText = type + " " + this.typeDiv + " " + text;
        if (this.formattedTimestamp != null) {
            formattedText = this.formattedTimestamp + " " + this.timestampDiv + " ";
        }

        return formattedText;
    }

    /** Information log (type: 'INFO')
     *
     * @param text The text that will get logged
     *
     * @since 1.0
     */
    public void information(String text) {
        String info = formatText("INFO", text);
        System.out.println(info);
    }

    /** Notification log (type: 'NOTIF')
     *
     * @param text The text that will get logged
     *
     * @since 1.0
     */
    public void notification(String text) {
        String notif = formatText("NOTIF", text);
        System.out.println(notif);
    }

    /** Warning log (type: 'WARN')
     *
     * @param text The text that will get logged
     *
     * @since 1.0
     */
    public void warning(String text) {
        String warn = formatText("WARN", text);
        System.out.println(warn);
    }

    /** Error log (type: 'ERR')
     *
     * @param text The text that will get logged
     *
     * @since 1.0
     */
    public void error(String text) {
        String err = formatText("ERR", text);
        System.out.println(err);
    }

}
