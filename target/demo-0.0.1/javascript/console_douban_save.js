
/**
 * 保存到Server
 */


//ServerAPI
var SAVE_IN_THEATER_MOVIES = "/douban/movie/saveInTheatersMovies.console";
saveInTheatersMoviesToSever = function () {
    $.post(SAVE_IN_THEATER_MOVIES, json,
        function (data, status) {
            alert("Data: " + data + "\nStatus: " + status);
        });
};
