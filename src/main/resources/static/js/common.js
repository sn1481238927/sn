$(function(){
    layui.use(['layer','laydate','upload','form'],function(){
        var $ = layui.jquery,
        laydate = layui.laydate,
        upload = layui.upload,
        form = layui.form,
        layer = layui.layer;

        

        
        //form标点验证
        form.verify({
            tel:function (value) {
               if(value==""){
                   return '手机号码不能为空';
               };
               if(/^1(3|4|5|7|8)\d{9}$/.test(value)){
                   return '手机号码格式错误';
               };
            },
            name:function(value){
                if(value==""){
                    return '姓名不能为空'
                };
                if(/^[\u4e00-\u9fa5]{2,4}$/.test(value)){
                    return '姓名格式错误';
                }
            },
            sfzcard:function(value) {
                if(value==""){
                    return '身份证号码不能为空';
                };
                if(/(^\d{15})$|(^\d{17}([0-9]|X))$/.test(value)){
                    return '身份证格式错误';
                };
            }
        });

        // 文件上传
        upload.render({
           elem:'#excelid',
           // url:'接口地址',
            accept: 'file',
            exts:'XLS|XLSX|xls|xlsx',//文件格式
            // size:'',//限制文件大小，单位KB，一般不显示文件小
            done:function(res,index,upload){
                if(res.code>0){
                    return layer.msg('上传失败');
                };
            },
            error:function(){
                //上传失败状态回调

            }
        });
        
    });

   
    $('.div2').css('margin-top',($(window).height()-340)/2);
    $('.main .div1').css('top',($(window).height()-340)/4);

    // console.log($('.layui-elem-field1 .layui-field-box .layui-form-item .layui-form-label span').eq(1).text());






});

// 比较两个数组，并返回差集 
function arrayIntersect(arr1, arr2){ 
    var res = new Array();
    for(var i=0; i < arr1.length; i++){ 
        var flag = true; 
        for(var j=0; j < arr2.length; j++){ 
            if(arr1[i] == arr2[j]) 
            flag = false; 
        } 
        if(flag) 
        res.push(arr1[i]); 
    } 
    return res;
} 

// 判断数组是否有重复
function isRepeat(arr){
    var hash = {};
    for(var i in arr) {
        if(hash[arr[i]])
            return true;
        hash[arr[i]] = true;
    }
    return false;
} 

// 获取当前前推日期
function forwardDate(num, paramdate){
    var startDate = new Date();
    if(paramdate){
        var startDate = new Date(paramdate);
    }

    var returnDate =  new Date();
    returnDate.setTime(startDate.getTime()-num*24*60*60*1000);
    var year = returnDate.getFullYear(); //获取年
    var mon = returnDate.getMonth() + 1; //获取月
    var date = returnDate.getDate();     //获取日
    return year+'-'+(mon<10?"0"+mon:mon)+'-'+(date<10?"0"+date:""+date);
}
// 获取当前日期
function todayDate(){
    var nowDate = new Date();
    var year = nowDate.getFullYear(); //获取年
    var mon = nowDate.getMonth() + 1; //获取月
    var date = nowDate.getDate();     //获取日
    return year+'-'+(mon<10?"0"+mon:mon)+'-'+(date<10?"0"+date:""+date);
}
// 获取当前后推日期
function backwardDate(num, paramdate){
    var startDate = new Date();
    if(paramdate){
        var startDate = new Date(paramdate);
    }

    var returnDate =  new Date();
    returnDate.setTime(startDate.getTime()+num*24*60*60*1000);
    var year = returnDate.getFullYear(); //获取年
    var mon = returnDate.getMonth() + 1; //获取月
    var date = returnDate.getDate();     //获取日
    return year+'-'+(mon<10?"0"+mon:mon)+'-'+(date<10?"0"+date:""+date);
}

