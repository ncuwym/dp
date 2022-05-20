#！/bin/bash
#腾讯云k3s替换docker运行时，自动安装替换
#安装包管理工具
yum -y install yum-utils  
#添加国内源
yum-config-manager --add-repo https://mirrors.aliyun.com/docker-ce/linux/centos/docker-ce.repo  
#获取安装包
yum -y install https://mirrors.aliyun.com/docker-ce/linux/centos/7/x86_64/stable/Packages/containerd.io-1.2.13-3.1.el7.x86_64.rpm  
#安装
dnf  install docker-ce  -y
#启动docker
systemctl start docker 
#开机自启动
systemctl enable docker  
docker -v
#修改文件  在最后一行的末尾追加这段内容
sed  -i '$s/$/&  --docker --no-deploy traefik/'   /etc/systemd/system/multi-user.target.wants/k3s.service
#重载配置文件
systemctl daemon-reload
#重启k3s
systemctl restart k3s
 