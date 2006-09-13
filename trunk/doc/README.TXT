Log4J Swing Appender is a simple Log4J appender that send it's output to a Swing window.
It's main purpose is to help developers debug a system.
While developing software we often use logging as a means of debugging. These logs are
usually send either to the System console or to a file. Neither of these are very conducive
to debug a system. The console loses earlier log statements and may also have a lot of
real time output making it difficult to read the logs. A file is cumbersome to open and
constantly reload while a program is running.

The Log4JSwingAppender send the logs to a scrollable Swing window which preserves all previous
messages. You can also pause the messages while you are reading something imprtant. The 
messages will not be lost. They will be flushed into the window when the application is
restarted. If you are not particularly interested in seeing log messages generated for
some time, then the UI can be asked to stop accepted messages. These messages will not be
stored in any buffer and will never appear in the window.

Usage:
Use this line in your log4j-config.properties file.

log4j.appender.A1=com.omniscient.log4jcontrib.swingappender.SwingAppender

I have assumed that A1 is the appender that will send log statements to the Swing window.
