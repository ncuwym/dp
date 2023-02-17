#!/bin/bash

# 定义变量
MYSQL_VERSION="mysql-5.7.35-linux-glibc2.12-x86_64"
MYSQL_PASSWORD="MyNewPass4!"
DATA_DIR="/data/mysql"
MYSQL_USER="mysql"
MYSQL_GROUP="mysql"
MYSQL_SERVICE="mysql.server"
MYSQL_SERVICE_PATH="/etc/init.d/${MYSQL_SERVICE}"
MD5SUMS_URL="https://dev.mysql.com/get/Downloads/MySQL-5.7/${MYSQL_VERSION}.tar.gz.md5"
MYSQL_PACKAGE_URL="https://dev.mysql.com/get/Downloads/MySQL-5.7/${MYSQL_VERSION}.tar.gz"

# 检查权限
check_permissions() {
  if [ "$(id -u)" != "0" ]; then
    echo "错误：该脚本必须以root权限运行" >&2
    exit 1
  fi
}

# 创建数据存储目录
create_data_dir() {
  if [ ! -d "$DATA_DIR" ]; then
    echo "创建数据存储目录：$DATA_DIR"
    mkdir -p "$DATA_DIR"
  fi
}

# 下载MySQL安装包
download_package() {
  echo "下载MySQL安装包：$MYSQL_VERSION"
  wget "$MD5SUMS_URL" "$MYSQL_PACKAGE_URL"
}

# 校验MySQL安装包的完整性
verify_package_integrity() {
  echo "校验MySQL安装包的完整性"
  echo "$(cat "${MYSQL_VERSION}.tar.gz.md5") ${MYSQL_VERSION}.tar.gz" | md5sum -c --quiet -
  if [ $? -ne 0 ]; then
    echo "错误：MySQL安装包已损坏或校验和不匹配。安装中止。"
    exit 1
  fi
}

# 解压MySQL安装包
extract_package() {
  echo "解压MySQL安装包"
  tar -zxvf "${MYSQL_VERSION}.tar.gz" -C /usr/local
  ln -s "/usr/local/${MYSQL_VERSION}" /usr/local/mysql
}

# 创建MySQL系统用户和用户组
create_user_and_group() {
  echo "创建MySQL系统用户和用户组"
  groupadd "$MYSQL_GROUP" || true
  useradd -r -g "$MYSQL_GROUP" -s /bin/false "$MYSQL_USER" || true
}

# 设置文件权限
set_permissions() {
  echo "设置文件权限"
  chown -R "$MYSQL_USER:$MYSQL_GROUP" /usr/local/mysql "$DATA_DIR"
  chmod -R 750 /usr/local/mysql "$DATA_DIR"
}

# 初始化MySQL数据目录
initialize_data_dir() {
  echo "初始化MySQL数据目录"
  set -e
  /usr/local/mysql/bin/mysqld --initialize-insecure --user="$MYSQL_USER" --datadir="$DATA_DIR"
}

# 启动MySQL服务
start_mysql_service() {
  echo "启动MySQL服务"
  "$MYSQL_SERVICE_PATH" start
  sleep 10
}

# 配置root用户的密码
configure_root_password() {
  echo "配置root用户的密码"
  /usr/local/mysql/bin/mysqladmin -u root password "${MYSQL_PASSWORD}"
