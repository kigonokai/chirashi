#!/bin/sh
app_path=$0
while APP_HOME=${app_path%"${app_path##*/}"}; [ -h "$app_path" ]; do
    ls=$( ls -ld "$app_path" )
    link=${ls#*' -> '}
    case $link in (/*) app_path=$link ;; (*) app_path=$APP_HOME$link ;; esac
done
APP_BASE_NAME=${0##*/}
APP_HOME=$( cd -P "${APP_HOME:-./}" > /dev/null && printf '%s\n' "$PWD" ) || exit
JAVACMD=java
DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'
set -- "-Dorg.gradle.appname=$APP_BASE_NAME" -jar "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" "$@"
eval "set -- \$(printf '%s\n' \"\$DEFAULT_JVM_OPTS \$JAVA_OPTS \$GRADLE_OPTS\" | xargs -n1 | sed ' s~[^-[:alnum:]+,./:=@_]~\\\\&~g; ' | tr '\n' ' ')" '"$@"'
exec "$JAVACMD" "$@"
