@echo off
:: Executar com o JBoss AS ja iniciado
echo.
echo *******************************************************************************
echo Exemplo 08
echo *******************************************************************************
echo.
call mvn clean compile package jboss-as:deploy
echo.
echo A aplicacao ja pode ser acessada pelo endereco http://localhost:8080/exemplo08/
pause