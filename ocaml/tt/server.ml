open Core.Std
open Async.Std
open Opium.Std
open Cow
open Posts

let compute = begin fun _ ->
        Thread.delay 0.5;
        `String "ok";
end

let root = get "/" begin fun _ ->
        Log.Global.info "who?" ;
        compute() |> respond'
end

let _ =
        App.empty
        |> posts
        |> root
        |> App.command
        |> Command.run
