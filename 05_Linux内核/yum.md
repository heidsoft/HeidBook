#Linux Yum命令
##一. yum是什么
```
yum = Yellow dog Updater, Modified
主要功能是更方便的添加/删除/更新RPM包.
它能自动解决包的倚赖性问题.
它能便于管理大量系统的更新问题
注:为什么要使用yum而不用apt,最简单的原因,Fedora自带
```

##二. yum特点

*可以同时配置多个资源库(Repository)
*简洁的配置文件(/etc/yum.conf)
*自动解决增加或删除rpm包时遇到的倚赖性问题
*使用方便
*保持与RPM数据库的一致性

##三. yum安装

Fedora自带
#rpm -ivh yum-2.0.4-2.noarch.rpm

##四. yum配置

注:修改和增加配置文件中的资源库,加快下载速度和拥有更多可更新的rpm包
将/etc/yum.conf的内容全部替换为
[main]
cachedir=/var/cache/yum
debuglevel=2
logfile=/var/log/yum.log
pkgpolicy=newest
distroverpkg=fedora-release
tolerant=1
exactarch=1

[fedora-us-1]
name=Fedora Core 1 -- Fedora US mirror
baseurl=ftp://mirrors.kernel.org/fedora.us/fedora/fedora/1/i386/yum/os

[fedora-us-1-updates]
name=Fedora Core 1 updates -- Fedora US mirror
baseurl=ftp://mirrors.kernel.org/fedora.us/fedora/fedora/1/i386/yum/updates

[fedora-us-1-stable]
name=Fedora Linux (stable) for Fedora Core 1 -- Fedora US mirror
baseurl=ftp://mirrors.kernel.org/fedora.us/fedora/fedora/1/i386/yum/stable

[freshrpms]
name=Fedora Linux $releasever - $basearch - freshrpms
baseurl=http://ayo.freshrpms.net/fedora/linux/$releasever/$basearch/freshrpms


##五. yum应用
```
注:当第一次使用yum或yum资源库有更新时,yum会自动下载所有所需的headers放置于/var/cache/yum目录下,所需时间可能较长.

检查有哪些可更新的rpm包
#yum check-update

安装rpm包,使xmms可以播放mp3
#yum install xmms-mp3

安装mplayer,同时自动安装相关的软件
#yum install mplayer

删除licq包,同时删除与该包有倚赖性的包
#yum remove licq
注:同时会提示删除licq-gnome,licq-qt,licq-text,非常方便

系统更新(更新所有可以升级的rpm包,包括kernel)
#yum -y update

每天定期执行系统更新
#chkconfig yum on
#service yum start
```

##六. yum指令详解
```
*rpm包的更新

检查可更新的rpm包
#yum check-update

更新所有的rpm包
#yum update

更新指定的rpm包,如更新kernel和kernel source
#yum update kernel kernel-source

大规模的版本升级,与yum update不同的是,连旧的淘汰的包也升级
#yum upgrade


*rpm包的安装和删除

安装rpm包,如xmms-mp3
#yum install xmms-mp3

删除rpm包,包括与该包有倚赖性的包
#yum remove licq
注:同时会提示删除licq-gnome,licq-qt,licq-text


*yum暂存(/var/cache/yum/)的相关参数
清除暂存中rpm包文件
#yum clean packages

清除暂存中rpm头文件
#yum clean headers

清除暂存中旧的rpm头文件
#yum clean oldheaders

清除暂存中旧的rpm头文件和包文件
#yum clean 或#yum clean all
注:相当于yum clean packages + yum clean oldheaders


*rpm包列表

列出资源库中所有可以安装或更新的rpm包
#yum list

列出资源库中特定的可以安装或更新以及已经安装的rpm包
#yum list mozilla
#yum list mozilla*
注:可以在rpm包名中使用匹配符,如列出所有以mozilla开头的rpm包

列出资源库中所有可以更新的rpm包
#yum list updates

列出已经安装的所有的rpm包
#yum list installed

列出已经安装的但是不包含在资源库中的rpm包
#yum list extras
注:通过其它网站下载安装的rpm包


*rpm包信息显示(info参数同list)

列出资源库中所有可以安装或更新的rpm包的信息
#yum info

列出资源库中特定的可以安装或更新以及已经安装的rpm包的信息
#yum info mozilla
#yum info mozilla*
注:可以在rpm包名中使用匹配符,如列出所有以mozilla开头的rpm包的信息

列出资源库中所有可以更新的rpm包的信息
#yum info updates

列出已经安装的所有的rpm包的信息
#yum info installed

列出已经安装的但是不包含在资源库中的rpm包的信息
#yum info extras
注:通过其它网站下载安装的rpm包的信息


*搜索rpm包
搜索匹配特定字符的rpm包
#yum search mozilla
注:在rpm包名,包描述等中搜索

搜索有包含特定文件名的rpm包
#yum provides realplay
```

##七. 安全的更新freshrpms.net的rpm包
```
安装freshrpms.net的GPG key
#rpm --import http://freshrpms.net/packages/RPM-GPG-KEY.txt 

编辑/etc/yum.conf,增加以下信息到尾部
[freshrpms]
name=Fedora Linux $releasever - $basearch - freshrpms
baseurl=http://ayo.freshrpms.net/fedora/linux/$releasever/$basearch/freshrpms
gpgcheck=1

注: 
检查GPG Key
# rpm -qa gpg-pubkey*

显示Key信息
#rpm -qi gpg-pubkey-e42d547b-3960bdf1

删除Key
#rpm -e gpg-pubkey-e42d547b-3960bdf1 
```