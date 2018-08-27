
@rem mvn install:install-file -Dfile=checkstyle-8.12-all.jar -DgroupId=com.puppycrawl.tools -DartifactId=checkstyle -Dversion=8.12-all -Dpackaging=jar

@SET maven-repo=%USERPROFILE%\.m2\repository
@SET checkstyle-version=8.12-all
@SET checkstyle-jar=%maven-repo%\com\puppycrawl\tools\checkstyle\%checkstyle-version%\checkstyle-%checkstyle-version%.jar
@SET configs-version=0.1
@SET configs-jar=%maven-repo%\net\cactusthorn\maven-build-tools\%configs-version%\maven-build-tools-%configs-version%.jar

@java -cp %configs-jar%;%checkstyle-jar% -Duser.language=en -DsuppressionsFile=/checkstyle_suppressions.xml com.puppycrawl.tools.checkstyle.Main -f plain -c /checkstyle_checks.xml .