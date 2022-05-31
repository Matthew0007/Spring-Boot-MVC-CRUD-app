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
<p>hello world</p>
<a href="/"><- home</a>
<form action="/post/${post.id}" method="POST">
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

<form action="/post/delete/${post.id}" method="POST">
    <input type="submit" value="delete"/>
</form>



<#if post?has_content>
    ${post.title} <br>
    ${post.body} <br>
    ${post.date} <br>
</#if>


</body>
</html>