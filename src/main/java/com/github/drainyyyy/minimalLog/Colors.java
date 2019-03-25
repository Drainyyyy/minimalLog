/*
 * Copyright (c) 2018 - 2019. Drainyyy
 * This project is covered by MIT License
 * https://opensource.org/licenses/MIT
 */

package com.github.drainyyyy.minimalLog;

/**
 * @author Drainyyy
 * https://github.com/Drainyyyy
 */
public class Colors {

    public static Colors black = new Colors("\u001b[30m");
    public static Colors red = new Colors("\u001b[31m");
    public static Colors green = new Colors("\u001b[32m");
    public static Colors blue = new Colors("\u001b[34m");
    public static Colors magenta = new Colors("\u001b[35m");
    public static Colors yellow = new Colors("\u001b[33m");
    public static Colors cyan = new Colors("\u001b[36m");

    private String code;

    /** With this you can add your own color to the given colors
     * <br>
     * Note: On Windows the colors won't be shown in the default command prompt. For this you need to install console emulators like Cmder
     *
     * @param ansiEscapeCode The ansi escape code for the color that will be shown in the terminal
     *
     * @since 1.0
     */
    public Colors(String ansiEscapeCode) {
        this.code = ansiEscapeCode;
    }

    /** Gets the ansi escape code from the Colors object
     *
     * @return the ansi escape code as String
     *
     * @since 1.0
     */
    public String getColor() {
        return this.code;
    }

}
