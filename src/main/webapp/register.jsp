<%--
  Created by IntelliJ IDEA.
  User: 舒露
  Date: 2018/10/2
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <%--用户名[GET]：<input type="text" name="username" id="usernameID" maxlength="4"/>光标移出后--%>
    用户名[post]：<input type="text" id="usernameID" maxlength="4"/>光标移出后
</form>
<hr/>
<span id="res"/>
<script>
    function createAJAX() {
        var ajax = null;
        try {
            ajax = new ActiveXObject("microsoft.xmlhttp");
        } catch (e) {
            try {
                ajax = new XMLHttpRequest();
            } catch (e1) {
                alert("浏览器不支持");
            }
        }
        return ajax;
    }
</script>
<%--<script>
    document.getElementById("usernameID").onblur=function () {
        var username=this.value;
        if(username.length===0){
            document.getElementById("res").innerHTML="用户名必填";
        }else {
            username=encodeURI(username);
            var ajax=createAJAX();
            var mathod = "GET";
            var url = "/UserServlet?time=" + new Date().getTime() + "&username=" + username;
            ajax.open(mathod,url);
            ajax.send(null);
            ajax.onreadystatechange=function () {
                if(ajax.readyState==4){
                    if (ajax.status==200){
                        var tip=ajax.responseText;
                        document.getElementById("res").innerHTML=tip;
                    }
                }
                
            }
        }
        alert(username);
    }
</script>--%>
<script>
    document.getElementById("usernameID").onblur = function () {
        var username = this.value;
        var ajax = createAJAX();
        var methom = "post";
        var url = "/UserServlet?time=" + new Date().getTime();
        ajax.open(methom, url);
        ajax.setRequestHeader("content-type", "application/x-www-form-urlencoded");
        var content = "username=" + username;
        ajax.send(content);
        ajax.onreadystatechange = function () {
            if(ajax.readyState===4){
                if(ajax.status===200){
                    var tip = ajax.responseText;
                    var imgElement = document.createElement("img");
                    imgElement.src = tip;
                    imgElement.style.width = "12px";
                    imgElement.style.height = "12px";
                    var spanElement = document.getElementById("res");
                    spanElement.innerHTML = "";
                    spanElement.appendChild(imgElement);
                }
            }
        }

    }
</script>
</body>
</html>
