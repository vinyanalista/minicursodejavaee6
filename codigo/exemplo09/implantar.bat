@echo off
echo.
echo *******************************************************************************
echo Exemplo 09
echo *******************************************************************************
echo.
call mvn clean package jboss-as:deploy
pause