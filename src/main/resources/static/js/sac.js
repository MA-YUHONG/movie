$("#btn1").click(function(){
    $("#ifra").children().remove()
    if ($("#input1").val() == "" || $("#input1").val() == null) {
        var ifraUrl = parent.document.getElementById("content_info").contentWindow.location.href
        $("#ifra").append("<iframe sandbox='allow-top-navigation allow-same-origin allow-forms allow-scripts' id=\"iframe1\" src=\"https://z1.m1907.cn/?jx=" + ifraUrl + "\"    frameBorder=\"0\" width=\"100%\"  height=\"100%\"  allowfullscreen=\"true\"  ></iframe>")
        return;
    }
    $("#ifra").append("<iframe id=\"iframe1\" src=\"https://www.xymav.com/?url="+$("#input1").val()+"\"    frameBorder=\"0\" width=\"100%\"  height=\"100%\"  allowfullscreen=\"true\"  ></iframe>")



})
$("#btn2").click(function(){
    $("#ifra").children().remove()
    if ($("#input1").val() == "" || $("#input1").val() == null) {
        var ifraUrl = parent.document.getElementById("content_info").contentWindow.location.href
        $("#ifra").append("<iframe sandbox='allow-top-navigation allow-same-origin allow-forms allow-scripts' id=\"iframe1\" src=\"https://z1.m1907.cn/?jx=" + ifraUrl + "\"    frameBorder=\"0\" width=\"100%\"  height=\"100%\"    allowfullscreen=\"true\"  ></iframe>")
        return;
    }

    $("#ifra").append("<iframe id=\"iframe1\" src=\"https://www.playm3u8.cn/jiexi.php?url="+$("#input1").val()+"\"    frameBorder=\"0\" width=\"100%\"  height=\"100%\"  allowfullscreen=\"true\"  ></iframe>")

    // $("#iframe1").attr("src","https://www.playm3u8.cn/jiexi.php?url="+$("#input1").val());


})
$("#btn3").click(function(){
    $("#ifra").children().remove()
    if ($("#input1").val() == "" || $("#input1").val() == null) {
        var ifraUrl = parent.document.getElementById("content_info").contentWindow.location.href
        $("#ifra").append("<iframe sandbox='allow-top-navigation allow-same-origin allow-forms allow-scripts' id=\"iframe1\" src=\"https://z1.m1907.cn/?jx=" + ifraUrl + "\"    frameBorder=\"0\" width=\"100%\"  height=\"100%\"  allowfullscreen=\"true\"  ></iframe>")
        return;
    }

    $("#ifra").append("<iframe id=\"iframe1\" src=\"http://jqaaa.com/jx.php?url="+$("#input1").val()+"\"    frameBorder=\"0\" width=\"100%\"  height=\"100%\"  allowfullscreen=\"true\"  ></iframe>")

    // $("#iframe1").attr("src"," http://jqaaa.com/jx.php?url="+$("#input1").val());


})
$("#btn4").click(function(){
    $("#ifra").children().remove()
    if ($("#input1").val() == "" || $("#input1").val() == null) {
        var ifraUrl = parent.document.getElementById("content_info").contentWindow.location.href
        $("#ifra").append("<iframe sandbox='allow-top-navigation allow-same-origin allow-forms allow-scripts' id=\"iframe1\" src=\"https://z1.m1907.cn/?jx=" + ifraUrl + "\"    frameBorder=\"0\" width=\"100%\"  height=\"100%\"  allowfullscreen=\"true\"  ></iframe>")
        return;
    }
    $("#ifra").append("<iframe id=\"iframe1\" src=\"https://www.nxflv.com/?url="+$("#input1").val()+"\"    frameBorder=\"0\" width=\"100%\"  height=\"100%\"  allowfullscreen=\"true\"  ></iframe>")



})
$("#btn5").click(function(){
    $("#ifra").children().remove()
    if ($("#input1").val() == "" || $("#input1").val() == null) {
        var ifraUrl = parent.document.getElementById("content_info").contentWindow.location.href
        $("#ifra").append("<iframe sandbox='allow-top-navigation allow-same-origin allow-forms allow-scripts' id=\"iframe1\" src=\"https://z1.m1907.cn/?jx=" + ifraUrl + "\"    frameBorder=\"0\" width=\"100%\"  height=\"100%\"  allowfullscreen=\"true\"  ></iframe>")
return;
    }

    $("#ifra").append("<iframe id=\"iframe1\" src=\"https://z1.m1907.cn/?jx="+$("#input1").val()+"\"    frameBorder=\"0\" width=\"100%\"  height=\"100%\"  allowfullscreen=\"true\"  ></iframe>")

    // $("#iframe1").attr("src","https://www.playm3u8.cn/jiexi.php?url="+$("#input1").val());


})
