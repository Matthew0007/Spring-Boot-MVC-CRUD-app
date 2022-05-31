<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="/addPost" method="post">
    <div>title:</div>
    <input type="text" name="title"/>
    <br/><br/>
    <div>body:</div>
    <input type="text" name="body"/>
    <br/><br/>
    <input type="date" name="date"/>
    <br/><br/>
    <input type="submit" value="Submit"/>
    <input type="reset" value="Reset"/>
</form>
<p>hello world</p>
<#list posts as post>
    <a href='/post/${post.id}'> ${post.title} <br></a>
</#list>



</body>
</html>