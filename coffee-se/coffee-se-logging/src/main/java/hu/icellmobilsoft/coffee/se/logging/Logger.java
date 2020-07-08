/*-
 * #%L
 * Coffee
 * %%
 * Copyright (C) 2020 i-Cell Mobilsoft Zrt.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package hu.icellmobilsoft.coffee.se.logging;

/**
 * Based on slf4j.Logger
 *
 * @author imre.scheffer
 * @since 1.0.0
 */
public interface Logger {

    /**
     * Construct a new Logger instance.
     *
     * @param clazz
     *            the logger category class
     */
    public static hu.icellmobilsoft.coffee.se.logging.Logger getLogger(Class<?> clazz) {
        return DefaultLogger.getLogger(clazz);
    }

    /**
     * Construct a new Logger instance.
     *
     * @param name
     *            the logger category name
     */
    public static hu.icellmobilsoft.coffee.se.logging.Logger getLogger(String name) {
        return DefaultLogger.getLogger(name);
    }

    /**
     * <p>
     * setLogger.
     * </p>
     */
    void setLogger(java.util.logging.Logger logger);

    /**
     * <p>
     * getLogger.
     * </p>
     */
    java.util.logging.Logger getLogger();

    /**
     * Is the logger instance enabled for the TRACE level?
     *
     * @return True if this Logger is enabled for the TRACE level, false otherwise.
     */
    public boolean isTraceEnabled();

    /**
     * Log a message at the TRACE level.
     *
     * @param msg
     *            the message string to be logged
     */
    public void trace(String msg);

    /**
     * Log a message at the TRACE level according to the specified format and arguments.<br>
     * <p>
     * This form avoids superfluous string concatenation when the logger is disabled for the TRACE level. However, this variant incurs the hidden (and
     * relatively small) cost of creating an <code>Object[]</code> before invoking the method, even if this logger is disabled for TRACE.
     * </p>
     *
     * @param format
     *            the format string
     * @param arguments
     *            a list of 3 or more arguments
     */
    public void trace(String format, Object... arguments);

    /**
     * Log an exception (throwable) at the TRACE level with an accompanying message.
     *
     * @param msg
     *            the message accompanying the exception
     * @param t
     *            the exception (throwable) to log
     */
    public void trace(String msg, Throwable t);

    /**
     * Is the logger instance enabled for the DEBUG level?
     *
     * @return True if this Logger is enabled for the DEBUG level, false otherwise.
     */
    public boolean isDebugEnabled();

    /**
     * Log a message at the DEBUG level.
     *
     * @param msg
     *            the message string to be logged
     */
    public void debug(String msg);

    /**
     * Log a message at the DEBUG level according to the specified format and arguments. <br>
     * <p>
     * This form avoids superfluous string concatenation when the logger is disabled for the DEBUG level. However, this variant incurs the hidden (and
     * relatively small) cost of creating an <code>Object[]</code> before invoking the method, even if this logger is disabled for DEBUG.
     * </p>
     *
     * @param format
     *            the format string
     * @param arguments
     *            a list of 3 or more arguments
     */
    public void debug(String format, Object... arguments);

    /**
     * Log an exception (throwable) at the DEBUG level with an accompanying message.
     *
     * @param msg
     *            the message accompanying the exception
     * @param t
     *            the exception (throwable) to log
     */
    public void debug(String msg, Throwable t);

    /**
     * Is the logger instance enabled for the INFO level?
     *
     * @return True if this Logger is enabled for the INFO level, false otherwise.
     */
    public boolean isInfoEnabled();

    /**
     * Log a message at the INFO level.
     *
     * @param msg
     *            the message string to be logged
     */
    public void info(String msg);

    /**
     * Log a message at the INFO level according to the specified format and arguments. <br>
     * <p>
     * This form avoids superfluous string concatenation when the logger is disabled for the INFO level. However, this variant incurs the hidden (and
     * relatively small) cost of creating an <code>Object[]</code> before invoking the method, even if this logger is disabled for INFO.
     * </p>
     *
     * @param format
     *            the format string
     * @param arguments
     *            a list of 3 or more arguments
     */
    public void info(String format, Object... arguments);

    /**
     * Log an exception (throwable) at the INFO level with an accompanying message.
     *
     * @param msg
     *            the message accompanying the exception
     * @param t
     *            the exception (throwable) to log
     */
    public void info(String msg, Throwable t);

    /**
     * Log a message at the WARN level.
     *
     * @param msg
     *            the message string to be logged
     */
    public void warn(String msg);

    /**
     * Log a message at the WARN level according to the specified format and arguments. <br>
     * <p>
     * This form avoids superfluous string concatenation when the logger is disabled for the WARN level. However, this variant incurs the hidden (and
     * relatively small) cost of creating an <code>Object[]</code> before invoking the method, even if this logger is disabled for WARN.
     * </p>
     *
     * @param format
     *            the format string
     * @param arguments
     *            a list of 3 or more arguments
     */
    public void warn(String format, Object... arguments);

    /**
     * Log an exception (throwable) at the WARN level with an accompanying message.
     *
     * @param msg
     *            the message accompanying the exception
     * @param t
     *            the exception (throwable) to log
     */
    public void warn(String msg, Throwable t);

    /**
     * Log a message at the ERROR level.
     *
     * @param msg
     *            the message string to be logged
     */
    public void error(String msg);

    /**
     * Log a message at the ERROR level according to the specified format and arguments. <br>
     * <p>
     * This form avoids superfluous string concatenation when the logger is disabled for the ERROR level. However, this variant incurs the hidden (and
     * relatively small) cost of creating an <code>Object[]</code> before invoking the method, even if this logger is disabled for ERROR.
     * </p>
     *
     * @param format
     *            the format string
     * @param arguments
     *            a list of 3 or more arguments
     */
    public void error(String format, Object... arguments);

    /**
     * Log an exception (throwable) at the ERROR level with an accompanying message.
     *
     * @param msg
     *            the message accompanying the exception
     * @param t
     *            the exception (throwable) to log
     */
    public void error(String msg, Throwable t);
}
