package com.pettyfox.maven.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>Copyright: Copyright (c) 2022</p>
 * <p>Description: Created by Petty Fox on 2022/1/14</p>
 * <p></p>
 *
 * @author Petty Fox
 */
@SpringBootApplication
@ComponentScan({"com.pettyfox.maven"})
public class BootServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootServiceApplication.class, args);
    }

}
