# Vasil Strezov 213178
### 2. Control flow graph

![enter image description here](https://cdn.discordapp.com/attachments/989288324906758204/1112851385428475975/image.png)

### 3. Цикломатска комплексност:
	 
	
	 Ребра-јазли+2=11
	 Предикатни јазли + 1 = 11
     
### 4. Every Branch && 5. Multiple Condition
![enter image description here](https://cdn.discordapp.com/attachments/989288324906758204/1112889212514078831/image.png)
![enter image description here](https://cdn.discordapp.com/attachments/989288324906758204/1112791205026222080/image.png)
### Сите случаеви за исполнување на Every Branch критериумот во задачата:
* Ако одиме по првиот тест случај односно ако User или листата е null елемент тогаш ќе ја добиеме a-b-u патеката
* ако земеме името на корисникот да е нулти елемент, пасвордот да  го содржи името на корисникот тогаш одиме по патеката a-c-e-f-g.1-g.2-h-i-j-k-g.3-g.2-l-m-n-u
* ако земеме името на корисникот да е било што, пасвордот да не го содржи името на корисникот и да е поголемо од 8, и емаил на корисникот да не содржи @ ни . и пасвордот да содржи празно место тогаш одиме по патеката a-c-d-e-m-o-t-u
* ако земеме името на корисникот да е било што, пасвордот да не го содржи името на корисникот и да е поголемо од 8, и емаил на корисникот да содржи @ и . и пасвордот да не содржи празно место и да содржи специјални карактери тогаш одиме по патеката a-c-e-f-g.1-g.2-h-j-g.3-g.2-l-m-o-p.1-p.2-q-r-u
* ако земеме името на корисникот да е било што, пасвордот да не го содржи името на корисникот и да е поголемо од 8, и емаил на корисникот да содржи @ и . и пасвордот да не содржи празно место и да не содржи специјални карактери тогаш одиме по патеката a-c-e-f-g.1-g.2-h-j-g.3-g.2-l-m-o-p.1-p.2-q-p.3-p.2-s-t-u
### Multiple Condition критериум:
* ако внесеме корисникот да е нулти елемент  без пасворд и без емаил тогаш тоа е ТХХ случај во којшто одиме по a-b патеката
* ако внесеме корисникот да не е нулти елемент а не внесеме ни пасворд ни емаил за него тогаш тоа е FTХ случај во којшто одиме по a-b патеката
* ако внесеме корисникот да не е нулти елемент и внесеме пасворд без емаил тогаш тоа е FFT случај во којшто одиме по a-b патеката
* ако за сите 3 полиња внесеме податоци тогаш тоа е FFF случај во којшто ќе одиме по а-c патеката


	

