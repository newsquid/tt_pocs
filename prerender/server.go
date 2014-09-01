package main

import (
	"github.com/go-martini/martini"
	"log"
	"net/http"
)

func main() {
	m := martini.Classic()
	m.Get("/posts", func() string {
		return "[{\"Id\":10, \"Title\":\"Hello\"}]"
	})
	m.Get("/posts/:id", func(params martini.Params) string {
		return "{\"Id\":10, \"Title\":\"Hello\"}"
	})

	m.Use(martini.Static("site"))
	log.Fatal(http.ListenAndServe(":8888", m))
}
