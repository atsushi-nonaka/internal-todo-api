#!/bin/bash
sleep 70

echo ---start!---

/opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P $SA_PASSWORD -i init.sql

echo ---end!---