#Git最佳实践

#git协议配置修改
```
git config --local -e
url = git@github.com:username/repo.git
url = https://github.com/username/repo.git
```

#git禁止中文转码
```
git config --global core.quotepath false
git config core.quotepath false
```

# 恢复撤销篇

1、取消本地修改，恢复到上一次的commit
如果你的本地文件修改得一团乱，但是还没有提交，可以通过下面的命令恢复到上次提交时的状态( 其实就是恢复到上次的 commit，因此这次的本地修改自然没了）（注意是修改，不包括添加文件）

git reset --hard
这条命令将会取消掉本地的所有修改，恢复到上一次我们的commit信息
2、取消 git add 的文件
有时我们会不小心git add . 所有文件，想反悔，取消某些add的文件。那么可以(还原暂存区)

git reset HEAD xxxx
3、取消对文件的修改
如果觉得刚才对XX文件的修改没有必要，想要恢复，那么:

git checkout -- xxx
4、取消已经提交的修改
如果已经做了一个提交(commit),并且马上后悔了。那么可以创建一个新的提交，在新提交里撤销老的提交所做的修改
创建一个新的，撤销(revert)了前期修改的提交(commit)是很容易的。

git revert HEAD
这样就创建了一个撤销了上次提交(HEAD)的新提交

gir revert HEAD^
撤销上上次
5、Tips
回滚到某一次 commit
git reset --hard aa89cd6bcc
这样会回滚到某个commit状态，只要知道commit id 就可以
回滚后反悔怎么办？
git reflog 记录了我们的每一次命令（ commit、merge 等信息）
根据这命令来查出我们的历史 commit id，然后 git reset即可
HEAD指向的版本就是当前版本，因此，Git允许我们在版本的历史之间穿梭，使用命令git reset –hard commit_id。
穿梭前，用git log可以查看提交历史，以便确定要回退到哪个版本。
要重返未来，用git reflog查看命令历史，以便确定要回到未来的哪个版本。
场景1：当你改乱了工作区某个文件的内容，想直接丢弃工作区的修改时，用命令git checkout – file。
场景2：当你不但改乱了工作区某个文件的内容，还添加到了暂存区时，想丢弃修改，分两步，第一步用命令git reset HEAD file，就回到了场景1，第二步按场景1操作。
6. 取消已经 push 的行为（重建分支）
# 备份到另一分支，以防万一
git branch old_master

# 推送备份分支
git push origin old_master:old_master

# 本地仓库回退到某一版本
git reset -hard xxxx

# 删除远程分支
git push origin :master

# 推送本地还原后的分支
git push origin master
6. 取消已经 push 的行为（强制 PUSH）
# 本地仓库回退到某一版本
git reset -hard xxxx

# 强制 PUSH，此时远程分支已经恢复成指定的 commit 了
git push origin master --force


##Git统计提交次数
```
git shortlog -s //显示提交作者
-s 参数省略每次commit 的注释，仅仅返回一个简单的统计。
-n 参数按照commit 数量从多到少的顺利对用户进行排序

heidsoftdeMacBook-Air:cmdb heidsoft$ git shortlog -n -s
   591  heidsoft
   174  han
   160  hanjiuzhou
   130  yuyangyang
    85  root
    56  itnihao
    35  heidsoft@sina.com
     6  jiuzhou.han
     2  韩木木
     2  yangyangyu
     2  zhaosong.wu
     1  OneOaaS
git shortlog -n -s 提交次数统计
git rev-list --all --count //提交总数
```

##添加上游仓库
```
创建原始代码库的别名，方便跟踪代码 
git remote add upstream git://github.com/octocat/Spoon-Knife.git 
git remote add upstream https://github.com/docker/docker.git
git remote add upstream https://github.com/GoogleCloudPlatform/kubernetes.git
git remote add upstream https://github.com/docker/docker-registry.git
跟踪原始代码 
git fetch upstream 
提交代码更新到自己的代码库 
git push origin master 

获取原始代码库的更新 
git fetch upstream 
git merge upstream/master 
如果你希望将自己的代码贡献到原始代码库中，可参见http://help.github.com/send-pull-requests/ 来完成

docker 提交签字
Signed-off-by: heidsoft <heidsoft@qq.com>

Please sign your commits following these rules:
https://github.com/docker/docker/blob/master/CONTRIBUTING.md#sign-your-work
The easiest way to do this is to amend the last commit:

$ git clone -b "master" git@github.com:OnePaaS/docker.git somewhere
$ cd somewhere
$ git rebase -i HEAD~2
editor opens
change each 'pick' to 'edit'
save the file and quit
$ git commit --amend -s --no-edit
$ git rebase --continue # and repeat the amend for each commit
$ git push -f
```

##Git回退
```
git rebase ：顾名思义，就是重新定义（re）起点（base）的作用，即重新定义分支的版本库状态。

提交一下
git commit -m "commit log"

主干上创建开发分支
git checkout -b develop master

切换到master
git checkout master

合并开发分支到master
git merge --no-ff develop

在开发分支上创建一个特性分支
git checkout -b feature-x develop

将提交回退到某个点
git reflog 
git reset --hard 62c3f60

git删除远程分支
git push origin :develop

查看远程分支
git branch -a
git branch -av
删除远程分支和tag
git push origin --delete <branchName>
git push origin :<branchName>
```

#git的tag操作
```
方法一:
git push origin --delete tag <tagname>
方法二:
git tag -d <tagname>
git push origin :refs/tags/<tagname>

git push origin --delete tag alarm-v1.0.0.20151217

查看远程状态
git remote show origin
git remote prune origin
git fetch -p  它在fetch之后删除掉没有与远程分支对应的本地分支

重命名本地分支：
git branch -m devel develop

把本地tag推送到远程
git tag -a easycloud-v20160219 -m 'easycloud-v20160219'
git push --tags
git fetch origin tag <tagname>


如果你的 tag 名是 1.0，可以按照如下方式导出。
1. 导出并压缩为 zip 格式:
$ git archive --format=zip --output=easycloud-20160302.zip easycloud-20160302
2. 导出并压缩为 tar.bz2 格式:
$ git archive 1.0 | bzip2 > v1.0.tar.bz2
3. 导出并压缩为 tar.gz 格式:
$ git archive --format=tar 1.0 | gzip > v1.0.tar.gz


使用 git tag 命令来添加新标签 
git tag -a v1.4 -m 'version 1.4' 
使用 git push 命令来将标签推送到远程仓库 
git push origin v1.4:v1.4


git shortlog -s //显示提交作者
-s 参数省略每次commit 的注释，仅仅返回一个简单的统计。
-n 参数按照commit 数量从多到少的顺利对用户进行排序

git rev-list --all --count //提交总数


git push 单个tag
push单个tag，命令格式为：git push origin [tagname]
push所有tag，命令格式为：git push [origin] --tags
```

##git merge --no-ff
```
Fast-Forward

当前分支合并到另一分支时，如果没有分歧解决，就会直接移动文件指针。这个过程叫做fastforward。

举例来说，开发一直在master分支进行，但忽然有一个新的想法，于是新建了一个develop的分支，并在其上进行一系列提交，完成时，回到 master分支，此时，master分支在创建develop分支之后并未产生任何新的commit。此时的合并就叫fast forward。

示例：

1. 新建一个work tree，在master中做几次commit
2. 新建develop的branch，然后再做多次commits

此时的分支流图如下(gitx)：
正常合并

(master)$ git merge develop 
Updating 5999848..7355122
Fast-forward
c.txt |    1 +
d.txt |    1 +
2 files changed, 2 insertions(+), 0 deletions(-)
create mode 100644 c.txt
create mode 100644 d.txt

可以看出这是一次fast-forward式的合并，且合并完之后的视图为扁平状，看不出develop分支开发的任何信息。

使用–no-ff进行合并

—no-ff (no fast foward)，使得每一次的合并都创建一个新的commit记录。即使这个commit只是fast-foward，用来避免丢失信息。

(master)$ git merge –no-ff develop
Merge made by recursive.
c.txt | 2 +-
d.txt | 2 +-
2 files changed, 2 insertions(+), 2 deletions(-)

可以看出，使用no-ff后，会多生成一个commit 记录，并强制保留develop分支的开发记录（而fast-forward的话则是直接合并，看不出之前Branch的任何记录）。这对于以后代码进行分析特别有用，故有以下最佳实践。

好的实践

–no-ff，其作用是：要求git merge即使在fast forward条件下也要产生一个新的merge commit。此处，要求采用–no-ff的方式进行分支合并，其目的在于，希望保持原有“develop branches”整个提交链的完整性。
```
