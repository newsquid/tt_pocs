open Core.Std
open Async.Std
open Opium.Std
open Cow

module Post = struct
        open Caml
        type t = {
                name: string;
        } with json
end


let posts = get "/posts" begin fun _ ->
        let post = {
                Post.name = "Posty";
        } in `Json (Post.json_of_t post) |> respond'
end
