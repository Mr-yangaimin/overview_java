package com.example.test.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @ Author     ：yangaimin.
 * @ Date       ：Created in 16:15 2021/4/14
 * @ Description：其他参数省略，保留一个状态
 * @ Modified By：yangaimin
 * @Version: $version$
 */
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 2424461302335606937L;

    private Integer orderState;
}
