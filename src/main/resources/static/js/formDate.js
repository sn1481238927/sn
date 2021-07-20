//格式：yyyy-MM-dd HH:mm:ss
function formatDate1(value) {// 时间戳转换日期格式方法
    if (value == null) {
        return '';
    } else {
        let date = new Date(value);
        let y = date.getFullYear();// 年
        let MM = date.getMonth() + 1;// 月
        MM = MM < 10 ? ('0' + MM) : MM;
        let d = date.getDate();// 日
        d = d < 10 ? ('0' + d) : d;
        let h = date.getHours();// 时
        h = h < 10 ? ('0' + h) : h;
        let m = date.getMinutes();// 分
        m = m < 10 ? ('0' + m) : m;
        let s = date.getSeconds();// 秒
        s = s < 10 ? ('0' + s) : s;
        return y + '-' + MM + '-' + d + ' ' + h + ':' + m + ':' + s;
    }
}

//格式：yyyy-MM-dd
function formatDate2(value) {// 时间戳转换日期格式方法
    if (value == null) {
        return '';
    } else {
        let date = new Date(value);
        let y = date.getFullYear();// 年
        let MM = date.getMonth() + 1;// 月
        MM = MM < 10 ? ('0' + MM) : MM;
        let d = date.getDate();// 日
        d = d < 10 ? ('0' + d) : d;
        return y + '-' + MM + '-' + d;
    }
}