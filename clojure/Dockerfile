FROM java:8

RUN apt-get update

RUN apt-get install -y unzip

ADD http://central.maven.org/maven2/org/clojure/clojure/1.6.0/clojure-1.6.0.zip clojure.zip

RUN unzip clojure.zip

WORKDIR clojure-1.6.0

ENTRYPOINT ["java","-cp","clojure-1.6.0.jar"]

CMD ["clojure.main"]
