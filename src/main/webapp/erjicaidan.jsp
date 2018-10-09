<%--
  Created by IntelliJ IDEA.
  User: 舒露
  Date: 2018/10/2
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>联动二级菜单</title>
</head>
<body>
<select id="provinceID">
    <option>选择省份</option>
    <option>湖南</option>
    <option>广东</option>
</select>
<select id="cityID">
    <option>选择城市</option>
</select>
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
<script>
    document.getElementById("provinceID").onchange = function () {
        //清空城市下拉框中的内容，除第一项外
        var cityElement = document.getElementById("cityID");
        cityElement.options.length = 1;
        //获取选中option标签的索引号，从0开始
        var index = this.selectedIndex;
        //定位选中的option标签
        var optionElement = this[index];
        //获取选中的option标签中的内容，即省份
        var province = optionElement.innerHTML;
        if ("选择省份" !== province) {
            var ajax = createAJAX();
            var methon = "post";
            var url = "/ProvinceCityServlet?time=" + new Date().getTime();
            ajax.open(methon, url);
            ajax.setRequestHeader("content-type","application/x-www-form-urlencoded");
            var content = "province=" + province;
            ajax.send(content);
            ajax.onreadystatechange = function () {
                if (ajax.readyState === 4) {
                    if (ajax.status === 200) {
                        var xmlDocument = ajax.responseXML;
                        //NO6)按照DOM规则，解析XML文档
                        var cityElementArray = xmlDocument.getElementsByTagName("city");
                        var size = cityElementArray.length;
                        for (var i = 0; i < size; i++) {
                            //innerHTML只能用在html/jsp中，不能用在xml中
                            var city = cityElementArray[i].firstChild.nodeValue;
                            //<option></option>
                            var optionElement = document.createElement("option");
                            //<option>广州</option>
                            optionElement.innerHTML = city;
                            //<select><option>广州</option></select>
                            cityElement.appendChild(optionElement);
                        }
                    }
                }
            }
        }
    }
</script>
</body>
</html>
