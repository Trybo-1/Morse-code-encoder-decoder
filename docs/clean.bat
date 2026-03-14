REM N.Vally Omar 224235491
REM CSC02A2
REM This batch file cleans a project for submission

REM Turn echo off and clear the screen
@echo off
cls

REM Good batch file coding practice
setlocal enabledelayedexpansion

REM Setting Paths for Java
echo Change JAVA_HOME path
REM SET JAVA_HOME=
SET PATH=%PATH%
Set Path=%JAVA_HOME%

REM Move to correct folder
echo Build script set to run in Project folder
cd ..

REM Variables for batch
set ERRMSG=
set PRAC_BIN=.\bin
set PRAC_DOCS=.\docs
set PRAC_LIB=.\lib\*
set PRAC_SRC=.\src

REM Clean all class files from bin folder and remove JavaDoc
echo ~~~ Cleaning project ~~~
DEL /S %PRAC_BIN%\*.class
@ECHO ON
RMDIR /Q /S %PRAC_DOCS%\JavaDoc
DEL /S %PRAC_DOCS%\ByteCode.txt
@ECHO OFF
IF /I "%ERRORLEVEL%" NEQ "0" (
    echo !!! Error cleaning project !!!
)

REM Move back to docs folder and wait
echo ~~~ End ~~~
cd %PRAC_DOCS%
pause