FROM gradle:5.6.4-jdk8 as builder
COPY --chown=gradle . /uitests
WORKDIR /uitests
RUN gradle -s shadowJar
COPY ./config/* /uitests/build/libs/config/

ENTRYPOINT exec java -jar /uitests/build/libs/eotinish_ui_tests-all.jar