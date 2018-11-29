<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height: 100%">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息管理与分析系统</title>
<!-- 引入CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- 引入JS -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/echarts.min.js"></script>


<script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/echarts.min.js"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts-gl/echarts-gl.min.js"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts-stat/ecStat.min.js"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/extension/dataTool.min.js"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/china.js"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/world.js"></script>
       <script type="text/javascript" src="https://api.map.baidu.com/api?v=2.0&ak=ZUONbpqGBsYGXNIYHicvbAbM"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/extension/bmap.min.js"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/simplex.js"></script>






<style type="text/css">
strong {
	font-size: 50px;
	font-weight: bolder;
	color: #FF6666;
}
</style>
<script type="text/javascript">
	
</script>
</head>
<body style="height: 100%; margin: 0">
	<div class="jumbotron">
		<div class="container">
			<h1>
				<span class="glyphicon glyphicon-signal"></span> 学生数据统计<small>2018年高考数据概述</small>
			</h1>
			<h2>
				<span class="glyphicon glyphicon-cloud"></span> 高考数据分析
			</h2>
			<p class="lead" style="color: #999999;">
				2018年北京各地共有 <strong>${maps['total']}</strong>名学生参加了本次高考;<br />
				一本线(550分)<strong>${maps['f']}</strong>人,过二本线(450分)<strong>${maps['s']}</strong>人,
				过专科线(250分)有<strong>${maps['t']}</strong>人,落选了<strong>${maps['o']}</strong>人;
			</p>
			<h2>
				<span class="glyphicon glyphicon-cloud"></span> 详细内容请看统计图表
			</h2>
			<h3>
				<span class="glyphicon glyphicon-stats"></span>
				2018年北京市各区参加考试人数情况统计图
			</h3>
			<div id="main" style="width: 1200px; height: 500px;"></div>
			
			<script type="text/javascript">
				$.post("${pageContext.request.contextPath}/stuChart1",function(result){
					
					var mychart = echarts.init(document.getElementById('main'));
					var option = {
						    xAxis: {
						        type: 'category',
						        data: result[0]
						    },
						    yAxis: {
						        type: 'value'
						    },
						    series: [{
						        data: result[1],
						        type: 'bar'
						    }]
						};
					mychart.setOption(option);

				});
			</script>
			
			
			
			<h3>
				<span class="glyphicon glyphicon-stats"></span>
				2018年北京市各分数线的占比情况统计图
			</h3>
			<div id="main3" style="width: 1200px; height: 500px;"></div>
			<script type="text/javascript">
				$.post("${pageContext.request.contextPath}/stuChart3",function(result3){
					
					var dom = document.getElementById("main3");
					var myChart = echarts.init(dom);
					var app = {};
					option = null;
					option = {
					    title : {
					        text: '统计各分数线的占比情况',
					        subtext: '纯属虚构',
					        x:'center'
					    },
					    tooltip : {
					        trigger: 'item',
					        formatter: "{a} <br/>{b} : {c} ({d}%)"
					    },
					    legend: {
					        orient: 'vertical',
					        left: 'left',
					        data: ['一本录取','二本录取','专科录取','未录取']
					    },
					    series : [
					        {
					            name: '访问来源',
					            type: 'pie',
					            radius : '55%',
					            center: ['50%', '60%'],
					            data:[
					                {value:result3[0], name:'一本录取'},
					                {value:result3[1], name:'二本录取'},
					                {value:result3[2], name:'专科录取'},
					                {value:result3[3], name:'未录取'}
					               
					            ],
					            itemStyle: {
					                emphasis: {
					                    shadowBlur: 10,
					                    shadowOffsetX: 0,
					                    shadowColor: 'rgba(0, 0, 0, 0.5)'
					                }
					            }
					        }
					    ]
					};
					;
					if (option && typeof option === "object") {
					    myChart.setOption(option, true);
					}

				});
			</script>
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			<h3>
				<span class="glyphicon glyphicon-stats"></span>
				2018年统计每个区的参加考试人数统计图
			</h3>
			<div id="main2" style="width: 1300px; height: 500px;"></div>
				<script type="text/javascript">
				$.post("${pageContext.request.contextPath}/stuChart2",function(result2){
					var dom = document.getElementById("main2");
					var myChart = echarts.init(dom);
					var app = {};
					option = null;
					var posList = [
					    'left', 'right', 'top', 'bottom',
					    'inside',
					    'insideTop', 'insideLeft', 'insideRight', 'insideBottom',
					    'insideTopLeft', 'insideTopRight', 'insideBottomLeft', 'insideBottomRight'
					];

					app.configParameters = {
					    rotate: {
					        min: -90,
					        max: 90
					    },
					    align: {
					        options: {
					            left: 'left',
					            center: 'center',
					            right: 'right'
					        }
					    },
					    verticalAlign: {
					        options: {
					            top: 'top',
					            middle: 'middle',
					            bottom: 'bottom'
					        }
					    },
					    position: {
					        options: echarts.util.reduce(posList, function (map, pos) {
					            map[pos] = pos;
					            return map;
					        }, {})
					    },
					    distance: {
					        min: 0,
					        max: 100
					    }
					};

					app.config = {
					    rotate: 90,
					    align: 'left',
					    verticalAlign: 'middle',
					    position: 'insideBottom',
					    distance: 15,
					    onChange: function () {
					        var labelOption = {
					            normal: {
					                rotate: app.config.rotate,
					                align: app.config.align,
					                verticalAlign: app.config.verticalAlign,
					                position: app.config.position,
					                distance: app.config.distance
					            }
					        };
					        myChart.setOption({
					            series: [{
					                label: labelOption
					            }, {
					                label: labelOption
					            }, {
					                label: labelOption
					            }, {
					                label: labelOption
					            }]
					        });
					    }
					};


					var labelOption = {
					    normal: {
					        show: true,
					        position: app.config.position,
					        distance: app.config.distance,
					        align: app.config.align,
					        verticalAlign: app.config.verticalAlign,
					        rotate: app.config.rotate,
					        formatter: '{c}  {name|{a}}',
					        fontSize: 16,
					        rich: {
					            name: {
					                textBorderColor: '#fff'
					            }
					        }
					    }
					};

					option = {
					    color: ['#003366', '#006699',  '#e5323e'],
					    tooltip: {
					        trigger: 'axis',
					        axisPointer: {
					            type: 'shadow'
					        }
					    },
					    legend: {
					        data: ['一本', '二本', '专科']
					    },
					    toolbox: {
					        show: true,
					        orient: 'vertical',
					        left: 'right',
					        top: 'center',
					        feature: {
					            mark: {show: true},
					            dataView: {show: true, readOnly: false},
					            magicType: {show: true, type: ['line', 'bar', 'stack', 'tiled']},
					            restore: {show: true},
					            saveAsImage: {show: true}
					        }
					    },
					    calculable: true,
					    xAxis: [
					        {
					            type: 'category',
					            axisTick: {show: false},
					            data: result2[0]
					        }
					    ],
					    yAxis: [
					        {
					            type: 'value'
					        }
					    ],
					    series: [
					        {
					            name: '一本',
					            type: 'bar',
					            barGap: 0,
					            label: labelOption,
					            data: result2[1]
					        },
					        {
					            name: '二本',
					            type: 'bar',
					            label: labelOption,
					            data: result2[2]
					        },
					        {
					            name: '专科',
					            type: 'bar',
					            label: labelOption,
					            data: result2[3]
					        }
					    ]
					};;
					if (option && typeof option === "object") {
					    myChart.setOption(option, true);
					}
					
				});
			</script>
			
			
			
			
		</div>
	</div>
</body>
</html>