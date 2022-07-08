sudo rpm --import https://repo.saltproject.io/py3/redhat/8/x86_64/latest/SALTSTACK-GPG-KEY.pub

curl -fsSL https://repo.saltproject.io/py3/redhat/8/x86_64/latest.repo | sudo tee /etc/yum.repos.d/salt.repo

ls /etc/yum.repos.d/

yum clean all


yum -y install salt-master salt-minion


sed -i '/^#master:/a master: 119.29.143.106' /etc/salt/minion
sed -n '/^master/p' /etc/salt/minion

systemctl enable --now salt-master.service

systemctl enable --now salt-minion.service 

ss -antl


