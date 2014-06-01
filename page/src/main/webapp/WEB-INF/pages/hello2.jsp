<html>
<title>Test</title>

<body>
<h1>${message}</h1>

<ul>
    <li><a href="/bdd">Main</a></li>
</ul>

<a href="/bdd/transform" class="action" data-message="${message}">Transform message</a>

<div id="transform-result"></div>

<div id="browser-test"></div>


<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script>
    var $result = $('#transform-result');
    $('a.action').click(function () {
        var $link = $(this);
        $result.load($link.attr('href'), $link.data());
        return false;
    });
    $('#browser-test').text((~navigator.userAgent.indexOf('MSIE') ? 'to jest IE! ' : 'nope ') + navigator.userAgent);
</script>
</body>
</html>