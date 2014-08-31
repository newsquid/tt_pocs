#Install:
Run the following:
> make installprerender
> go get

#Run:
> make

Prerender is running on port 3000 and the go server is running on port 8888
So to view as a normal user open [http://localhost:8888/](http://localhost:8888)

To see the page from the crawlers perspective:
Open [http://localhost:3000/http://localhost:8888](http://localhost:3000/http://localhost:8888) for the frontpage

The crawler will view subpages with #! stuff like this:
[http://localhost:3000/http://localhost:8888/?_escaped_fragment_=/posts/10](http://localhost:3000/http://localhost:8888/?_escaped_fragment_=/posts/10)

#Notes:
We need to add the following header to all pages (as a SPA only on the
index.html page): 
```html
<meta name="fragment" content="!">
```

A link will then have to look like:
```html
<a href="#!/posts/{{post.Id}}">{{post.Title}}</a>
```

And the AngularJS router will look like this:
```javascript
    $routeProvider.when("/!/posts/:id",{
        templateUrl: "views/post.html",
        controller: "postController"
    });
```

The header will tell the crawler what to put in the ?_escape_fragment_=...
Prerender will use that for the correct url #/!/...
