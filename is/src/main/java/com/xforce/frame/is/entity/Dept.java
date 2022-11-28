package com.xforce.frame.is.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 科室
 * </p>
 *
 * @author Alex
 * @since 2022-11-25
 */
@Data
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 科室名称
     */
    private String deptname;


}
