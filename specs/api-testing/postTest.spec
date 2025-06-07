# API POST Demo Test

## Yeni post yaradilmasi - user 1

* Add base url "https://jsonplaceholder.typicode.com"
* Add endpoint "/posts"
* Add as a header "Content-Type" = "application/json"
* Add body as file from resource "valid-post-user1.json"
* Post request and display response
* Status kodu "201" olmalidir
* Json cavabinda "id" deyeri bos olmamalidir
* Json cavabinda "userId" deyeri ededdir


## Postun silinmesi testi

* Add base url "https://jsonplaceholder.typicode.com"
* Add endpoint "/posts/101"
* Add as a header "Content-Type" = "application/json"
* Send DELETE request
* Status kodu "200" olmalidir


## Postun qismen yenilenmesi (PATCH) testi

* Add base url "https://jsonplaceholder.typicode.com"
* Add endpoint "/posts/1"
* Add as a header "Content-Type" = "application/json"
* Add body as file from resource "patch-post.json"
* Send PATCH request
* Status kodu "200" olmalidir
* Json cavabinda "id" deyeri "1" olmalidir
* Json cavabinda "title" deyeri "Update Title PATCH" olmalidir

## Post tam yenilenmesi (PUT)

* Add base url "https://jsonplaceholder.typicode.com"
* Add endpoint "/posts/1"
* Add as a header "Content-Type" = "application/json"
* Add body as file from resource "update-post.json"
* Send PUT request
* Status kodu "200" olmalidir
* Json cavabinda "id" deyeri "1" olmalidir
* Json cavabinda "title" deyeri "Update Title PUT" olmalidir
* Json cavabinda "body" deyeri "Update Body PUT" olmalidir

