
$(document).ready(function () {
    $("button").click(function () {
        $.get("/ReqAndRep/name/second.action", {
                name: "菜鸟教程",
                url: "http://www.runoob.com"
            },
            function (data, status) {
            var bean = eval("("+data+")");
            console.log("data = "+data );
            $("p#showResult").text(data+"1234");
                alert("数据: \n" + data + "\n状态: " + status);
            });
    });

})

