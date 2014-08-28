.PHONY: run stop

all: run

build:
	docker build -t tt_racket .

run: stop
	docker run -p 80:8000 -it -v `pwd`/tt:/app --name tt_racket tt_racket make

stop:
	-@docker stop -t 2 tt_racket
	-@docker rm -v tt_racket
