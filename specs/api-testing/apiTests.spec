# Api Testleri

## Get request testi

* API- e GET request gonder "https://jsonplaceholder.typicode.com/posts/1"
* Status kodu "200" olmalidir
* Json cavabinda "title" deyeri "sunt aut facere repellat provident occaecati excepturi optio reprehenderit" olmalidir
* Json cavabinda "body" deyeri bos olmamalidir

## Get request header content-Type testi

* API- e GET request gonder "https://jsonplaceholder.typicode.com/posts/1"
* Status kodu "200" olmalidir
* Header "Content-Type" deyeri "application/json; charset=utf-8" olmalidir


## Get request header server testi

* API- e GET request gonder "https://jsonplaceholder.typicode.com/posts/1"
* Status kodu "200" olmalidir
* Header "Server" movcud olmalidir

## Get request suscipit metni ehtiva etmelidir testi

* API- e GET request gonder "https://jsonplaceholder.typicode.com/posts/1"
* Status kodu "200" olmalidir
* Body icinde "suscipit" metnini ehtiva etmelidir

## Get request  metnin sunt ile basladigi testi

* API- e GET request gonder "https://jsonplaceholder.typicode.com/posts/1"
* Status kodu "200" olmalidir
* Json cavabinda "title" deyeri "sunt" ile baslayir


## Get request time testi

* API- e GET request gonder "https://jsonplaceholder.typicode.com/posts/1"
* Status kodu "200" olmalidir
* Respons cavab muddeti "500" saniyeden az olmalidir

## Get request userID deyeri intdir testi

* API- e GET request gonder "https://jsonplaceholder.typicode.com/posts/1"
* Status kodu "200" olmalidir
* Json cavabinda "userId" deyeri ededdir


## Get request cavabinda acar sozler testi

* API- e GET request gonder "https://jsonplaceholder.typicode.com/posts/1"
* Status kodu "200" olmalidir
* Json cavabinda verilen keyler movcuddur: "userId,title,body,id"




