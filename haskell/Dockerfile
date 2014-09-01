FROM ubuntu:14.04

RUN apt-get update
RUN apt-get install -y haskell-platform
RUN apt-get install -y make

RUN cabal update
RUN cabal install scotty

ADD ./sources/ /sources
