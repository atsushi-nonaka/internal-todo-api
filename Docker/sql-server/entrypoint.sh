#/opt/mssql/bin/sqlservr & /docker-entrypoint-initdb.d/import-data.sh
/docker-entrypoint-initdb.d/import-data.sh & /opt/mssql/bin/sqlservr