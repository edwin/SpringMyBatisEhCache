<!DOCTYPE html>
<html lang="en">
    <head>
        <title>EhCache Test</title>
        <meta name="author" content="edwin">
    </head>
    <body>
        <div id='allTesting'>

        </div>
        <hr />
        <div id='oneTesting'>

        </div>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script>
            $(document).ready(function() {
                $.post(
                        "${pageContext.request.contextPath}/get", function(data) {
                            $.each(data, function(index, item) {
                                $('#allTesting').append(" <a href='javascript:void(0)' class='detail' detail='" + item.id + "'>" + item.name + "</a> " + item.address + " <br />");
                            });
                        });
            });

            $(document).on('click', ".detail", function() {
                $.post( "${pageContext.request.contextPath}/get/" + $(this).attr("detail"), function(data) {
                    $('#oneTesting').html(data.id + " " + data.name + " " + data.address);
                });
            });
        </script>
    </body>
</html>
