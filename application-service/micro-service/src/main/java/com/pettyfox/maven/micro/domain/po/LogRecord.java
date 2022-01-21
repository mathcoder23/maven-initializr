package com.pettyfox.maven.micro.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * <p>Copyright: Copyright (c) 2022</p>
 * <p>Description: Created by Petty Fox on 2022/1/21</p>
 * <p></p>
 *
 * @author Petty Fox
 */
@Getter
@Setter
public class LogRecord {

    @TableId(value = "id", type = IdType.AUTO)
    protected Integer id;

    private String content;

    private Date createTime;
}
