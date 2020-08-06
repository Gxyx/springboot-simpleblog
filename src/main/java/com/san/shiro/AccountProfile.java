package com.san.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 三七 on 2020/8/4.
 */

@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;

}

