
@rem mvn install:install-file -Dfile=checkstyle-8.12-all.jar -DgroupId=com.puppycrawl.tools -DartifactId=checkstyle -Dversion=8.12-all -Dpackaging=jar

@SET checkstyle-version=8.12-all
@SET checkstyle-jar=%USERPROFILE%\.m2\repository\com\puppycrawl\tools\checkstyle\%checkstyle-version%\checkstyle-%checkstyle-version%.jar

@java -Duser.language=en -DsuppressionsFile=checkstyle_suppressions.xml -jar %checkstyle-jar% -f plain -c checkstyle_checks.xml .