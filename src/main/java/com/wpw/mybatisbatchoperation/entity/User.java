package com.wpw.mybatisbatchoperation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wpw
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Accessors(chain = true)
public class User implements Serializable {
    private Integer id;
    private String userName;
    private String passWord;
    private Integer age;
}
