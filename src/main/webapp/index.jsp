<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <script src="${pageContext.request.contextPath}/fusioncharts-suite-xt/js/fusioncharts.charts.js"></script>
    <script src="${pageContext.request.contextPath}/fusioncharts-suite-xt/js/fusioncharts.js"></script>

    <title>Title</title>
</head>
<body onload="load()">
    <div id="chartContainer">条形图</div>

    <script>
        
            function load() {
                $.ajax({
                    type: "POST",
                    contentType : 'application/json',
                    processData : false,
                    dataType : 'json',
                    url:"${pageContext.request.contextPath}/getChart.json",
                    success:function (msg) {
                        FusionCharts.ready(function(){
                            var revenueChart = new FusionCharts({
                                "type":"column3d",
                                "renderAt":"chartContainer",
                                "width":"700",
                                "height":"300",
                                "dataFormat":"json",
                                "dataSource":{
                                    "chart": {
                                        "caption": "每个月份的订单数量",
                                        "xAxisName": "日期",
                                        "yAxisName": "数量(个)",
                                        "theme": "fint"
                                    },
                                    "data": msg
                                }
                            });
                            revenueChart.render();
                        });

                                }
                            }
                            );
            }
    </script>



</body>
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</html>
