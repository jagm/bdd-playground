<html>
    <title>Main</title>
<body>
	<h1>${message}</h1>

    <ul>
        <li><a href="/bdd/test">Test</a></li>
    </ul>

    <a href="/bdd/transform" class="action" data-message="${message}">Transform message</a>

    <div id="transform-result"></div>


    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
    <script>
        var $result = $('#transform-result');
        $('a.action').click(function () {
            var $link = $(this);
            $result.load($link.attr('href'), $link.data());
            return false;
        });
    </script>
</body>
</html>