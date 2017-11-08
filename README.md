# testLog4j

## How to compile?
``` bash
    mvn clean package
```
## How to run?
``` bash
    java -cp target/testLog4j-1.0-SNAPSHOT-jar-with-dependencies.jar com.yufei.App
```
or if you want to specify a log4j configuration file as argument, you can do this:
``` bash
java -cp target/testLog4j-1.0-SNAPSHOT-jar-with-dependencies.jar -Dlog4j.configuration=file:/Users/yufei.gu/tools/testLog4j/log4j.properties1 com.yufei.App
```
