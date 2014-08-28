#lang racket

(require (planet dmac/spin))

(get "/"
  (lambda () "Hello!"))

(run)
