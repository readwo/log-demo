/**
 *  实现日志的几种方式(实现库)
 *  1.1  j.u.l: 是java.util.logging包的简称，是JDK在1.4版本中引入的Java原生日志框架。
 *              Java Logging API提供了七个日志级别用来控制输出。
 *              这七个级别分别是：SEVERE、WARNING、INFO、CONFIG、FINE、FINER、FINEST。
 *
 * 1.2   Log4j: Log4j是Apache的一个开源项目，通过使用Log4j，
 *              我们可以控制日志信息输送的目的地是控制台、文件、GUI组件，
 *              甚至是套接口服务器、NT的事件记录器、UNIX Syslog守护进程等；
 *              我们也可以控制每一条日志的输出格式；
 *              通过定义每一条日志信息的级别，我们能够更加细致地控制日志的生成过程。
 *              Log4也有七种日志级别：OFF、FATAL、ERROR、WARN、INFO、DEBUG和TRACE。
 *              最令人感兴趣的就是，这些可以通过一个配置文件来灵活地进行配置，而不需要修改应用的代码。
 *
 * 1.3  LogBack: LogBack也是一个很成熟的日志框架，其实LogBack和Log4j出自一个人之手，
 *              logback当前分成三个模块：logback-core,logback- classic和logback-access。
 *              logback-core是其它两个模块的基础模块。
 *              logback-classic是Log4j的一个改良版本。此外logback-classic完整实现SLF4J API使你可以很方便地更换成其它日记系统如Log4j或j.u.l。
 *              logback-access访问模块与Servlet容器集成提供通过Http来访问日记的功能。
 *
 * 1.4  Log4j2:   Log4j2已经不仅仅是Log4j的一个升级版本了，而是从头到尾被重写的，
 *                  这可以认为这其实就是完全不同的两个框架。
 *
 *
 *
 *
 *
 *  平时我们都用日志门面api，阿里巴巴强制开发手册也强调了这一点，有利于维护和各个类的日志处理方式统一
 *
 *  2.1 以前会使用commons-logging(Jakarta  Commons-logging)，
 *        它是apache最早提供的日志的门面接口。提供简单的日志实现以及日志解耦功能。
 *
 *  2.2 现在一般都用slf4j(Java简易日志门面Simple Logging Facade for Java，缩写SLF4J）
 *      是一套包装Logging 框架的界面程式，以外观模式实现。
 *      可以在软件部署的时候决定要使用的 Logging 框架，
 *      目前主要支援的有Java Logging API、Log4j及logback等框架。
 *    作者宣称SLF4J 比 Log4j 更有效率，而且比 Apache Commons Logging (JCL) 简单、稳定。
 *
 *
 */

/**
 * 本代码总结
 * slf4j-log4j12:与log4j联合使用，用于使当前项目的log4j实现slf标准
 * log4j-slf4j-impl:与log4j2联合使用，用于使当前项目的log4j实现slf标准
 * log4j-over-slf4j:与剔除log4j联合使用，替换log4j，使log4j实现slf。用于让单独用log4j的依赖能遵循slf，进而统一日志配置。
 * log4j-to-slf4j:与剔除log4j2联合使用，替换log4j2，使log4j2实现slf。用于让单独用log4j2的依赖能遵循slf，进而统一日志配置。
 */

