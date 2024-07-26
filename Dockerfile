FROM gradle:8.7-jdk21 AS build

VOLUME ["/app"]

WORKDIR /app

RUN git config --global --add safe.directory /app

ENTRYPOINT ["gradle"]

CMD ["bootRun", "--info"]
