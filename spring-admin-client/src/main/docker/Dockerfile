# IMAGES REPOSITORY   
# DESCRIPTION         安装spring-admin-client相关环境
# VERSION             0.0.1

# 指定基础镜像
FROM registry.cn-hangzhou.aliyuncs.com/luliangwei/alpine:java8

# 指定镜像创建者和联系方式
MAINTAINER luliangwei luliangwei1874@163.com

# 环境变量定义
ENV SERVER_SERVICE              spring-admin-client
ENV SERVER_VERSION              1.0.0-SNAPSHOT
ENV SERVER_PROFILE              dev
ENV SERVER_REPOS                public-snapshots
ENV SERVER_CONTEXT              /
ENV SERVER_TYPE                 jar
ENV SERVER_ROOT_HOME            /usr/local/bin/${SERVER_SERVICE}
#ENV SERVER_BIN                  ${SERVER_ROOT_HOME}/${SERVER_SERVICE}.${SERVER_TYPE}
ENV SERVER_BIN                  ${SERVER_ROOT_HOME}/${SERVER_SERVICE}-${SERVER_VERSION}.${SERVER_TYPE}
ENV SERVER_DEFAULT_PORT         1025
ENV SERVER_DEFAULT_SSL_PORT     41025

# 添加独立的外部文件,s6-overlay提供的一个运行的文件夹下
ADD ./src/main/docker/run /etc/services.d/${SERVER_SERVICE}/

RUN mkdir -p ${SERVER_ROOT_HOME}

# 将jar包复制到容器内（这种做法不好），实际生产中应该从nexus库中取
ADD ./target/${SERVER_SERVICE}-${SERVER_VERSION}.jar ${SERVER_ROOT_HOME}

# 给run文件执行权限
RUN chmod +x /etc/services.d/${SERVER_SERVICE}/run

#需要暴露的端口
EXPOSE ${SERVER_DEFAULT_PORT}
