package com.qinxue.movie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ConsoleMovieController {
    private static final Logger logger = LoggerFactory.getLogger(ConsoleMovieController.class);

    @RequestMapping(value = "/douban/movie/saveInTheatersMovies.console", method = RequestMethod.GET)
    String saveInTheatersMovies(final HttpServletRequest request, HttpServletResponse response) {
        return "json";
    }
}


