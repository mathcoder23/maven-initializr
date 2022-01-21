# maven-initializr 简介
将日常的项目开发抽象成模板化，为了能够更快速的开发

# 构建
```shell
mvn archetype:create-from-project
```

# 安装
```shell
mvn install
```

# 模板使用方法
## IDEA中使用

# 框架模板

## spring-boot-framework
提供一个基于Spring Boot开发的后端工程模板，在新建项目时引用

- groupId: com.pettyfox.maven
- artifactId: spring-boot-framework-archetype
- version: 1.0.0

### 版本更新日志
### 1.0.0
- feat: 初始化整个项目工程模板，提供简单的模板框架

## micro-service
提供在application-service新建的模块，这是一个单独可以启动的
Spring Boot工程

- groupId: com.pettyfox.maven
- artifactId: micro-service-archetype
- version: 1.0.0