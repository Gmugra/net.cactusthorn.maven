
@rem mvn clean install -DskipTests

@SET project-maven-repo=./project-maven-repository
@SET checkstyle-version=8.12-all
@SET checkstyle-jar=%project-maven-repo%\com\puppycrawl\tools\checkstyle\%checkstyle-version%\checkstyle-%checkstyle-version%.jar

@SET maven-repo=%USERPROFILE%\.m2\repository
@SET configs-version=0.1
@SET configs-jar=%maven-repo%\net\cactusthorn\maven\build-tools\%configs-version%\build-tools-%configs-version%.jar

java -cp %configs-jar%;%checkstyle-jar% -Duser.language=en -DsuppressionsFile=/checkstyle_suppressions.xml com.puppycrawl.tools.checkstyle.Main -f plain -c /checkstyle_checks.xml .