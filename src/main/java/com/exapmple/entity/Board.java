package com.exapmple.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by kangminjeong on 2018. 3. 18..
 */
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Data
public class Board {

    private Long id;
    private String name;
    private Long user_id;
}
