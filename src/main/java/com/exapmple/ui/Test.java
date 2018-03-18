package com.exapmple.ui;

import com.exapmple.entity.Board;
import com.exapmple.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kangminjeong on 2018. 3. 18..
 */
public class Test {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1L, "강민정"));
        users.add(new User(2L, "강민정"));
        users.add(new User(3L, "강민정"));


        List<Board> board = new ArrayList<>();
        board.add(new Board(1L, "게시판1", 1L));
        board.add(new Board(2L, "게시판2", 2L));
        board.add(new Board(3L, "게시판3", 3L));
        board.add(new Board(4L, "게시판4", 1L));

        System.out.println("board = " + board);
    }
}
