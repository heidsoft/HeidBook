#chef

``

chef-server-ctl reconfigure
chef-server-ctl user-create heidsoft heid soft heidsoft@qq.com '123456' --filename /opt/stevedanno.pem
chef-server-ctl org-create heidsoft 'heidsoft.com' --association_user heidsoft --filename /opt/heidsoft-validator.pem
chef-server-ctl install chef-manage
chef-server-ctl reconfigure
chef-manage-ctl reconfigure

``