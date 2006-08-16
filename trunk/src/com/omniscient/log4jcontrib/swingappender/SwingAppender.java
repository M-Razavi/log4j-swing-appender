/**
 * 
 */
package com.omniscient.log4jcontrib.swingappender;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

import com.omniscient.log4jcontrib.swingappender.ui.SwingAppenderUI;

/**
 * @author kalpak
 *
 */
public class SwingAppender extends AppenderSkeleton {

    /** The appender swing UI. */
    private SwingAppenderUI appenderUI = new SwingAppenderUI();

    public SwingAppender() {

    }

    /* (non-Javadoc)
     * @see org.apache.log4j.AppenderSkeleton#append(org.apache.log4j.spi.LoggingEvent)
     */
    protected void append(LoggingEvent event) {
        if (performChecks()) {
            String logOutput = this.layout.format(event);
            // TODO : Need to add some Throwable specific
            //        stuff as in WriteAppender class.
            appenderUI.doLog(logOutput);
        }
    }

    /* (non-Javadoc)
     * @see org.apache.log4j.Appender#close()
     */
    public void close() {
        // TODO : Opportunity for the appender ui to do any cleanup.
        // appenderUI.close();
        appenderUI = null;
    }

    /* (non-Javadoc)
     * @see org.apache.log4j.Appender#requiresLayout()
     */
    public boolean requiresLayout() {
        return true;
    }

    /**
     * Performs checks to make sure the appender ui is still alive.
     *
     * @return
     */
    private boolean performChecks() {
        return appenderUI != null;
    }
}
