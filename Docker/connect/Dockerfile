FROM custom/kafka/broker

MAINTAINER Selcuk SERT <selcuk.sert@gmail.com>

ARG KAFKA_VERSION=5.4.1
ARG AVRO_VERSION=1.9.1
ARG MYSQL_CON_VERSION=8.0.19

ADD ./scripts/*.sh ${KAFKA_HOME}/bin/
ADD ./config/*.properties ${KAFKA_HOME}/config/

RUN wget -q -P ${KAFKA_HOME}/libs/ https://packages.confluent.io/maven/io/confluent/kafka-schema-registry-client/${KAFKA_VERSION}/kafka-schema-registry-client-${KAFKA_VERSION}.jar && \
wget -q -P ${KAFKA_HOME}/libs/ https://packages.confluent.io/maven/io/confluent/kafka-connect-avro-converter/${KAFKA_VERSION}/kafka-connect-avro-converter-${KAFKA_VERSION}.jar && \
wget -q -P ${KAFKA_HOME}/libs/ https://packages.confluent.io/maven/io/confluent/kafka-avro-serializer/${KAFKA_VERSION}/kafka-avro-serializer-${KAFKA_VERSION}.jar && \
wget -q -P ${KAFKA_HOME}/libs/ https://packages.confluent.io/maven/io/confluent/common-utils/${KAFKA_VERSION}/common-utils-${KAFKA_VERSION}.jar && \
wget -q -P ${KAFKA_HOME}/libs/ https://packages.confluent.io/maven/io/confluent/common-config/${KAFKA_VERSION}/common-config-${KAFKA_VERSION}.jar && \
wget -q -P ${KAFKA_HOME}/libs/ https://repo1.maven.org/maven2/org/apache/avro/avro/${AVRO_VERSION}/avro-${AVRO_VERSION}.jar && \
wget -q -P ${KAFKA_HOME}/libs/ https://repo1.maven.org/maven2/mysql/mysql-connector-java/${MYSQL_CON_VERSION}/mysql-connector-java-${MYSQL_CON_VERSION}.jar && \
mkdir ${KAFKA_HOME}/plugins/ && \
wget -q -P ${KAFKA_HOME}/plugins/ https://packages.confluent.io/maven/io/confluent/kafka-connect-jdbc/${KAFKA_VERSION}/kafka-connect-jdbc-${KAFKA_VERSION}.jar

WORKDIR ${KAFKA_HOME}/bin

ENTRYPOINT ["start.sh"]