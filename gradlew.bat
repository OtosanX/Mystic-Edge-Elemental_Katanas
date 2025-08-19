@echo off
setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
set APP_HOME=%DIRNAME%

set GRADLE_HOME=%APP_HOME%\gradle\wrapper
set GRADLE_DIST=gradle-8.14.2-all.zip

"%GRADLE_HOME%\gradle-wrapper.jar" %*
