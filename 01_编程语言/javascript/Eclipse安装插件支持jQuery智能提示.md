����������õ�jQuery���,��Ҫ��װeclipse�������֧��jQuery������ʾ,������������һ��,���õ����������֧��jQuery��������ʾ:
1.jQueryWTP
2.Spket
3.Aptana 

 

�ڰ�װ���֮ǰ��Ҫ�Ȱ�װeclipse,����Ѿ���װ��eclipse,����ֱ�ӿ�����Ĳ����װ����,����ʹ�õ�Fedora 12,��������:
1.ֱ�Ӵ򿪡�Ӧ�ó���-->��ϵͳ���ߡ�-->���նˡ�
2.�������su��,�����������ʱ�л���root�û�
3.����root�û�������
4.�������yum install eclipse��
5.��װ�ɹ���,�Ϳ����ڡ�Ӧ�ó���-->����̡�-->��eclipse��,�򿪲鿴�汾Ϊeclipse 3.5.1,��ȻҲ����ֱ�����ذ�װ,����Ͳ���ϸ˵��,��װ��Ϻ�Ϳ��԰�װ��ز����.

 

���·ֱ������������İ�װ����:
һ��jQueryWTP�İ�װ����(�ٷ�):
step1:download jqueryWTP_version.jar
step2:find you Eclipse Plugin org.eclipse.wst.javascript.ui_xxxxxxx.jar,backup the plugin.
step3:double click the jar file or run with command java -jar jqueryWTP.version.jar
step4:on the opened swing UI,choose org.eclipse.wst.javascript.ui_xxxxxxx.jar,and output dir.
step5:click generate button.
step6:replace old org.eclipse.wst.javascript.ui_xxxxxxx.jar file with the generated file.
step7:restart eclipse.
step8:open a html file,edit js content. 

jQueryWTP�����Ŀ����ҳ:http://www.langtags.com/jquerywtp/
����������jqueryWTP0.31foCN.jar��,���ݰ�װ�̳��ﶼ�ᵽ��һ��pluginĿ¼�µ�org.eclipse.wst.javascript.ui_xxxxxxx.jar�ļ��������ҵ�eclipseĿ¼��ѹ�����Ҳ�������ļ�,����ҲҪ�Ͳ���ʹ��jQueryWTP���������ʾ.

������ϸ�鿴jQueryWTP�����Ŀ����ҳ,����ôһ�仰,Eclipse��WTP֧��Javascript�Ĵ��벹ȫ����,���Ǻܼ򵥣����Ҳ�֧��jQuery,jQueryWTP��Ŀ�ľ�����Eclipse WTP֧��jQuery,��Ҫ˵�����Ǹò������MyEclipse�Ȼ���Eclipse WTP�Ĺ���Ҳ��֧�ֵ�.
������仰���Բ����Ҳ���pluginĿ¼�µ�org.eclipse.wst.javascript.ui_xxxxxxx.jar�ļ���ԭ��,������û�а�װeclipse WTP���,�����������ַ���˳����װ����֧��jQuery������ʾ,��������Ĳ��뻹û�о�����֤.

 

����Spket�İ�װ���������ַ�ʽ���� 
1.���߰�װ��Help->Install New Software...->Add...->Name: "Spket",
Location:http://www.spket.com/update/ �����������Eclipse.
2.�ֶ���װ����http://www.spket.com/download.html���� Plugin �汾����ǰ�汾Ϊ1.6.17.���ؽ�ѹ��ֱ�ӷ�����Eclipse��dropinsĿ¼�£�����Eclipse. 
3.����jQuery�ļ�����Ҫ���ؿ����汾��. 
4.����spket ,Window -> Preferences -> Spket -> JavaScript Profiles -> New,���롰jQuery�����OK�� ѡ��jQuery�� �������Add Library��Ȼ������������ѡȡ��jQuery���� ѡ�� ��jQuery���������Add File����Ȼ��ѡ�������ص�jQuery.js �ļ������Default; 
5.����js�򿪷�ʽ(��һ������Ҫ,�����õĻ�,Ҳ������jQuery��������ʾ), Window -> Preferences ->General-> Editors-> File Associations-> ѡ��*.js,��Spket JavaScript Editor��ΪDefault�� 
6.�½�һ��js�ļ���jQuery�Զ���ʾ����

 

����Aptana�İ�װ����:
Aptana�İ�װ��ԱȽϼ�,ֱ�Ӱ�װ��Ͼ�֧��jQuery��������ʾ,����������ʾ����Ҳ�Ƚ�ǿ��,��������İ�װ����ʹ��,ǿ�ҽ����ѧ�߿���ʹ�����ַ�����װ:
1.���߰�װ��Help->Install New Software...->Add...->Name: "Aptana",
Location:http://download.aptana.com/tools/studio/plugin/install/studio�����������Eclipse,Aptana�����װ�ɹ�,֧��javascript������ʾ����,������֧��jQuery������ʾ,��Ҫ�ٰ�װ֧��jQuery������ʾ�Ĳ��.
2.Window->My Studio��Aptana����ҳ,������ҳ�����Plugins,ѡ��Ajax�����jQuery Support,����Get It���ɰ�װjQuery������ʾ�Ĳ��
