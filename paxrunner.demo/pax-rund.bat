@echo off
SETLOCAL
set _SCRIPTS_=%~dp0

java -cp ".;%_SCRIPTS_%;%_SCRIPTS_%\pax-runner-1.7.6.jar" org.ops4j.pax.runner.daemon.DaemonLauncher %*
