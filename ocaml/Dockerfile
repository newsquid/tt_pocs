FROM ubuntu:14.04

RUN apt-get update
RUN apt-get install -y curl build-essential m4 zlib1g-dev \
	libssl-dev ocaml ocaml-native-compilers opam

RUN /bin/yes | opam init

RUN eval `opam config env`

RUN echo 'eval `opam config env' > /etc/.profile

RUN opam install -y core utop \
   async yojson core_extended core_bench \
   cohttp async_graphics cryptokit

RUN apt-get install -y camlp4-extra
RUN opam install -y opium

ADD tt /app
ADD scripts/start.sh /start

ENTRYPOINT ["/start"]

WORKDIR /app