// 获取当前月份天数
function countMonthDays(month){
    var nowDate = new Date();
    if(month){
        var month = month.split('-');
        var year = month[0]; //获取年
        var mon = month[1]; //获取月
    }else{
        var year = nowDate.getFullYear(); //获取年x
        var mon = nowDate.getMonth() + 1; //获取月
    }

    var monthDate = new Date(year, mon, 0); 
    return monthDate.getDate();   //获取月份的天数
}
// 获取当前月份日期数组
function monthDays(month){
    var nowDate = new Date();
    if(month){
        var month = month.split('-');
        var year = month[0]; //获取年
        var mon = month[1]; //获取月
    }else{
        var year = nowDate.getFullYear(); //获取年x
        var mon = nowDate.getMonth() + 1; //获取月
    }

    var days = [];
    var monthDate = new Date(year, mon, 0); 
    for(var d=1; d<=monthDate.getDate(); d++){  //获取月份的天数
        days.push(d.toString().length==1?"0"+d:""+d);
    }
    return days;
}

// 获取指定日期之间的日期数组
function rangeDays(startDate, endDate){
    var startTime = new Date(startDate);
    var endTime = new Date(endDate);
    var startYear = startTime.getFullYear();
    var endYear = endTime.getFullYear();
    var startMonth = startTime.getMonth();
    var endMonth = endTime.getMonth();

    var startDate = startDate.split('-');
    var startMonthDays = new Date(startDate[0], startDate[1], 0);

    var days = new Array();
    while((endTime.getTime()-startTime.getTime())>=0){
        var year = startTime.getFullYear();
        var month = (startTime.getMonth()+1).toString().length==1?"0"+(startTime.getMonth()+1).toString():(startTime.getMonth()+1);
        var date = startTime.getDate().toString().length==1?"0"+startTime.getDate():""+startTime.getDate();
        if(date <= startMonthDays.getDate()){
            if(startYear !== endYear){
                days.push(year+"-"+month+"-"+date);
            }else{
                if(startMonth !== endMonth){
                    days.push(month+"-"+date);
                }else{
                    days.push(date);
                }
            }
        }
        startTime.setDate(startTime.getDate()+1);
    }
   return days;
}

// 设置X轴初始值数组
function xdefault(len){
    var xVal = new Array();
    for (var i = 0; i <= len; i++) {
        xVal.push("0");
    }
    return xVal;
}
function xdefault2(start, end){
    var len = rangeDays(start, end);
    var xVal = new Array();
    
    var startTime = new Date(start);
    var endTime = new Date(end);

    var days = new Array();
    while((endTime.getTime()-startTime.getTime())>=0){
        var year = startTime.getFullYear();
        var month = (startTime.getMonth()+1).toString().length==1?"0"+(startTime.getMonth()+1).toString():(startTime.getMonth()+1);
        var date = startTime.getDate().toString().length==1?"0"+startTime.getDate():startTime.getDate();
        xVal[year+"-"+month+"-"+date] = 0;

        startTime.setDate(startTime.getDate()+1);
    }
    return xVal;
}


// 比较两个日期大小
function compareDate(s1,s2){
  return ((new Date(s1.replace(/-/g,"\/")))>(new Date(s2.replace(/-/g,"\/"))));
}




//生成从minNum到maxNum的随机数
function randomNum(minNum, maxNum) {
  switch (arguments.length) {
    case 1:
      return parseInt(Math.random() * minNum + 1, 10);
      break;
    case 2:
      return parseInt(Math.random() * ( maxNum - minNum + 1 ) + minNum, 10);
      //或者 Math.floor(Math.random()*( maxNum - minNum + 1 ) + minNum );
      break;
    default:
      return 0;
      break;
  }
}

/**
 * null => ''
 * @param {*} data 要处理的数据
 */
function null2str(data) {
  for (var x in data) {
    if (data[x] === null) { // 如果是null 把直接内容转为 ''
      data[x] = '';
    } else {
      if (Array.isArray(data[x])) { // 是数组遍历数组 递归继续处理
        data[x] = data[x].map(z =>{
          return null2str(z);
        });
      }
      if(typeof(data[x]) === 'object'){ // 是json 递归继续处理
        data[x] = null2str(data[x])
      }
    }
  }
  return data;
}