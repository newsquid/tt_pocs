.PHONY: build run stop

all: run

build:
	docker build -t tt_ocaml .

run: stop
	docker run -p 80:80 -d -v `pwd`/tt:/app --name tt_ocaml tt_ocaml make
	docker logs -f tt_ocaml

stop:
	-@docker stop -t 2 tt_ocaml
	-@docker rm -v tt_ocaml
