<!--配置seajs 加载-->
seajs.config({
    alias: {
        'console_douban_get': '../javascript/console_douban_get.js'
    }
});
// user(文件，方法) （文件别名，回调(参数为回调结果)）
seajs.use(['console_douban_get'], function (console_douban_get) {
    $('#get_in_theaters_movies').on('click', getInTheatersMoviesClick)
});

function getInTheatersMoviesClick() {
    console_douban_get.getInTheatersMovies({
        success: function (data, status) {
            root = eval(data);
            console.log(root.count);
        },
        error: function (data, status) {

        }
    });
}







