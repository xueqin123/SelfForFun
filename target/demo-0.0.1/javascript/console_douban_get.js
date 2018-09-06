/**
 * Created by qinxue on 2018/7/23.
 * 豆瓣接口封装
 */
//定义模块(依赖的其他模块，本模块的导出，)
//豆瓣API
var DOUBAN_API = "https://api.douban.com"
var IN_THEATERS = "/v2/movie/in_theaters"; //正在上映
define(function (require, exports, module) {
    //导出方法
    exports.getInTheatersMovies = getInTheatersMovies;
    // var changeText = require('changeText'); 可以导入其他js文件
})

function getInTheatersMovies(callback) {
    getFromDouBanServer(DOUBAN_API + IN_THEATERS, callback.success, callback.error);
}

function getFromDouBanServer(api, success, error) {
    get(api, success, error);
}

function get(api, success, error) {
    $.ajax({
        url: api,
        type: "GET",
        dataType: "jsonp",
        success: success,
        error: error
    });
}
