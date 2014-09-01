{-# LANGUAGE OverloadedStrings #-}
import Web.Scotty
import Data.Text.Lazy

import Data.Monoid (mconcat)

text_of_int = pack . show

int_of_text = read

fib 0 = 1
fib 1 = 1
fib n = fib (n-1) + fib (n-2)

main = scotty 3000 $ do
    get "/:n" $ do
        n <- param "n"
        html (text_of_int $ fib $ int_of_text n)
