package com.exapmple.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by kangminjeong on 2018. 3. 18..
 */
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Post {

    private Long id;
    private String title;
    private String content;
    private Long board_id;
    private Long user_id;
    private boolean report;
    private boolean good;
    private boolean bookmark;
}
