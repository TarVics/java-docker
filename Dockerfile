FROM openjdk:17-alpine

MAINTAINER Some Dev

RUN apk add bash

RUN mkdir /app
#RUN mkdir -p $HOME/qqq
RUN mkdir /app/files
WORKDIR /app

COPY wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh
