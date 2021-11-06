FROM mcr.microsoft.com/mssql/server:2019-latest

ENV ACCEPT_EULA Y
ENV SA_PASSWORD Atsu/4685
ENV MSSQL_PID Developer
ENV MSSQL_LCID 1041
ENV DB_NAME=ec-site

USER root

WORKDIR /docker-entrypoint-initdb.d

COPY . /docker-entrypoint-initdb.d

RUN chmod +x /docker-entrypoint-initdb.d 

# for windows
RUN sed -i 's/\r//' /docker-entrypoint-initdb.d/import-data.sh 
RUN sed -i 's/\r//' /docker-entrypoint-initdb.d/entrypoint.sh 

EXPOSE 1433

CMD /bin/bash ./entrypoint.sh