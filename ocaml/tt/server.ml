open Core.Std
open Async.Std
open Opium.Std
open Cow
open Posts

let compute = begin fun _ ->
        let rec fib = function
                0 -> 0
                | 1 -> 1
                | n -> fib (n-1) + fib (n-2) in

                let value = fib 40 in
                        `String (string_of_int value)
end

let root = get "/" begin fun _ ->
        Log.Global.info "A request you say" ;
        compute() |> respond'
end

let _ =
        App.empty
        |> posts
        |> root
        |> App.command
        |> Command.run
